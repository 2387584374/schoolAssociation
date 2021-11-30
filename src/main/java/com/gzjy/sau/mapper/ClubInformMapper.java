package com.gzjy.sau.mapper;


import com.gzjy.sau.model.club;
import com.gzjy.sau.model.clubInform;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubInformMapper {

    /**
     * 查询首页社团活动通知
     * @return
     */
    @Select("select * from t_clubInform limit 5")
    public List<clubInform> queryAll();

    /**
     * 查询社团活动通知 查询前7条进行首页展示
     * @return
     */
    @Select("select * from t_clubInform where activeType = 1 limit 7")
    public List<clubInform> queryClubActive();

    /**
     * 查询社团招新通知 查询前7条进行首页展示
     * @return
     */
    @Select("select * from t_clubInform where activeType = 0 limit 7")
    public List<clubInform> queryClubEnroll();


    /**
     * 查询前三个社团进行展示
     * @return
     */
    @Select("select * from t_club limit 3")
    public List<club> queryClubs();

}
