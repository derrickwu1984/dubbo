package com.wmx.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmx.been.UserAddress;
import com.wmx.gmall.service.OrderService;
import com.wmx.gmall.service.UserService;

/*
 * 1、将服务提供者注册到注册中心(如何暴露服务)
 * 		1）、导入dubbo依赖(2.6.2)，引入zookeeper客户端
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	UserService userService;
	public void initOrder(String userId) {
		System.out.println("用户id="+userId);
		// TODO Auto-generated method stub
		//1、查询用户的收货地址
		List <UserAddress> addressList  = userService.getUserAddressList(userId);
//		System.out.println(addressList);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
	}
}
