package com.test.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wuwei
 * @date: 2018/4/26 14:38
 */
@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getServiceFallback")
    public String getService() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/get", String.class).getBody();
    }

    public String getServiceFallback() {
        return "error";
    }
}
