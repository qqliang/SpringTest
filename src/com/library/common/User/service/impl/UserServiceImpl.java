package com.library.common.User.service.impl;

import com.library.common.User.dao.UserDao;
import com.library.common.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Qing_L on 2017/5/2.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public String findPwdByUser(String userName) {
        return userDao.findPwdByUser(userName);
    }
}
