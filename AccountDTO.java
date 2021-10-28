package com.xworkz.bankApp.dto;

public class AccountDTO {
	public AccountDTO()
	{
		System.out.println(this.getClass().getSimpleName()+" object is created...");
	}
	private long accntNum;
	private String name;
	private int age;
	private long mblNum;
	private long adharNum;
	private String accntType;
	
	
	public long getAccntNum() {
		return accntNum;
	}
	public void setAccntNum(long accntNum) {
		this.accntNum = accntNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMblNum() {
		return mblNum;
	}
	public void setMblNum(long mblNum) {
		this.mblNum = mblNum;
	}
	public long getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}
	public String getAccntType() {
		return accntType;
	}
	public void setAccntType(String accntType) {
		this.accntType = accntType;
	}
	
	
	@Override
	public String toString() {
		return "AccountDTO [accntNum=" + this.accntNum + ", name=" + this.name + ", age=" + this.age + ", mblNum=" + this.mblNum
				+ ", adharNum=" + this.adharNum + ", accntType=" + this.accntType + "]";
	}
}
