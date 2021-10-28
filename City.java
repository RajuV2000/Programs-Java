package com.xworkz.cityapp;

import com.xworkz.cityapp.CompaniesDto.CompaniesDTO;

public class City {
	public CompaniesDTO[] companies;
	  private int index;
	  
	public City(int size){
	  companies = new CompaniesDTO[size];
	  
	}

	public boolean addCompanyDetails(CompaniesDTO companies){
	boolean companyAdded=false;
	if(companies !=null){
	  this.companies[index++]= companies;
	  companyAdded=true;
	}

	else{
	System.out.println("No Company added");
	return companyAdded=false;
	}
	return companyAdded;
	}

	public void getAllCompanies(){
	for(int i=0;i<companies.length;i++){
	System.out.println(companies[i]);
	}
	}
	
	
	public CompaniesDTO getCompanyByName(String companyName)
	{
		CompaniesDTO companyDTO=null;
		if(companyName != null)
		{
		   for(int i=0;i<companies.length;i++)
		   {
		     if(companies[i].getCompanyName().equals(companyName))
		     {
		    	 companyDTO=companies[i];
		     }
		  
		     else{
		    	 System.out.println("No Company Found...");
		     }
		   }
		}
		return companyDTO;
	}

	public CompaniesDTO getCompanyByType(String companyType)
	{
		CompaniesDTO companyDTO=null;
		if(companyType !=null)
		{
			for(int i=0;i<companies.length;i++)
			{
				if(companies[i].getCompanyType().equals(companyType))
				{
					companyDTO=companies[i];
				}
	  
				else{
					System.out.println("No Company Found....");
				}
			}
		}
		return companyDTO;
	}

	public CompaniesDTO getCompanyByRevenue(int revenue)
	{
		CompaniesDTO companyDTO=null;
		if(revenue > 0)
		{
		   for(int i=0;i<companies.length;i++)
		   {
		     if(companies[i].getCompanyRevenue()== revenue)
		     {
		    	 companyDTO = companies[i];
		     }
		  
		     else{
		    	 System.out.println("No Company Found...");
		     }
		   }
		}
		return companyDTO;
	}
	
public CompaniesDTO updateCompanyRevenueByCompanyName(String companyName,int companyRevenue)
{
	CompaniesDTO companyDto = null;
	
	if(companyRevenue>0 && companyName!=null)
	{
	   for(int i=0;i<companies.length;i++)
	   {
	     if(companies[i].getCompanyName().equals(companyName))
	     {
	    	 companies[i].setCompanyRevenue(companyRevenue);
	    	 companyDto = companies[i];
	     }
	     else
	    	 System.out.println("No Comapany found...");
	  }
	}
	return companyDto;
}

public CompaniesDTO deleteCompanyByComapanyName(String companyName)
{
	CompaniesDTO companyDto = null;
	int y=0;
	
	if(companyName != null){
	for(int i=0; i<companies.length; i++)
	{
		if(companies[i].getCompanyName().equals(companyName))
		{
			y = i;
			break;
		}
		else
			System.out.println("No records found...");
		if(companies.length == 1)
		{
			companies[i] = null;
			companyDto = companies[i];
		}
		else
		{
			for(int x=y; x<companies.length-1; x++)
			{
				companies[i] = companies[i+1];
				companyDto = companies[i];
			}
		}
	}
}
return companyDto;
	
}
}
