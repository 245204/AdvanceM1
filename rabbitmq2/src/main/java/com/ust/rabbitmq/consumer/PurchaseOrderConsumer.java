package com.ust.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ust.rabbitmq.config.MessagingConfig;
import com.ust.rabbitmq.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {
	
	@RabbitListener(queues = " ")
	public void ConsumerMessageFromQueue(OrderStatus orderstatus) {
		System.out.println("MESSAGE RECIEVED FROM QUEUE:" + orderstatus);
	}

}
