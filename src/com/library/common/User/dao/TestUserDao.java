package com.library.common.User.dao;

import com.library.common.User.entity.TestUser;

import java.util.List;

/**
 * Created by Chen Qi on 2017/5/2.
 */
public interface TestUserDao {

    int deleteById(String id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectById(String id);

    List<TestUser> list();

    int updateByPrimaryKeySelective(TestUser record);

    int update(TestUser record);
}
