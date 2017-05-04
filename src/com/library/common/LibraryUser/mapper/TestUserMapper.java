package com.library.common.LibraryUser.mapper;


import com.library.common.LibraryUser.entity.TestUser;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestUserMapper {
    int deleteById(String id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectById(String id);

    List<TestUser> list();

    int updateByPrimaryKeySelective(TestUser record);

    int update(TestUser record);
}