package com.library.common.User.service.impl;

import com.library.common.User.dao.LibraryUserDao;
import com.library.common.User.entity.LibraryUser;
import com.library.common.User.service.LibraryUserService;

import com.library.db.util.DataSourceContextHolder;
import com.library.db.util.DataSourceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Qing_L on 2017/5/2.
 */
@Service
public class LibraryUserServiceImpl implements LibraryUserService{
    @Autowired
    private LibraryUserDao userDao;

    @Override
    public LibraryUser selectByPrimaryKey(Integer id) throws Exception {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) throws Exception {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LibraryUser record) throws Exception {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(LibraryUser record) throws Exception {
        return userDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(LibraryUser record) throws Exception {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LibraryUser record) throws Exception {
        return userDao.updateByPrimaryKey(record);
    }

    @Override
    public LibraryUser findByUserName(String userName) throws Exception {
        return userDao.findByUserName(userName);
    }

}
