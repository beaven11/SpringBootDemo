package com.beaven.spring.demo.controller;

import com.beaven.spring.demo.config.ResponseException;
import com.beaven.spring.demo.domain.bean.ResponseResult;
import com.beaven.spring.demo.domain.bean.db.User;
import com.beaven.spring.demo.service.ServiceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/hello")
    public String index() {
        logger.info("--request index method,return {}", "hello world");
        return "Hello World";
    }

    @GetMapping("/time")
    public String time() {
        return new Date().toString();
    }

    @GetMapping("/user")
    public List<User> provideUser() {
        return serviceManager.findUserAll();
    }

    @PostMapping(value = "/user/save")
    public Boolean saveUser(String name, int age) {
        return serviceManager.saveUser(name, age);
    }

    @GetMapping("/test/{id}")
    public ResponseResult<String> error(@PathVariable("id") String id) {
        if ("test".equals(id)) {
            throw new ResponseException(400, "id is test");
        }
        return ResponseResult.success("test success");
    }
}
