package com.mm.controller;

import com.mm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    @ResponseBody
    public Boolean checkLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
        Boolean flag  = userService.checkLogin(username,password);
        return flag;
    }
}
