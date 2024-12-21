package com.sunkz.cloud.nacos.consumer.controller;

import lombok.AllArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class EchoController {

    private final EchoClient echoClient;

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return echoClient.echo(str);
    }

    @FeignClient(name = "nacos-service-provider")
    interface EchoClient {
        @GetMapping("/echo/{string}")
        String echo(@PathVariable String string);
    }

}
