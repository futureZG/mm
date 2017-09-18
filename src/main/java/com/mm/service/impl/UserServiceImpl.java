package com.mm.service.impl;

import com.mm.dao.UserDao;
import com.mm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public Boolean checkLogin(String username, String password) {
        if (userDao.getUser(username,password) != null) {
            return true;
        } else {
            return false;
        }
    }
}
