package com.cit.lotus.test.dao.mapper;

import com.cit.lotus.test.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {
    List<User> queryAllUsers();
}