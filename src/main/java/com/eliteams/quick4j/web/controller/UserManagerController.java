package com.eliteams.quick4j.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjie on 16/10/28.
 */
@Controller
@RequestMapping("/user/manager")
public class UserManagerController {

    @RequestMapping("/index")
    public String index(){
        return "user/userList";
    }
}
