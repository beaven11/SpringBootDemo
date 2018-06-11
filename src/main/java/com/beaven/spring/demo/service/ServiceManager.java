package com.beaven.spring.demo.service;

import com.beaven.spring.demo.domain.User;

import java.util.List;

/**
 * Author: wangpeifeng
 * Date: 2018/06/11 12:38
 */
public interface ServiceManager {

    List<User> findUserAll();

    boolean saveUser(String name, int age);
}