package com.cit.lotus.service;


import com.cit.lotus.dao.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUsers();
}
