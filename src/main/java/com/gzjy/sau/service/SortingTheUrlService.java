package com.gzjy.sau.service;

import com.gzjy.sau.model.branchInform;

import java.util.List;

public interface SortingTheUrlService {

    /**
     * 调用Mapper层查询信息管理分院活动通知
     * @return  返回 branchInform 类List集合
     */
    public List<branchInform> queryInfoActivityInform();

    /**
     * 调用Mapper层查询信息管理分院社团通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryInfoClubInform();

    /**
     * 调用Mapper层查询信息管理分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryInfoUnionInform();


    //建筑工程

    /**
     * 调用Mapper层查询建筑工程活动通知
     * @return  返回 branchInform 类List集合
     */
    public List<branchInform> queryEngineeringActivityInform();

    /**
     * 调用Mapper层查询建筑工程分院社团通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryEngineeringClubInform();

    /**
     * 调用Mapper层查询建筑工程分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryEngineeringUnionInform();




    /**
     * 调用Mapper层查询建筑设备分院活动通知
     * @return  返回 branchInform 类List集合
     */
    public List<branchInform> queryEquipmentActivityInform();

    /**
     * 调用Mapper层查询建筑设备分院社团通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryEquipmentClubInform();

    /**
     * 调用Mapper层查询建筑设备分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryEquipmentUnionInform();



    //建筑设计

    /**
     * 调用Mapper层查询建筑设备分院活动通知
     * @return  返回 branchInform 类List集合
     */
    public List<branchInform> queryDesignActivityInform();




    /**
     * 调用Mapper层查询建筑设计分院社团通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryDesignClubInform();

    /**
     * 调用Mapper层查询建筑设计分院学生会通知
     * @return 返回 branchInform 类List集合
     */
    public List<branchInform> queryDesignUnionInform();



}
