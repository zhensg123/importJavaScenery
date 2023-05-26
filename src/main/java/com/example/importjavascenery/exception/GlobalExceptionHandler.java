package com.example.importjavascenery.exception;

import com.example.importjavascenery.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        // 处理异常
        return Result.error("系统异常");
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Result handleMyException(MyException e) {
        // 处理自定义异常
        return Result.error(e.getMessage());
    }
}