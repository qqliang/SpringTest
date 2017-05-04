package com.library.common.User.dao.impl;

import com.library.common.User.dao.BookDao;
import com.library.common.User.dao.UserDao;
import com.library.common.User.entity.Book;
import com.library.common.User.mapper.BookMapper;
import com.library.common.User.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Chen Qi on 2017/5/2.
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    BookMapper bookMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Book record) {
        return 0;
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public Book selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }
}
