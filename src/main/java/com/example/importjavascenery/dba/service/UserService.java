package com.example.importjavascenery.dba.service;

import com.example.importjavascenery.dba.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.importjavascenery.dba.mapper.UserMapper;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id) {
        return userMapper.findById(id);
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
