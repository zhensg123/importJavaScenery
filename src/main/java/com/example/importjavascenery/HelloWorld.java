package com.example.importjavascenery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public Result hello(){
        return Result.success(new Hello());
    }
}
