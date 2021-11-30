package com.gzjy.sau.mapper;

import com.gzjy.sau.model.activityCrew;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityApplyMapper {

    /**
     * 通过活动id查询参加该活动所有学生
     * @param activityId
     * @return
     */
    @Select("select * from t_activityCrew where activityId=#{activityId}")
    public List<activityCrew> queryActivityAll(int activityId);



    /**
     * 通过学号,参加项目查询该学生参加活动
     * @param number projectName
     * @return 返回学生参加活动实体
     */
    @Select("select * from t_activityCrew where number=#{number} and projectName =#{projectName}")
    public activityCrew queryOne(@Param("number")long number, @Param("projectName")String projectName);

    /**
     * 通过学号查询该学生参加所有活动
     * @param number
     * @return
     */
    @Select("select * from t_activityCrew where number = #{number}")
    public List<activityCrew> queryUserList(Long number);

    /**
     * 活动报名
     * @param activityCrew 报名实体
     */
    @Insert("insert into t_activityCrew values(#{id},#{courtsName},#{majorName},#{gradeName},#{number},#{userName},#{projectName},#{activity},#{userId})")
    public int activityApplySave(activityCrew activityCrew);



}
