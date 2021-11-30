package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.ActivityApplyMapper;
import com.gzjy.sau.mapper.ActivityMapper;
import com.gzjy.sau.model.activityCrew;
import com.gzjy.sau.service.activityApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityApplyServiceImpl implements activityApplyService {


    //注入mapper层
    @Autowired
    private ActivityApplyMapper activityApplyMapper;

    @Override
    public List<activityCrew> queryActivityAll(int activityId) {

        List<activityCrew> activityCrews = activityApplyMapper.queryActivityAll(activityId);

        return activityCrews;
    }

    @Override
    public activityCrew queryOne(long number, String objectName) {


        activityCrew activityCrew = activityApplyMapper.queryOne(number, objectName);

        return activityCrew;
    }

    @Override
    public List<activityCrew> queryUserList(long number) {

        List<activityCrew> activityCrews = activityApplyMapper.queryUserList(number);

        return activityCrews;
    }

    @Override
    public int activityApplySave(activityCrew activityCrew) {

        int affect = activityApplyMapper.activityApplySave(activityCrew);

        return affect;

    }
}
