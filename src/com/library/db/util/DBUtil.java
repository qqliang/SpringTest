package com.library.db.util;

import java.sql.*;

/**
 * Created by Qing_L on 2017/5/2.
 */
public class DBUtil {
    public static Connection getConnection() {
        String url = "jdbc:mysql://192.168.102.143:3306/library_saas?characterEncoding=utf8&useSSL=true";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","root");
        }catch(Exception e) {
            System.out.println("数据库连接失败");
        }
        return conn;
    }

    public static void close(ResultSet rs){
        //使用之前先判断，是成熟程序员的好习惯
        try {
            if(rs != null){
                rs.close();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void close(PreparedStatement ps){
        //使用之前先判断，是成熟程序员的好习惯
        try {
            if(ps != null){
                ps.close();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void close(Connection conn){
        //使用之前先判断，是成熟程序员的好习惯
        try {
            if(conn != null){
                conn.close();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void rollback(Connection conn){
        //使用之前先判断，是成熟程序员的好习惯
        try {
            if(conn != null){
                conn.rollback();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
