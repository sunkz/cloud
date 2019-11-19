package com.sunkz.cloud.dubbo.provider.service.impl;

import com.sunkz.cloud.dubbo.api.IDemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${demo.dubbo.service.version}")
public class DemoServiceImpl implements IDemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
