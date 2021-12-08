package com.xworkz.dao.pg;

public class PgCommence {
	public static void main(String[] args) {
		
		PgDao dao = new PgDao();
		dao.save("SAI DEEP PG");
		
		boolean found=dao.find("Sai Deep Pg");
		System.out.println(found);
		
		found = dao.findBycaseInSensitive("sai Deep pg");
		System.out.println(found);
		found = dao.findBycaseSensitiveAndTrimmed("sai deeppg");
		System.out.println(found);
	}
}
