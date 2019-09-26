package com.example.spring_config_client_refresh_bus.wesley;

import java.util.List;
import java.util.Map;

public interface CustomeTraceRepository {
    List<CustomTrace> findAll();

    void add(Map<String, Object> arg0);
}
