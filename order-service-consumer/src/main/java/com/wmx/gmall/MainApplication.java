package com.wmx.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wmx.gmall.service.OrderService;

public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext =new  ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.initOrder("1");
		System.in.read();
	}

}
