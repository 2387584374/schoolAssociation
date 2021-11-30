package com.gzjy.sau.service;

import com.gzjy.sau.model.club;
import com.gzjy.sau.model.clubInform;

import java.util.List;

public interface clubInformService {

    /**
     * 查询首页社团通知
     * @return
     */
    public List<clubInform> queryAll();

    /**
     * 查询社团中心活动通知
     * @return
     */
    public List<clubInform> queryClubActive();

    /**
     * 查询社团中心社团招新通知
     * @return
     */
    public List<clubInform> queryClubEnroll();

    /**
     * 查询前三个社团在社团中心展示
     * @return
     */
    public  List<club> queryClubs();

}
