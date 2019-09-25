package com.example.spring_config_server_bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerBusApplication.class, args);
    }

}
