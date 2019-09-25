package com.example.spring_config_client_refresh.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用@ConfigurationProperties or @Value
 *對應config檔案中的屬性
 */
@Component
@ConfigurationProperties(prefix = "cn.springcloud.book")
public class ConfigInfoProperties {

//    @Value("${app.developer.name}")
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
