package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.UserMapper;
import com.gzjy.sau.model.User;
import com.gzjy.sau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userServiceImpl")
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User queryUser(String username) {

        User user = userMapper.queryUser(username);

        if(user != null){

            return user;
        }

        return null;
    }

    @Override
    public void userSave(User user) {


        userMapper.addUser(user);

    }
}
