package com.zekerijah.unittest.service;

import com.zekerijah.unittest.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUser(){
        return userDao.getUser();
    }
}
