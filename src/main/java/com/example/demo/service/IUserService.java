package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> getUserList();

    void addUser( UserDTO userDTO);

    void updateUser( UserDTO userDTO);

    void deleteUser(String userId);
}
