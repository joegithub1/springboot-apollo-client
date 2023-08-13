package com.web.controller;

import com.web.utils.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description:
 * @Author huangjian
 * @Date 2023/8/13
 **/
@RestController
public class HelloController {

    @Autowired
    private RedisService redisService;

    @Value("${host.ip:#{null}}")
    private String hostIp;

    @GetMapping("/hello")
    public String hello(){

        return "ip:"+hostIp;
    }


    @GetMapping("/get")
    public String getReidsValue(@RequestParam("key") String key){
        String value = redisService.getCacheObject(key);
        return value;
    }
}
