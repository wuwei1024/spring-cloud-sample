package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author: wuwei
 * @date: 2018/4/26 11:29
 */
@RestController
public class ComputeController {
    
    @Autowired
    private DiscoveryClient client;
    private static Logger logger = Logger.getLogger(ComputeController.class.getName());

    @RequestMapping("/get")
    public String get() {
        ServiceInstance instance = client.getLocalServiceInstance();
        String msg = "host: " + instance.getHost() + ", serviceId: " + instance.getServiceId();
        logger.log(Level.INFO, msg);
        return msg;
    }
}
