package com.SpringCloudExample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.SpringCloudExample.controller
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/8/2021 4:45 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */

@Slf4j
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get(){
        log.info("GetMapping!");
        return useLocalCache;
    }
}
