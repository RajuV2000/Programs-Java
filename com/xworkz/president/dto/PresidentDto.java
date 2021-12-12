package com.xworkz.president.dto;

public class PresidentDto {

	private String name;
	private String country;
	private int age;
	private String language;
	
	public PresidentDto(String name,String country, int age, String language)
	{
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.language = language;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	@Override
	public String toString() {
		return "PresidentDto [name=" + name + ", country=" + country + ", age=" + age + ", language=" + language + "]";
	}
	
	
	
}
