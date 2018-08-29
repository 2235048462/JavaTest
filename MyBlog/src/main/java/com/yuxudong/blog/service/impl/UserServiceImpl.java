package com.yuxudong.blog.service.impl;

import com.yuxudong.blog.mapper.UserMapper;
import com.yuxudong.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean checkUser(String username, String password) {
        LOGGER.info("进入BloggerService");
        if("".equals(username.trim()) || username == null) {
            LOGGER.info("用户名为空");
            return false;
        }
        if("".equals(password.trim()) || password == null) {
            LOGGER.info("密码为空");
            return false;
        }
        String realPassword = userMapper.getPassword(username);
        if(realPassword.equals(password)){
            LOGGER.info("验证成功");
            return true;
        }
        LOGGER.info("验证失败");
        return false;
    }
}
