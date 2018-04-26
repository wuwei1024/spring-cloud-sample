package com.test.controller;

import com.test.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wuwei
 * @date: 2018/4/26 14:13
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping("/get")
    public String get() {
        return computeClient.get();
    }
}
