package com.gzjy.sau.mapper;

import com.gzjy.sau.model.Inform;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformMapper {

    /**
     * 查询第一个活动
     * @return
     */
    @Select("select * from t_inform where id=1")
    public Inform informOne();

    /**
     * 查询所有活动通知
     * @return
     */
    @Select("select * from t_inform")
    public List<Inform> fadAll();

}
