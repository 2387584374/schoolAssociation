package com.gzjy.sau.mapper;

import com.gzjy.sau.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {


        /**
         * 通过用户名查询该用户
         * @return  返回用户对象
         */
        @Select("select * from t_user where name=#{username}")
        public User queryUser(String username);


        /**
         * 用户注册
         * @param user 用户实体类
         */
        @Insert("insert into t_user values(#{id},#{name},#{password}," +
                "#{number},#{email},#{jurisdiction}," +
                "#{branchCourts},#{major},#{classGrade}," +
                "#{userName})")
        public void addUser(User user);
}
