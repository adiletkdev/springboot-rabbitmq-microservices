package net.adiletkdev.emailservice.consumer;

import net.adiletkdev.orderservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.email.name}"})
    public void consume(OrderEvent event) {
        LOGGER.info(String.format("Order event received int email service -> %s", event.toString()));

        // email service needs to email customer
    }
}
