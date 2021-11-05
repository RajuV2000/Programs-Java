package com.xworkz.atmapp;

public class CardFactory {
	public static ISwipe getCard(String swipe)
	{
		if(swipe.equals("RupayCard"))
		{
			return new RupayCard();
		}
		else if(swipe.equals("MasterCard"))
		{
			return new MasterCard();
		}
		else
			System.out.println("No cards found....");
		
	return null;
	}
}
