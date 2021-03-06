package com.library.common.LibraryUser.dao;

import com.library.common.LibraryUser.entity.LibraryUser;

/**
 * Created by Chen Qi on 2017/5/2.
 */
public interface LibraryUserDao {

    LibraryUser selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(LibraryUser record);

    int insertSelective(LibraryUser record);

    int updateByPrimaryKeySelective(LibraryUser record);

    int updateByPrimaryKey(LibraryUser record);

    LibraryUser findByUserName(String userName);
}
