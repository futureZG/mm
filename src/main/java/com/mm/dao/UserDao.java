package com.mm.dao;

import com.mm.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    @Select("select * from user where username= #{username} and password=#{password}")
    User getUser(@Param("username") String username, @Param("password") String password);
}
