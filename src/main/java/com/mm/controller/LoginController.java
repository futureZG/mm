package com.mm.controller;


import com.mm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/checkLogin")
    @ResponseBody
    public String checkLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
        Boolean flag  = userService.checkLogin(username,password);
        if(flag){
            return "success";

        }else {
            return "faile";
        }
    }
}
