package com.xworkz.uniquecheck;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.uniquecheck.Dto.CompanyDto;

public class CompanyCommence {

	public static void main(String[] args) {
		
		CompanyDto company = new CompanyDto(10, "Wipro", "Thierry Delaporte", 2683);
		CompanyDto company1 = new CompanyDto(11, "Infosys", "Salil Parekh", 2960);
		CompanyDto company2 = new CompanyDto(12, "TCS", "Rajesh Gopinathan", 4686);
		CompanyDto company3 = new CompanyDto(13, "Google", "Sunder Pichai", 18169);
		CompanyDto company4 = new CompanyDto(14, "Google", "Eric Schmidt", 18170);
		CompanyDto company5 = new CompanyDto(15, "Adobe", "Shantanu Narayan", 12860);
		
		boolean bool = company3.equals(company4);
		System.out.println(bool);
		
		Set<CompanyDto> com = new LinkedHashSet<CompanyDto>();
		
		com.add(company5);
		com.add(company3);
		com.add(company4);
		com.add(company2);
		com.add(company1);
		com.add(company);
		
		System.out.println(com.size());
		
		com.forEach((c)->System.out.println(c));
		
		Optional<CompanyDto> optional = com.stream().filter((e)->e.getName().equals("TCS")).findFirst();
		System.out.println(optional);
	}
}
