package com.beaven.spring.demo.domain;

import com.beaven.spring.demo.domain.bean.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wangpeifeng
 * @date 2018/06/11 11:36
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    List<User> findByAgeBefore(int age);
}
