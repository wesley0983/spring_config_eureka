package com.example.spring_config_client_refresh_bus.controller;

import com.example.spring_config_client_refresh_bus.wesley.CustomTrace;
import com.example.spring_config_client_refresh_bus.wesley.CustomTraceRepositoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RefreshScope
@RestController
public class WelcomeController
{
    @Value("${cn.springcloud.book.config}")
    private String serviceName;

    @Value("${app.developer.name}")
    private String serviceOne;

    @Value("${app.service-name}")
    private String serviceTwo;

    @GetMapping("/service")
    public String getServiceName() {
        return "service name [ application:"  + this.serviceOne +  " , department-service: " + this.serviceTwo +" , config-info-dev:"+ this.serviceName +"] :" ;//+ this.serviceTwo;
    }

    @Bean
    public CustomTraceRepositoryImpl customeTraceRepository() {
        return new CustomTraceRepositoryImpl();
    }

    @RequestMapping(value = "/trace")
    public List<CustomTrace> trace(HttpServletRequest request) throws IOException {
        return customeTraceRepository().findAll();
    }
}
