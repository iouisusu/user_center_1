package com.example.user_center;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void textmd5(){
        String newpassword = DigestUtils.md5DigestAsHex(("abcd" + "password").getBytes(StandardCharsets.UTF_8));
        System.out.println(newpassword);
    }

    @Test
    void contextLoads() {
    }

}
