package com.wmx.gmall.service.impl;

import java.util.List;

import com.wmx.been.UserAddress;
import com.wmx.gmall.service.OrderService;
import com.wmx.gmall.service.UserService;

/*
 * 1���������ṩ��ע�ᵽע������(��α�¶����)
 * 		1��������dubbo����(2.6.2)������zookeeper�ͻ���
 * 2���÷���������ȥע�����Ķ��ķ����ṩ�ߵķ����ַ
 * */

public class OrderServiceImpl implements OrderService {
	UserService userService;
	public void initOrder(String userId) {
		// TODO Auto-generated method stub
		//1����ѯ�û����ջ���ַ
		List <UserAddress> addressList  = userService.getUserAddressList(userId);
		System.out.println(addressList);
		
	}

}