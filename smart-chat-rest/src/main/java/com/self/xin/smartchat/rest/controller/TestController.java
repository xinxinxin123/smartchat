package com.self.xin.smartchat.rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xin on 2018/6/3.
 */
@Api("test")
@Controller
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "testSpringMVC",notes = "测试spring mvc的小案例",response = HashMap.class)
    @RequestMapping("/test1.do")
    @ResponseBody
    public Map<String, Object> test() {
        Map<String,Object>  res = new HashMap<String, Object>();
        res.put("res","success");
        return res;
    }
}
