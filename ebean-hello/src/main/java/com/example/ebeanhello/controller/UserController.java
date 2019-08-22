package com.example.ebeanhello.controller;

import com.example.ebeanhello.entity.User;
import com.example.ebeanhello.service.UserService;
import io.ebean.PagedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-21 10:49
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public boolean save() {
        return userService.save();
    }

    @RequestMapping("/back")
    public boolean back() {
        return userService.back();
    }

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(@RequestParam(value = "id") Integer id) {
        return userService.findById(id);
    }

    @RequestMapping("/page")
    public List<User> page() {
        return userService.page();
    }
}
