package com.library.common.LibraryUser.dao;

import com.library.common.LibraryUser.entity.Book;

/**
 * Created by Chen Qi on 2017/5/2.
 */
public interface BookDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}
