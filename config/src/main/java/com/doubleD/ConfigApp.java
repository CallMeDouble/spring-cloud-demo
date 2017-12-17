package com.doubleD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//作为配置服务中心
@EnableConfigServer
//向eureka-server注册成为其客户端
@EnableDiscoveryClient
public class ConfigApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApp.class, args);
    }
}
