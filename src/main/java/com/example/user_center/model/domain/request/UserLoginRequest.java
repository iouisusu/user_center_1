package com.example.user_center.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @version 1.0
 * @Author YJH
 * @Date 2024/3/15 10:00
 * @注释
 */
@Data
public class UserLoginRequest implements Serializable {

    public static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;



}
