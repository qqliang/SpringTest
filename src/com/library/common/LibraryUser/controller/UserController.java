package com.library.common.LibraryUser.controller;

import com.library.common.LibraryUser.dao.UserDao;
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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qing_L on 2017/5/4.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping(value = "/library/queryAllUser", method = RequestMethod.POST)
    @ResponseBody
    public List<User> queryAllUser(HttpSession session){
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
                user.setCreateTime(resultSet.getDate("create_time"));
                userList.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }
}
