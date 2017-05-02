package com.library.common.User.dao.impl;

import com.library.common.User.dao.LibraryUserDao;
import com.library.common.User.entity.LibraryUser;
import org.springframework.stereotype.Repository;

/**
 * Created by Chen Qi on 2017/5/2.
 */
@Repository
public class LibraryUserDaoImpl implements LibraryUserDao {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(LibraryUser record) {
        return 0;
    }

    @Override
    public int insertSelective(LibraryUser record) {
        return 0;
    }

    @Override
    public LibraryUser selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(LibraryUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(LibraryUser record) {
        return 0;
    }
}
