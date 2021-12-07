package com.xworkz.cloneable.stadium;

public class Stadium implements Cloneable{

	private String name;
	private long capacity;
	private int gates;
	private String location;
	private boolean isOutdoor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public int getGates() {
		return gates;
	}
	public void setGates(int gates) {
		this.gates = gates;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isOutdoor() {
		return isOutdoor;
	}
	public void setOutdoor(boolean isOutdoor) {
		this.isOutdoor = isOutdoor;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Stadium [name=" + name + ", capacity=" + capacity + ", gates=" + gates + ", location=" + location
				+ ", isOutdoor=" + isOutdoor + "]";
	}
	
	
}
