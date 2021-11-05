package com.xworkz.atmapp;

public class RupayCard implements ISwipe {

	@Override
	public void cardInserted() {
		// TODO Auto-generated method stub
		System.out.println("Rupay card is inserted");
	}

	@Override
	public void cardRetrieved() {
		// TODO Auto-generated method stub
		System.out.println("Rupay card is retrieved");
	}

}
