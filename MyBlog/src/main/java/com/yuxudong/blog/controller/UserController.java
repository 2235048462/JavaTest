package com.yuxudong.blog.controller;

import com.yuxudong.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(){
        LOGGER.info("进入登录页");
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/checkPassword", method = RequestMethod.POST)
    @ResponseBody
    public boolean checkPassword(@RequestParam(value = "username")String username,
                                 @RequestParam(value = "password")String password){
        return userService.checkUser(username,password);
    }
}
