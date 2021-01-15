package com.cit.lotus.test.service;


import com.cit.lotus.test.dao.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUsers();
}
