package com.xworkz.atmapp.atmDto;

public class AtmDto {
	private double balance;
	private long mblNum;
	private String passWord;
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getMblNum() {
		return mblNum;
	}
	public void setMblNum(long mblNum) {
		this.mblNum = mblNum;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	@Override
	public String toString() {
		return "AtmDto [balance=" + balance + ", mblNum=" + mblNum + "]";
	}
	
}
