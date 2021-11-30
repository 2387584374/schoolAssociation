package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.SchoolInfoMapper;
import com.gzjy.sau.model.schoolInfo;
import com.gzjy.sau.service.schoolInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolInfoServiceImpl implements schoolInfoService {

    @Autowired
    private SchoolInfoMapper schoolInfoMapper;

    @Override
    public List<schoolInfo> queryAll() {

        List<schoolInfo> schoolInfos = schoolInfoMapper.queryAll();

        return schoolInfos;
    }
}
