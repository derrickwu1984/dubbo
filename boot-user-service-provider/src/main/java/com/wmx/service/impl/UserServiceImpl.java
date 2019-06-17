package com.wmx.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.wmx.been.UserAddress;
import com.wmx.gmall.service.UserService;
@Service
@Component
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		UserAddress  address1 = new UserAddress(1,"北京市海淀区知春路63号","1","苍老师","010-5652521","Y");
		UserAddress  address2 = new UserAddress(2,"北京市西城区北下关31号","1","李老师","010-8322521","N");
		return Arrays.asList(address1,address2);
	}

}
