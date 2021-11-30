package com.gzjy.sau.mapper;


import com.gzjy.sau.model.Inform;
import com.gzjy.sau.model.activity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityMapper {

    /**
     * 查询所有热门活动
     * @return
     */
    @Select("select * from t_active")
    public List<activity> queryAll();

    /**
     * 查询当前需要放到首页的活动 活动类型标识为1
     * @return
     */
    @Select("select * from t_active where activeType = 1")
    public activity queryHome();


    /**
     *查询活动通知 取前四条
     * @return
     */
    @Select("select * from t_inform limit 4")
    public List<Inform> queryInform();

    /**
     * 通过通知对应活动id进行查询活动实体
     * @param id
     * @return 返回活动实体
     */
    @Select("select * from t_active where id = #{id}")
    public activity queryActivity(int id);





}
