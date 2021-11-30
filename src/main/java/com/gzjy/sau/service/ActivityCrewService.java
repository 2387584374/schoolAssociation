package com.gzjy.sau.service;

import com.gzjy.sau.model.activityCrew;

import java.util.List;

public interface ActivityCrewService {

    /**
     * 通过学号查询参加活动
     * @param number
     * @return
     */
    public List<activityCrew> queryActivityCrews(Long number);

}
