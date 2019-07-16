package com.example.demo.controller;


import com.example.demo.dto.UserDTO;
import com.example.demo.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    IUserService userService;

    @PostMapping("/get/list")
    public Object getList() {
        return userService.getUserList();
    }

    @PostMapping("/delete")
    public void deleteUser(@RequestParam("userId") String userId) {
        userService.deleteUser(userId);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
    }

    @PostMapping("/update")
    public void updateUser( UserDTO userDTO) {
        userService.updateUser(userDTO);
    }
}
