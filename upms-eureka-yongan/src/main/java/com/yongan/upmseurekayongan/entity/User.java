package com.yongan.upmseurekayongan.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer user_id;
    private String username;
    private String password;
    private String nickname;
    private Date birthday;
    private String email;
    private Integer telephone;
    private String sex;
    private Integer status;
    private String buy_insurance;



}
