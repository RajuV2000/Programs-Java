package com.xworkz.drone;

public class DroneCommence {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded....");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		
			
	}
	
}
