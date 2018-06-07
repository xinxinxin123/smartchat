package com.self.xin.smartchat.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xin on 2018/6/3.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test1.do")
    @ResponseBody
    public Map<String, Object> test() {
        Map<String,Object>  res = new HashMap<String, Object>();
        res.put("res","success");
        return res;
    }
}
