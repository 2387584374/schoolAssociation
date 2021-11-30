package com.gzjy.sau.service;

import com.gzjy.sau.model.Inform;
import com.gzjy.sau.model.activity;

import java.util.List;

public interface activityService {

    /**
     * 调用mapper层activeMapper接口查询所有热门活动
     * @return
     */
    public List<activity> queryAll();

    /**
     * 调用Mapper层接口查询需要放到首页的活动
     * @return 返回活动实体类
     */
    public activity queryHome();


    /**
     * 调用Mapper接口查询活动通知 查询前四条
     * @return
     */
    public List<Inform> queryInform();

    /**
     *通过通知对应活动id进行查询对应活动
     * @param id 活动id
     * @return 返回活动实体
     */
    public activity queryActivity(int id);

}
