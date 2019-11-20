package com.sunkz.cloud.sidecar.consumer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class EchoController {

    private final RestTemplate restTemplate;

    @GetMapping("/")
    public String echo() {
        return restTemplate.getForObject("http://node-service-provide-sidecar/", String.class);
    }

}
