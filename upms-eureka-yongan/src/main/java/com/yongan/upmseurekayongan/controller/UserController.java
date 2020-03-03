package com.yongan.upmseurekayongan.controller;

import com.yongan.upmseurekayongan.entity.User;
import com.yongan.upmseurekayongan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userlist")
    public List<User> userlist(){
        return userService.userlist();
    }

}
