package com.doubleD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 * 断路器监控
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableTurbine
public class MonitorApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(MonitorApp.class, args);
    }
}
