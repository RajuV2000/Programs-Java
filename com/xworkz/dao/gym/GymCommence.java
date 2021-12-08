package com.xworkz.dao.gym;

public class GymCommence {
	public static void main(String[] args) {
		
		GymDao dao = new GymDao();
		
		dao.save("Sweat N Fit");
		
		boolean found = dao.find("SWEAT N FIT");
		
		System.out.println(found);
		
		found = dao.findByCaseInsensitive("SweAT N fiT");
		
		System.out.println(found);
		
		found = dao.findByCaseInsensitiveAndTrimmed("SweaT   N  fit");
		
		System.out.println(found);
	}
}
