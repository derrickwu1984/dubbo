package com.wmx.gmall.service;

import java.util.List;

import com.wmx.been.UserAddress;

public interface OrderService {
	/*
	 * ��ʼ������
	 * */
	public List<UserAddress> initOrder(String userId);

}
