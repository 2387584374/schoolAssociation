package com.gzjy.sau.service.impl;

import com.gzjy.sau.mapper.ActivityCrewMapper;
import com.gzjy.sau.model.activityCrew;
import com.gzjy.sau.service.ActivityCrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActivityCrewServiceImpl implements ActivityCrewService {

    @Autowired
    private ActivityCrewMapper activityCrewMapper;

    @Override
    public List<activityCrew> queryActivityCrews(Long number) {

        List<activityCrew> activityCrews = activityCrewMapper.queryActivityCrews(number);

        return activityCrews;
    }
}
