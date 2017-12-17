package com.doubleD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 * 服务网关
 */
@SpringBootApplication
//会通过发现服务找到config服务
@EnableDiscoveryClient
//开启feign客户端支持
@EnableFeignClients
//开启断路器支持
@EnableCircuitBreaker
//开启网关代理支持
@EnableZuulProxy public class UIApp {
    public static void main(String[] args) {
        SpringApplication.run(UIApp.class, args);
    }

    @Bean @LoadBalanced public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
