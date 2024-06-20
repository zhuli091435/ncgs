package com.sky.pushdata.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

//可以使Spring自动把要返回的对象转化成json文本写入到响应体中，比如自定义的ResultBean
@ResponseBody
@ControllerAdvice
public class MyGlobalExceptionHandler {
    // 专门用来捕获和处理Controller层的异常
    @ExceptionHandler(Exception.class)
    public HashMap<String, Object> customException(Exception e) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("code", 1);
        stringObjectHashMap.put("message", e.getMessage());
        return stringObjectHashMap;
    }
}
