package com.wmx.gmall.service;

import java.util.List;

import com.wmx.been.UserAddress;

/*
 * 用户服务
 * 
 * */
public interface UserService {
	/*
	 * 按照用户id，返回收货地址
	 * */
	public List<UserAddress> getUserAddressList(String userId);

}
