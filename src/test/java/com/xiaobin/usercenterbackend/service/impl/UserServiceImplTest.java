package com.xiaobin.usercenterbackend.service.impl;

import com.xiaobin.usercenterbackend.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author hongxiaobin
 * @Time 2023/2/26-18:43
 */
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    void test() {
        String userAccount = "xiaobin++";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        System.out.println(result);
        // Assertions.assertEquals(3, result);
    }

    @Test
    void testLogin(){
        String userAccount = "xiaobin";
        String userPassword = "12345678";
        // userService.userLogin(userAccount,userPasswordword);
    }
}