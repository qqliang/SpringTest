package com.library.common.LibraryUser.dao.impl;

import com.library.common.LibraryUser.dao.TestUserDao;
import com.library.common.LibraryUser.entity.TestUser;
import com.library.common.LibraryUser.mapper.TestUserMapper;
import com.library.db.util.DataSourceContextHolder;
import com.library.db.util.DataSourceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chen Qi on 2017/5/2.
 */
@Repository
public class TestUserDaoImpl implements TestUserDao {
    @Autowired
    TestUserMapper mapper;
    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public int insert(TestUser record) {
        return 0;
    }

    @Override
    public int insertSelective(TestUser record) {
        return 0;
    }

    @Override
    public TestUser selectById(String id) {
        return null;
    }

    @Override
    public List<TestUser> list() {
        //切换数据源（数据库）
        DataSourceContextHolder.setDbType(DataSourceName.SLAVE_SOURCE);
        return mapper.list();
    }

    @Override
    public int updateByPrimaryKeySelective(TestUser record) {
        return 0;
    }

    @Override
    public int update(TestUser record) {
        return 0;
    }
}
