package com.wmx.been;


import java.io.Serializable;

public class UserAddress implements Serializable{
	
	private Integer id;
	private String userAddress;
	private String userId;
	private String consignee;
	private String phoneNum;
	private String isDefault;//是否默认此地址 Y 是 N 否
	
	public UserAddress() {
		super();
	}
	public UserAddress(Integer id,String userAddress,String userId,String consignee,String phoneNum,String isDefault) {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	
	
}
