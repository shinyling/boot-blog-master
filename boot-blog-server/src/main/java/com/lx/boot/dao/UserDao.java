package com.lx.boot.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shiny
 * @since 2016/10/18 11:14
 */
@Repository
public interface UserDao {

    @Insert("insert into t_admin(username,password) values(#{username},#{password})")
    int insertUser(@Param("username")String username,@Param("password")String password);

}
