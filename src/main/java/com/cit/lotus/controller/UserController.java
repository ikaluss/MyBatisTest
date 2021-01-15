package com.cit.lotus.controller;

import com.cit.lotus.dao.entity.User;
import com.cit.lotus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("web")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("queryAllUsers")
    public List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }
}
