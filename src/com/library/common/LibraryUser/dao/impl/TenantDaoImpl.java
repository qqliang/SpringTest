package com.library.common.LibraryUser.dao.impl;

import com.library.common.LibraryUser.dao.TenantDao;
import com.library.common.LibraryUser.entity.Tenant;
import com.library.common.LibraryUser.mapper.TenantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Chen Qi on 2017/5/2.
 */
@Repository
public class TenantDaoImpl implements TenantDao {
    @Autowired
    TenantMapper tenantMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Tenant record) {
        return 0;
    }

    @Override
    public int insertSelective(Tenant record) {
        return 0;
    }

    @Override
    public Tenant selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Tenant record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Tenant record) {
        return 0;
    }
}
