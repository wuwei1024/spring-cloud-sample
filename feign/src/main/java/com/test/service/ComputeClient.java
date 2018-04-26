package com.test.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wuwei
 * @date: 2018/4/26 14:15
 */
@FeignClient("compute-service")
public interface ComputeClient {
    @RequestMapping("/get")
    String get();
}
