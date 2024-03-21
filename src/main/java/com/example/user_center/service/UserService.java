package com.example.user_center.service;

import com.example.user_center.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 86156
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-03-14 16:40:20
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 用户确认密码
     * @param planetCode 校验id
     * @return 返回用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request session加入
     * @return 返回用户脱敏信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱密
     * @param originUser 裸用户数据
     * @return 脱敏的用户数据
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request session清除
     * @return 状态
     */
    int userLogout(HttpServletRequest request);
}
