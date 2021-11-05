package com.xworkz.atmapp;

public class MasterCard implements ISwipe{

	@Override
	public void cardInserted() {
		// TODO Auto-generated method stub
		System.out.println("Master card is Inserted");
	}

	@Override
	public void cardRetrieved() {
		// TODO Auto-generated method stub
		System.out.println("Master card is Retrived");
	}

}
