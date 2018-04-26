package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wuwei
 * @date: 2018/4/26 13:24
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/get")
    public String get() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/get", String.class).getBody();
    }
}
