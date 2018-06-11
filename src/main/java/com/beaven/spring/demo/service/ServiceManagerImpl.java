package com.beaven.spring.demo.service;

import com.beaven.spring.demo.domain.User;
import com.beaven.spring.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: wangpeifeng
 * Date: 2018/06/11 12:38
 */
@Service
public class ServiceManagerImpl implements ServiceManager {

    private final UserRepository userRepository;

    @Autowired
    public ServiceManagerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findUserAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean saveUser(String name, int age) {
        try {
            userRepository.save(new User(name, age));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
