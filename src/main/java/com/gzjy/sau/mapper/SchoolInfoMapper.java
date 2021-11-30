package com.gzjy.sau.mapper;

import com.gzjy.sau.model.schoolInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolInfoMapper {

    /**
     * 查询所有总院公告
     * @return
     */
    @Select("select * from t_schoolInfo")
    public List<schoolInfo> queryAll();

}
