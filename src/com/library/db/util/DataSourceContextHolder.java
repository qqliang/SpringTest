package com.library.db.util;

/**
 * Created by Chen Qi on 2017/5/3.
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    //设置当前Thread的数据库类型
    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }
    //获取当前Thread的数据库类型
    public static String getDbType() {
        return ((String) contextHolder.get());
    }

    public static void clearDbType() {
        contextHolder.remove();
    }

}
