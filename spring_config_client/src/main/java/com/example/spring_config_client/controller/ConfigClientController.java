package com.example.spring_config_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("configConsumer")
public class ConfigClientController {

    @Autowired
    private ConfigInfoProperties configInfoProperties ;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configInfoProperties.getConfig();
    }
}
