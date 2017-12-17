package com.doubleD.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by double on 17-12-17.
 */
@Service
public class SomeHystrixService {

    //spring boot 使用ribbon只需要注入restTemplate即可，spring boot已经为我们做好了配置
    @Autowired
     RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackSome")
    public String getSome(){
        return restTemplate.getForObject("http://some/getsome", String.class);
    }

    public String fallbackSome(){
        return "some Service 模块故障";
    }
}
