package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public List<User> getUserList() {
        List<User> userList = this.baseMapper.getUserList(null);
        return userList;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        User user = new User();
        String userId = UUID.randomUUID().toString();
        BeanUtils.copyProperties(userDTO, user);
        this.baseMapper.insertOrUpdate(user, null);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        String userId = userDTO.getUserId();
        this.baseMapper.insertOrUpdate(user, null);
    }

    @Override
    public void deleteUser(String userId) {
        this.baseMapper.deleteUser(userId, null);
    }
}
