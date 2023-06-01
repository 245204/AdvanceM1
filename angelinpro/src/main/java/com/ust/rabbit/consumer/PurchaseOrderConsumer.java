package com.ust.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ust.rabbit.config.MessagingConfig;
import com.ust.rabbit.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {

	
	//is like groupp(queue)
	//this is listener
	//when 
	
	@RabbitListener(queues=MessagingConfig.QUEUE)
	public void consumeMeaageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("Message recived from queue: " + orderStatus);
	}
	
}
