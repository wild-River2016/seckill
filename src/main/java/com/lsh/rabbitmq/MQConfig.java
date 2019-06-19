package com.lsh.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ClassName MQConfig
 * @Description: MQ配置
 * @Author lsh
 * @Date 2019/6/18 21:21
 * @Version
 */
@Configuration
public class MQConfig {

    public static final String QUEUE = "queue";
    public static final String MIAOSHA_QUEUE = "miaosha.queue";

    @Bean
    public Queue queue() {
        return new Queue(MQConfig.QUEUE, true);
    }
}
