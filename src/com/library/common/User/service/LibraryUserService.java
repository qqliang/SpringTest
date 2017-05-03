package com.library.common.User.service;

import com.library.common.User.entity.LibraryUser;

/**
 * Created by Chen Qi on 2017/5/3.
 */
public interface LibraryUserService {
    LibraryUser selectByPrimaryKey(Integer id) throws Exception;

    int deleteByPrimaryKey(Integer id) throws Exception;

    int insert(LibraryUser record) throws Exception;

    int insertSelective(LibraryUser record) throws Exception;

    int updateByPrimaryKeySelective(LibraryUser record) throws Exception;

    int updateByPrimaryKey(LibraryUser record) throws Exception;

    LibraryUser findByUserName(String userName) throws Exception;
}
