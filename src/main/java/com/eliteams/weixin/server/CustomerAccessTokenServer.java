package com.eliteams.weixin.server;

import org.sword.wechat4j.token.Token;
import org.sword.wechat4j.token.server.CustomerServer;

/**
 * Created by wangjie on 16/10/28.
 */
public class CustomerAccessTokenServer extends CustomerServer {
    @Override
    public boolean save(Token token) {
        System.out.print(token.getToken());
        return true;
    }

    @Override
    protected String find() {
        return null;
    }
}
