package com.example.user_center.service;
import java.util.Date;

import com.example.user_center.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @version 1.0
 * @Author YJH
 * @Date 2024/3/14 16:55
 * @注释
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("test1");
        user.setUserAccount("123");
        user.setAvatarUrl("https://baomidou.com/img/logo.svg");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);

    }

    @Test
    void userRegister() {
        String userAccount = "yupi";
        String userPassword = "123456789";
        String checkPassword = "123456789";
        String planetCode = "123";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);

    }
}