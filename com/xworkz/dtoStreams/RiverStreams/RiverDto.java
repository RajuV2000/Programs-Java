package com.xworkz.dtoStreams.RiverStreams;

import java.io.Serializable;

public class RiverDto implements Serializable{
	
	private Integer id;
	private String name;
	private String stateName;
	private Integer length;
	private Integer noOfDams;
	
	public RiverDto(Integer id, String name, String stateName, Integer length, Integer noOfDams) {
		super();
		this.id = id;
		this.name = name;
		this.stateName = stateName;
		this.length = length;
		this.noOfDams = noOfDams;
	}

	public synchronized Integer getId() {
		return id;
	}

	public synchronized void setId(Integer id) {
		this.id = id;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getStateName() {
		return stateName;
	}

	public synchronized void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public synchronized Integer getLength() {
		return length;
	}

	public synchronized void setLength(Integer length) {
		this.length = length;
	}

	public synchronized Integer getNoOfDams() {
		return noOfDams;
	}

	public synchronized void setNoOfDams(Integer noOfDams) {
		this.noOfDams = noOfDams;
	}

	@Override
	public String toString() {
		return "RiverDto [id=" + id + ", name=" + name + ", stateName=" + stateName + ", length=" + length
				+ ", noOfDams=" + noOfDams + "]";
	}
	
	
}
