package com.lee.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package: com.lee.provider
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/9/2021 4:33 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
