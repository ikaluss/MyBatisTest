package com.cit.lotus.dao.mapper;

import com.cit.lotus.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {
    List<User> queryAllUsers();
}