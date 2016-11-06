package com.eliteams.quick4j.web.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangjie on 16/10/26.
 */
@Controller
@RequestMapping(value = "/sys/menu")
public class MenuController {
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }
}
