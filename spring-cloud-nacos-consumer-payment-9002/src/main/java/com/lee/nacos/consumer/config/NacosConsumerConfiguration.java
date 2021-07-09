package com.lee.nacos.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Package: com.lee.nacos.consumer.config
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/9/2021 6:19 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */
@Configuration
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
