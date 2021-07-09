package com.lee.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Package: com.lee.nacos.consumer.controller
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/9/2021 6:21 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */
@RestController
public class NacosConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping(value = "/test/app/name")
    public String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String url = String.format("http://%s:%s/test/%/",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        return restTemplate.getForObject(url,String.class);
    }
}
