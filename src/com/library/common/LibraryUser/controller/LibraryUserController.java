package com.library.common.LibraryUser.controller;

import com.library.common.LibraryUser.entity.LibraryUser;
import com.library.common.LibraryUser.service.LibraryUserService;
import com.library.common.sign.UserSession;
import com.library.db.util.DBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.*;

/**
 * Created by Qing_L on 2017/5/2.
 */
@Controller
@RequestMapping("/")
public class LibraryUserController {
    @Autowired
    private LibraryUserService userService;

    /**
     * 检查登录
     * @param user
     * @param password
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "library/checkLogin",method = RequestMethod.POST)
    @ResponseBody
    public String chenkLogin(@RequestParam(value = "user") String user,
                            @RequestParam(value = "password") String password,
                            HttpSession session) throws Exception{
        try {
            LibraryUser libraryUser = userService.findByUserName(user);
            if(password.equals(libraryUser.getPassword())) {
                UserSession userInfo = new UserSession();
                userInfo.setUsername(user);
                userInfo.setPassword(password);
                session.setAttribute("userInfo",userInfo);
                return "true";
            }else
                return "false";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    /**
     * 检查注册
     * @param userName
     * @param password
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "library/checkRegist", method = RequestMethod.POST)
    @ResponseBody
    public String checkRegist(@RequestParam(value = "user") String userName,
                              @RequestParam(value = "password") String password,
                              HttpSession session) throws Exception{
        LibraryUser libraryUser = new LibraryUser();
        libraryUser.setUserName(userName);
        libraryUser.setPassword(password);

        try {
            int result = userService.insert(libraryUser);
            DBUtil dbUtil = new DBUtil();
            dbUtil.createUser(userName, password);
            dbUtil.createSchema(userName, password);
            DBUtil.createTable(userName,password);
            System.out.print(result);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "true";
    }

    @RequestMapping(value = "/library/logout", method = RequestMethod.POST)
    @ResponseBody
    public String Logout(HttpSession session){
        if(session!=null){
            session.removeAttribute("userInfo");
            session.invalidate();//使得session失效
        }
        return "true";
    }
    /**
     * 跳转至登录页面
     * @return
     */
    @RequestMapping("library/login")
    public String login(){
        return "index";
    }

    /**
     * 跳转至注册页面
     * @return
     */
    @RequestMapping("library/regist")
    public String regist(){
        return "register";
    }

    /**
     * 跳转至dashboard页面
     * @return
     */
    @RequestMapping("library/dashboard")
    public String dashboard(){
        return "dashboard";
    }
}
