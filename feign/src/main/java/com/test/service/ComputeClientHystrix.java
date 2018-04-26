package com.test.service;

import org.springframework.stereotype.Component;

/**
 * @author: wuwei
 * @date: 2018/4/26 14:49
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public String get() {
        return "error";
    }
}
