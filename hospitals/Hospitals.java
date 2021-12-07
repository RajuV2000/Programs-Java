package com.xworkz.cloneable.hospitals;

public class Hospitals implements Cloneable{
	
	private String name;
	private String type;
	private int beds;
	private String location;
	private long contactNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
		return "Hospitals [name=" + name + ", type=" + type + ", beds=" + beds + ", location=" + location
				+ ", contactNum=" + contactNum + "]";
	}

}
