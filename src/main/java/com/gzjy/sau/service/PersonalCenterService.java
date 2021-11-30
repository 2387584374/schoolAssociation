package com.gzjy.sau.service;

import com.gzjy.sau.model.User;

public interface PersonalCenterService {


    /**
     * 调用mapper层查询用户信息
     * @param name 传入账号
     * @return 用户信息实体
     */
    public User queryInfo(String name);



}
