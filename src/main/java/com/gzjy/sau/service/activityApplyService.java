package com.gzjy.sau.service;

import com.gzjy.sau.model.activityCrew;

import java.util.List;

public interface activityApplyService {

    /**
     * 通过调用mapper层查询报名该活动所有学生
     * @param activityId 传入活动id
     * @return 返回参加活动学生实体集合
     */
    public List<activityCrew> queryActivityAll(int activityId);

    /**
     * 通过调用mapper层接口查询该生是否报名过该项目
     * @param number 学号
     * @param objectName 参加项目
     * @return 返回null表示该生未报名 返回activityCrew实体表示已经报名
     */
    public activityCrew queryOne(long number,String objectName);

    /**
     * 通过调用mapper层查询该生报名所有项目
     * @param number 学号
     * @return 返回报名详细实体
     */
    public List<activityCrew> queryUserList(long number);

    /**
     * 通过调用mapper层进行保存报名信息
     * @param activityCrew 报名实体类
     * @return int  返回0表示报名失败
     */
    public int activityApplySave(activityCrew activityCrew);

}
