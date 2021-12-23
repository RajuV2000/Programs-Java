package com.xworkz.uniquecheck;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.uniquecheck.Dto.ProductDto;

public class ProductCommence {

	public static void main(String[] args) {
		
		ProductDto prod1 = new ProductDto(1, "Table", "Home Utility", 1200);
		ProductDto prod2 = new ProductDto(2, "Charger", "Electronics", 500);
		ProductDto prod3 = new ProductDto(3, "Table", "Office Utility", 1200);
		ProductDto prod4 = new ProductDto(4, "Water bottle", "Home Utility", 250);
		ProductDto prod5 = new ProductDto(5, "Laptop", "Electronics", 40000);
		ProductDto prod6 = new ProductDto(6, "Chocolate", "Food", 60);
		
		boolean nodu = prod1.equals(prod3);
		System.out.println(nodu);
		
		Set<ProductDto> products = new LinkedHashSet<ProductDto>();
		products.add(prod3);
		products.add(prod6);
		products.add(prod2);
		products.add(prod5);
		products.add(prod1);
		products.add(prod4);
		
		System.out.println(products.size());
		
		products.forEach((p)->System.out.println(p));
		
		Optional<ProductDto> option = products.stream().filter((p)->p.getType().equals("Electronics")).findFirst();
		System.out.println(option);
	}
}
