package com.gzjy.sau.service;


import com.gzjy.sau.model.User;
import org.springframework.stereotype.Service;



public interface UserService {


    /**
     * 通过用户名查询该用户账号
     * @param username 传入用户名
     * @return 返回该用户实体   返回null则没有该用户
     */
    public User queryUser(String username);

    /**
     * 用户注册
     * @param user 用户传入实体
     */
    public void userSave(User user);
}
