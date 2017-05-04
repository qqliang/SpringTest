package com.library.common.LibraryUser.dao.impl;

import com.library.common.LibraryUser.dao.LibraryUserDao;
import com.library.common.LibraryUser.entity.LibraryUser;
import com.library.common.LibraryUser.mapper.LibraryUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Chen Qi on 2017/5/2.
 */
@Repository
public class LibraryUserDaoImpl implements LibraryUserDao {
    @Autowired
    LibraryUserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LibraryUser record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(LibraryUser record) {
        return 0;
    }

    @Override
    public LibraryUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LibraryUser record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LibraryUser record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public LibraryUser findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

}
