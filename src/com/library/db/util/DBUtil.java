package com.library.db.util;

import java.sql.*;

/**
 * Created by Qing_L on 2017/5/2.
 */
public class DBUtil {
    private Connection conn;
    public DBUtil() {
        String url = "jdbc:mysql://192.168.102.143:3306/library_saas?characterEncoding=utf8&useSSL=true";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","root");
        }catch(Exception e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
    }
    public void createUser(String userName, String password){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            int set = stmt.executeUpdate("CREATE USER "+userName+"@localhost IDENTIFIED BY "+password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void createSchema(String userName, String password){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            int set = stmt.executeUpdate("CREATE SCHEMA "+userName+"_schema IDENTIFIED BY '123456'");
            boolean result = stmt.execute("GRANT ALL PRIVILEGES ON "+userName+"_schema.*  TO "+userName+"@localhost IDENTIFIED BY "+password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        DBUtil dbUtil = new DBUtil();
//        dbUtil.getConnection();
    }
}
