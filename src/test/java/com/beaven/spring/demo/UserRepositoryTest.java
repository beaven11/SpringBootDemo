package com.beaven.spring.demo;

import com.beaven.spring.demo.domain.User;
import com.beaven.spring.demo.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Author: wangpeifeng
 * Date: 2018/06/11 11:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        List<User> userList = userRepository.findByAgeBefore(15);
        userList.forEach(
                user -> System.out.println(user.toString())
        );
    }
}
