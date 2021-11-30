package com.gzjy.sau.mapper;


import com.gzjy.sau.model.branchInform;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SortingTheUrlMapper {


    //信息管理

    /**
     * 查询信息管理分院活动通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_infoInform where informType = 1 limit 5")
    public List<branchInform> queryInfoActivityInform();

    /**
     * 查询信息管理社团通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_infoInform where informType = 2 limit 5")
    public List<branchInform> queryInfoClubInform();


    /**
     * 查询信息管理学生会通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_infoInform where informType = 3 limit 5")
    public  List<branchInform> queryInfoUnionInform();



    //建筑工程


    /**
     * 查询建筑工程分院活动通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_EngineeringInform where informType = 1 limit 9")
    public List<branchInform> queryEngineeringActivityInform();

    /**
     * 查询建筑工程分院社团通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_EngineeringInform where informType = 2 limit 3")
    public List<branchInform> queryEngineeringClubInform();


    /**
     * 查询建筑工程分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_EngineeringInform where informType = 3 limit 3")
    public  List<branchInform> queryEngineeringUnionInform();


    //建筑设备



    /**
     * 查询建设备程分院活动通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_EquipmentInform where informType = 1 limit 3")
    public List<branchInform> queryEquipmentActivityInform();

    /**
     * 查询建设备程分院社团通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_EquipmentInform where informType = 2 limit 3")
    public List<branchInform> queryEquipmentClubInform();


    /**
     * 查询建筑设备分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_EquipmentInform where informType = 3 limit 3")
    public  List<branchInform> queryEquipmentUnionInform();


    //建筑设计



    /**
     * 查询建筑设计分院活动通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_DesignInform where informType = 1 limit 3")
    public List<branchInform> queryDesignActivityInform();

    /**
     * 查询建筑设计分院社团通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_DesignInform where informType = 2 limit 3")
    public List<branchInform> queryDesignClubInform();


    /**
     * 查询建筑设计分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    @Select("select * from t_DesignInform where informType = 3 limit 3")
    public  List<branchInform> queryDesignUnionInform();
}
