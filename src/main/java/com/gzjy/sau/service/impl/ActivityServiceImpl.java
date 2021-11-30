package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.ActivityMapper;
import com.gzjy.sau.model.Inform;
import com.gzjy.sau.model.activity;
import com.gzjy.sau.service.activityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements activityService {

    /**
     * 注入mapper层对应对象
     */
    @Autowired
    private ActivityMapper activeMapper;

    @Override
    public List<activity> queryAll() {

        List<activity> activityList = activeMapper.queryAll();

        return activityList;
    }

    @Override
    public activity queryHome() {

        activity activity = activeMapper.queryHome();

        return activity;

    }

    @Override
    public List<Inform> queryInform() {

        List<Inform> informs = activeMapper.queryInform();


        return informs;

    }

    @Override
    public activity queryActivity(int id) {

        activity activity = activeMapper.queryActivity(id);


        return activity;


    }
}
