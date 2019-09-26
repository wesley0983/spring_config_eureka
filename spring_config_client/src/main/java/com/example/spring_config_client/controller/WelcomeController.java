package com.example.spring_config_client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WelcomeController
{
    @Value("${cn.springcloud.book.config}")
    private String serviceName;

//    @Value("${app.developer.name}")
//    private String serviceOne;

//    @Value("${app.service-name}")
//    private String serviceTwo;

    @GetMapping("/service")
    public String getServiceName() {
        return "service name [ application:"  + this.serviceName  +"] :" ;
    }


}
