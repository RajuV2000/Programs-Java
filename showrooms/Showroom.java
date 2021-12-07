package com.xworkz.cloneable.showrooms;

public class Showroom implements Cloneable{
	
	private String name;
	private String type;
	private int collections;
	private String location;
	private long contact;
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
	public int getCollections() {
		return collections;
	}
	public void setCollections(int collections) {
		this.collections = collections;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Showroom [name=" + name + ", type=" + type + ", collections=" + collections + ", location=" + location
				+ ", contact=" + contact + "]";
	}
	
	
}
