package com.example.importjavascenery.dba.mapper;

import com.example.importjavascenery.dba.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int insert(User user);

    @Update("UPDATE user SET name=#{name}, age=#{age} WHERE id=#{id}")
    int update(User user);

    @Delete("DELETE FROM user WHERE id=#{id}")
    int deleteById(@Param("id") Long id);

    @Select("SELECT * FROM user")
    List<User> findAll();
}