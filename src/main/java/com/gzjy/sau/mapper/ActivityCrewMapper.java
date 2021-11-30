package com.gzjy.sau.mapper;


import com.gzjy.sau.model.activity;
import com.gzjy.sau.model.activityCrew;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ActivityCrewMapper {

    @Select("select * from t_activityCrew where number=#{number}")
    public List<activityCrew> queryActivityCrews(@Param("number") Long number);
}
