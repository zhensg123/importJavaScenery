package com.example.importjavascenery.controller;

import com.example.importjavascenery.Result;
import com.example.importjavascenery.dba.User;
import com.example.importjavascenery.dba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
@RestController
public class GetMysqlDataController {

    // 相当于注入对象，可以直接使用对象的方法，相当于new
    @Autowired
    private UserService userService;

    @RequestMapping("/mysql")
    public Object mysql(){
        List list = userService.findAll();
        return Result.success(list);
    }
}
