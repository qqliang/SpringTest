package com.library.common.User.dao.impl;

import com.library.common.User.dao.UserDao;
import com.library.common.User.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Qing_L on 2017/5/2.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private UserMapper userMapper;

    @Override
    public String findPwdByUser(String userName) {
        return userMapper.findPwdByUser(userName);
    }
}
