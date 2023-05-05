package com.sunkz.web.mq;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "consumer_group_1")
public class Consumer implements RocketMQListener<String> {

    @SneakyThrows
    public void onMessage(String message) {
        TimeUnit.SECONDS.sleep(10);
        log.info("{}:received: {}", LocalDateTime.now(), message);
    }

}