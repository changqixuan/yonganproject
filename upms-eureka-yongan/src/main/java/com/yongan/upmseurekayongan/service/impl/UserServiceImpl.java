package com.yongan.upmseurekayongan.service.impl;

import com.yongan.upmseurekayongan.entity.User;
import com.yongan.upmseurekayongan.mapper.UserMapper;
import com.yongan.upmseurekayongan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userlist() {
        return userMapper.userlist();
    }
}
