package com.cit.lotus.test.service.impl;

import com.cit.lotus.test.dao.entity.User;
import com.cit.lotus.test.dao.mapper.IUserMapper;
import com.cit.lotus.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public IUserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryAllUsers();
    }
}
