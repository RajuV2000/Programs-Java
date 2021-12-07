package com.xworkz.cloneable.travelAgency;

public class TravelAgency implements Cloneable{
	
	private String name;
	private String loc;
	private int noOfPackages;
	private int avgPrice;
	private long contactNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getNoOfPackages() {
		return noOfPackages;
	}
	public void setNoOfPackages(int noOfPackages) {
		this.noOfPackages = noOfPackages;
	}
	public int getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(int avgPrice) {
		this.avgPrice = avgPrice;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "TravelAgency [name=" + name + ", loc=" + loc + ", noOfPackages=" + noOfPackages + ", avgPrice="
				+ avgPrice + ", contactNum=" + contactNum + "]";
	}
	
	
}
