package com.library.db.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Chen Qi on 2017/5/3.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDbType();
    }
}