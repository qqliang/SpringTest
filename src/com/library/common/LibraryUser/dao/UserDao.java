package com.library.common.LibraryUser.dao;

import com.library.common.LibraryUser.entity.User;

/**
 * Created by Chen Qi on 2017/5/2.
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
