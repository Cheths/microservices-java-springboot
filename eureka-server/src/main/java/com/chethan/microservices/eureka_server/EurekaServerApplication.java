package com.chethan.microservices.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author cheth
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication 
{
    public static void main( String[] args ){
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
