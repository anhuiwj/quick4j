package com.eliteams.weixin.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.sword.lang.HttpUtils;
import org.sword.wechat4j.exception.WeChatException;
import org.sword.wechat4j.message.CustomerMsg;
import org.sword.wechat4j.response.ArticleResponse;
import org.sword.wechat4j.token.TokenProxy;
import org.sword.wechat4j.user.UserManager;
import org.sword.wechat4j.util.WeChatUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjie on 16/10/25.
 */
public class WeixinUserManager extends UserManager{
    static Logger  logger = Logger.getLogger(UserManager.class);
    private  static String accessToken = TokenProxy.accessToken();
    public static List<Object> getUsers(){
        String resultStr = HttpUtils.post("https://api.weixin.qq.com/cgi-bin/user/get?access_token=" + accessToken);
        logger.info("return data " + resultStr);

        try {
            WeChatUtil.isSuccess(resultStr);
        } catch (WeChatException var4) {
            logger.error(var4.getMessage());
            var4.printStackTrace();
            return null;
        }
        JSONObject jsonObject = JSONObject.parseObject(resultStr);
        List groups = JSON.parseArray(jsonObject.getJSONObject("data").getString("openid"));
        return groups;
    }
    @Test
    public void sendMsg(){
        logger.info("主动发送消息demo");
        //获得关注者列表，发送给第一个人消息
        WeixinUserManager userManager = new WeixinUserManager();
		List<Object> userList = userManager.getUsers();
        List<ArticleResponse> items=new ArrayList<>();
        for(int i=userList.size()-1;i>=0;i--){
            ArticleResponse articleResponse= new ArticleResponse();
            articleResponse.setTitle("测试");
            articleResponse.setDescription("测试123");
            articleResponse.setPicUrl("http://b.hiphotos.baidu.com/baike/c0%3Dbaike180%2C5%2C5%2C180%2C60/sign=ca5abb5b7bf0f736ccf344536b3cd87c/29381f30e924b899c83ff41c6d061d950a7bf697.jpg");
            articleResponse.setUrl("http://www.cnblogs.com/txw1958/p/weixin-97-news.html");
            items.add(articleResponse);
        }
        for(int i=userList.size()-1;i>=0;i--){
            String toUserOpenId = userList.get(i).toString();
            CustomerMsg customerMsg = new CustomerMsg(toUserOpenId);
            customerMsg.sendNews(items);
        }
    }
}
