package com.library.db.util;

import java.sql.*;

/**
 * Created by Qing_L on 2017/5/2.
 */
public class DBUtil {
    private Connection conn;

    public DBUtil() {
        String url = "jdbc:mysql://localhost:3306/library_saas?characterEncoding=utf8&useSSL=true";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","mysql");
        }catch(Exception e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
    }

    /**
     * 创建数据库用户
     * @param userName
     * @param password
     */
    public void createUser(String userName, String password){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql = "CREATE USER "+userName+"@localhost IDENTIFIED BY '"+password+"';";
            boolean set = stmt.execute(sql);;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        DBUtil dbUtil = new DBUtil();
        dbUtil.createUser("cq","123456");
        dbUtil.createSchema("cq","123456");
    }

    /**
     * 为租户创建Schema，并绑定数据库用户
     * @param userName
     * @param password
     */
    public void createSchema(String userName, String password){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String createSql = "CREATE SCHEMA "+userName+"_schema;";
            String grantSql = "GRANT ALL PRIVILEGES ON "+userName+"_schema.*  TO "+userName+"@localhost IDENTIFIED BY '"+password+"';";
            int set = stmt.executeUpdate(createSql);
            boolean result = stmt.execute(grantSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable(String username, String password){
        String url = "jdbc:mysql://localhost:3306/"+username+"_schema?characterEncoding=utf8&useSSL=true";
        Connection conn = DBUtil.getConnection(url,username,password);
        Statement stmt = null;

        String createUser = "CREATE TABLE `user` (" +
                            "  `id` int(10) NOT NULL AUTO_INCREMENT," +
                            "  `user_name` varchar(255) NOT NULL," +
                            "  `user_password` varchar(255) NOT NULL," +
                            "  `user_tel` varchar(11) DEFAULT NULL," +
                            "  `user_email` varchar(30) DEFAULT NULL," +
                            "  `create_time` varchar(255) NOT NULL COMMENT '创建时间'," +
                            "  PRIMARY KEY (`id`)\n" +
                            ")";
        String createBook = "CREATE TABLE `book` (" +
                            "  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号'," +
                            "  `book_name` varchar(255) NOT NULL COMMENT '名称'," +
                            "  `book_editor` varchar(255) NOT NULL COMMENT '作者'," +
                            "  `book_publisher` varchar(255) DEFAULT NULL COMMENT '出版社'," +
                            "  `book_location` varchar(255) NOT NULL COMMENT '存放位置'," +
                            "  `book_status` tinyint(1) DEFAULT NULL COMMENT '状态 0:在架 1:借出'," +
                            "  `book_classify` varchar(20) DEFAULT NULL," +
                            "  `create_time` varchar(255) DEFAULT NULL," +
                            "  PRIMARY KEY (`id`)" +
                            ")";
        String createTenant = "CREATE TABLE `tenant` (" +
                            "  `id` int(10) NOT NULL AUTO_INCREMENT," +
                            "  `user_id` int(10) NOT NULL," +
                            "  `book_id` int(10) NOT NULL," +
                            "  `borrow_time` varchar(255) NOT NULL," +
                            "  `return_time` varchar(255) DEFAULT NULL," +
                            "  PRIMARY KEY (`id`)," +
                            "  KEY `userId` (`user_id`)," +
                            "  KEY `bookId` (`book_id`)," +
                            "  CONSTRAINT `bookId` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`)," +
                            "  CONSTRAINT `userId` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)" +
                            ")";
        try {
            stmt = conn.createStatement();
            stmt.execute("DROP TABLE IF EXISTS `user`;");
            stmt.execute(createUser);
            stmt.execute("DROP TABLE IF EXISTS `book`;");
            stmt.execute(createBook);
            stmt.execute("DROP TABLE IF EXISTS `tenant`;");
            stmt.execute(createTenant);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static Connection getConnection(String url, String username, String password){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            System.out.println("数据库连接失败！");
            e.printStackTrace();
        }
        return conn;
    }

}
