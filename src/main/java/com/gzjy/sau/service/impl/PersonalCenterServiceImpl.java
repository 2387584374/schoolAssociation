package com.gzjy.sau.service.impl;

import com.gzjy.sau.model.User;
import com.gzjy.sau.service.PersonalCenterService;
import com.gzjy.sau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalCenterServiceImpl implements PersonalCenterService {

    @Autowired
    private UserService userService;

    @Override
    public User queryInfo(String name) {

        User user = userService.queryUser(name);

        return user;
    }
}
