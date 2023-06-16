package com.example.importjavascenery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
    @GetMapping("/varuse")
    public String Varuse(){
        int testarr[]={1,2,4};
        for(int i=0;i<testarr.length;i++){
            System.out.println(i + "测试数据");
        }

        for(int x:testarr){
            System.out.println(x + "测试forEache");
        }
        return "测试测试测试";
    }
}
