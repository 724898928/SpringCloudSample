package com.lee.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.lee.nacos.consumer
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/9/2021 6:17 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
