package com.library.common.LibraryUser.dao.impl;

import com.library.common.LibraryUser.dao.UserDao;
import com.library.common.LibraryUser.entity.User;
import com.library.common.LibraryUser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Chen Qi on 2017/5/2.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
