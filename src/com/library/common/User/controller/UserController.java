package com.library.common.User.controller;

import com.library.common.User.entity.LibraryUser;
import com.library.common.User.service.LibraryUserService;
import com.library.common.User.service.UserService;
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
public class UserController {
    @Autowired
    private LibraryUserService userService;

    @RequestMapping(value = "library/Login",method = RequestMethod.POST)
    @ResponseBody
    public String testLogin(@RequestParam(value = "user") String user,
                            @RequestParam(value = "password") String password,
                            HttpSession session) throws Exception{
        LibraryUser libraryUser = userService.findByUserName(user);
        if(password.equals(libraryUser.getPassword()))
            return "true";
        else
            return "false";
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
}
