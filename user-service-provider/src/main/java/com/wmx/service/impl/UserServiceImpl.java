package com.wmx.service.impl;

import java.util.Arrays;
import java.util.List;

import com.wmx.been.UserAddress;
import com.wmx.gmall.service.UserService;

public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		UserAddress  address1 = new UserAddress(1,"�����к�����֪��·63��","1","����ʦ","010-5652521","Y");
		UserAddress  address2 = new UserAddress(2,"���������������¹�31��","1","����ʦ","010-8322521","N");
		return Arrays.asList(address1,address2);
	}

}