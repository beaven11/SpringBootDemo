package com.beaven.spring.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Author: wangpeifeng
 * Date: 2018/06/11 11:36
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    List<User> findByAgeBefore(int age);
}
