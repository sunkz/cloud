package com.sunkz.web.mq;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Producer {

    @NonNull
    private final RocketMQTemplate rocketMQTemplate;
    private int k = 0;

    @GetMapping("/send")
    public void send() {
        for (int i = 0; i < 50; i++) {
            rocketMQTemplate.convertAndSend("test-topic-1", "msg:" + k++);
        }
    }

}
