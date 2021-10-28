package com.xworkz.cityapp.CompaniesDto;

public class CompaniesDTO {
	public CompaniesDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + " object is created..");
	}
	
	private String companyName;
	private String companyType;
	private int companyRevenue;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public int getCompanyRevenue() {
		return companyRevenue;
	}
	public void setCompanyRevenue(int companyRevenue) {
		this.companyRevenue = companyRevenue;
	}
	
	@Override
	public String toString() {
		return "CompaniesDTO [companyName=" + companyName + ", companyType=" + companyType + ", companyRevenue="
				+ companyRevenue + "]";
	}
}
