package com.beaven.spring.demo.controller;

import com.beaven.spring.demo.domain.User;
import com.beaven.spring.demo.service.ServiceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author tingw
 * @date 2018/06/11 11:16
 */
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ServiceManager serviceManager;

    @Autowired
    public HelloController(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @RequestMapping("/hello")
    public String index() {
        logger.info("--request index method,return {}", "hello world");
        return "Hello World";
    }

    @RequestMapping("/time")
    public String time() {
        return new Date().toString();
    }

    @RequestMapping("/user")
    public List<User> provideUser() {
        return serviceManager.findUserAll();
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public Boolean saveUser(String name, int age) {
        return serviceManager.saveUser(name, age);
    }
}
