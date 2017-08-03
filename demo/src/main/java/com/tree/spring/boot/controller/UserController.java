package com.tree.spring.boot.controller;

import com.tree.spring.boot.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tree on 17-8-3.
 */
@RestController
@RequestMapping(UserController.USER_CONTROLLER)
public class UserController {

    public static final String USER_CONTROLLER = "user";

    public static final String USER_HELLO = "hello";

    public static final String USER_DETAIL = "detail";

    public static final String USER_WORD = "word";

    @Value("${com.tree.name}")
    private String name;

    @Value("${com.tree.welcome}")
    private String welcome;

    @Autowired
    private UserConfig userConfig;

    @Value("${com.tree.word}")
    private String word;

    @RequestMapping(UserController.USER_HELLO)
    public String hello(){
        String result = name + ", " + welcome;
        return result;
    }

    @RequestMapping(UserController.USER_DETAIL)
    public String detail(){
        String result = userConfig.getId() + ", " + userConfig.getPassword();
        return result;
    }

    @RequestMapping(UserController.USER_WORD)
    public String word(){
        return word;
    }
}
