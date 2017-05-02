package com.library.common.User.controller;

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
    private UserService userService;

    @RequestMapping(value = "library/Login",method = RequestMethod.POST)
    @ResponseBody
    public String testLogin(@RequestParam(value = "user") String user,
                            @RequestParam(value = "password") String password,
                            HttpSession session){
        System.out.print(user+" "+password);
        String pwd1 = userService.findPwdByUser(user);
        if(password.equals(pwd1))
            return "true";
        else
            return "false";
    }

    @RequestMapping("library/login")
    public String login(){
        return "index";
    }

    @RequestMapping("library/regist")
    public String regist(){
        return "register";
    }
}
