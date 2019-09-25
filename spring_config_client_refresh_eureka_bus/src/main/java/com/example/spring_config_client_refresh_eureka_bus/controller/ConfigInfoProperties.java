package com.example.spring_config_client_refresh_eureka_bus.controller;

import org.springframework.stereotype.Component;

/**
 * 使用@ConfigurationProperties or @Value
 *對應config檔案中的屬性
 */
@Component
//@ConfigurationProperties(prefix = "cn.springcloud.book")
public class ConfigInfoProperties {

//    @Value("${cn.springcloud.book.config}")
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
