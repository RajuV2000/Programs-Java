package com.xworkz.uniquecheck.Dto;

import java.io.Serializable;

public class CompanyDto implements Serializable{

	private Integer id;
	private String name;
	private String ceoName;
	private Integer turnOver;
	
	public CompanyDto(Integer id, String name, String ceoName, Integer turnOver) {
		super();
		this.id = id;
		this.name = name;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj != null)
		{
			if(obj instanceof CompanyDto)
			{
				CompanyDto com = (CompanyDto)obj;
				
				if(this.getName().equals(com.getName()))
				{
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public Integer getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(Integer turnOver) {
		this.turnOver = turnOver;
	}

	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", name=" + name + ", ceoName=" + ceoName + ", turnOver=" + turnOver + "]";
	}	
}
