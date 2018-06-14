package com.beaven.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tingw
 * @date 2018/06/14 14:23
 */
@Controller
@RequestMapping("/web")
public class ThymeleafController {

    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("desc", "this is desc");
        return "index";
    }

}
