package com.sunkz.cloud.nacos.service.consumer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class EchoController {

    private final RestTemplate restTemplate;

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://nacos-service-provider/echo/" + str, String.class);
    }

}
