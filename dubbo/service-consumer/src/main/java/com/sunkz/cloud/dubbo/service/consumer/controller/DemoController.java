package com.sunkz.cloud.dubbo.service.consumer.controller;

import com.sunkz.cloud.dubbo.service.api.IDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(version = "${demo.dubbo.service.version}")
    private IDemoService demoService;

    @GetMapping("/echo/{str}")
    public String sayHello(@PathVariable("str") String name) {
        return demoService.sayHello(name);
    }

}
