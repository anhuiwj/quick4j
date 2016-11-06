package com.eliteams.weixin.controller;

import com.eliteams.quick4j.web.util.WechatUtil;
import com.eliteams.weixin.util.WeixinUserManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangjie on 16/10/26.
 */
@Controller
@RequestMapping("/user")
public class MyWechatController {
    private static Logger logger = Logger.getLogger(MyWechatController.class);

    private WeixinUserManager weixinUserManager;

    @ResponseBody
    @RequestMapping("/index")
    public String excute(HttpServletRequest request){
        String result="";
        try{
            WechatUtil myWechat = new WechatUtil(request);
            result = myWechat.execute();
        }catch (Exception e){
            logger.info(e);
        }
        return result;
    }
    public static void main(String[] args){
    }
}

