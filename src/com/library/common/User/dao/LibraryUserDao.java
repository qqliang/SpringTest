package com.library.common.User.dao;

import com.library.common.User.entity.LibraryUser;

/**
 * Created by Chen Qi on 2017/5/2.
 */
public interface LibraryUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(LibraryUser record);

    int insertSelective(LibraryUser record);

    LibraryUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LibraryUser record);

    int updateByPrimaryKey(LibraryUser record);
}
