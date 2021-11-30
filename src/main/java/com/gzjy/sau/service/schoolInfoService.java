package com.gzjy.sau.service;

import com.gzjy.sau.model.schoolInfo;

import java.util.List;

public interface schoolInfoService {


    /**
     * 调用Mapper接口查询所有公告
     * @return
     */
    public List<schoolInfo> queryAll();

}
