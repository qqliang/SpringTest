package com.library.common.LibraryUser.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.common.LibraryUser.entity.User;
import com.library.common.sign.UserSession;
import com.library.db.util.DBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Qing_L on 2017/5/4.
 */
@Controller
@RequestMapping("/")
public class UserController {

    /**
     * 查询所有用户
     * @param session
     * @return
     */
    @RequestMapping(value = "/user/queryAllUser", method = RequestMethod.POST)
    @ResponseBody
    public String queryAllUser(HttpSession session){
        UserSession userSession = (UserSession) session.getAttribute("userInfo");
        String url = "jdbc:mysql://localhost:3306/"+userSession.getUsername()+"_schema?characterEncoding=utf8&useSSL=true";
        Connection connection = DBUtil.getConnection(url,userSession.getUsername(),userSession.getPassword());
        List<User> userList = new ArrayList<>();
        try{
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM user;");

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setUserPassword(resultSet.getString("user_password"));
                user.setUserTel(resultSet.getString("user_tel"));
                user.setUserEmail(resultSet.getString("user_email"));
                user.setCreateTime(resultSet.getDate("create_time").toString());
                userList.add(user);
            }

            stmt.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String resultJson = "";
        try {
            resultJson = objectMapper.writeValueAsString(userList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultJson;
    }

    @RequestMapping(value = "/user/insertUser",method = RequestMethod.POST)
    @ResponseBody
    public String insertUser(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("user_tel") String userTel,
                             @RequestParam("user_mail") String userMail,
                             HttpSession session){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = df.format(new Date());

        UserSession userSession = (UserSession) session.getAttribute("userInfo");
        String url = "jdbc:mysql://localhost:3306/"+userSession.getUsername()+"_schema?characterEncoding=utf8&useSSL=true";
        Connection connection = DBUtil.getConnection(url,userSession.getUsername(),userSession.getPassword());
        try {
            Statement stmt = connection.createStatement();
            String sql = "INSERT INTO user VALUES ("+username+","+password+","+userTel+","+userMail+","+createTime+")";
            System.out.println(sql);
            boolean result = stmt.execute(sql);
            stmt.close();
            connection.close();
            return "true";
        } catch (SQLException e) {
            e.printStackTrace();
            return "false";
        }

    }
}
