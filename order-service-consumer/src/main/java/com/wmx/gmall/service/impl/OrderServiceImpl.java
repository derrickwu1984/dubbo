package com.wmx.gmall.service.impl;

import java.util.List;

import com.wmx.been.UserAddress;
import com.wmx.gmall.service.OrderService;
import com.wmx.gmall.service.UserService;

/*
 * 1、将服务提供者注册到注册中心(如何暴露服务)
 * 		1）、导入dubbo依赖(2.6.2)，引入zookeeper客户端
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * */

public class OrderServiceImpl implements OrderService {
	UserService userService;
	public void initOrder(String userId) {
		// TODO Auto-generated method stub
		//1、查询用户的收货地址
		List <UserAddress> addressList  = userService.getUserAddressList(userId);
		System.out.println(addressList);
		
	}

}
