package com.library.common.User.dao;

import com.library.common.User.entity.Tenant;

/**
 * Created by Chen Qi on 2017/5/2.
 */
public interface TenantDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Tenant record);

    int insertSelective(Tenant record);

    Tenant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tenant record);

    int updateByPrimaryKey(Tenant record);
}
