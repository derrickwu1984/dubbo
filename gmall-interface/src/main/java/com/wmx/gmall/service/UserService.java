package com.wmx.gmall.service;

import java.util.List;

import com.wmx.been.UserAddress;

/*
 * �û�����
 * 
 * */
public interface UserService {
	/*
	 * �����û�id�������ջ���ַ
	 * */
	public List<UserAddress> getUserAddressList(String userId);

}
