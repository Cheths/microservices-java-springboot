package com.chethan.microservices.payment_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author cheth
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServerApplication 
{
    public static void main( String[] args ){
        SpringApplication.run(PaymentServerApplication.class, args);
    }
}
