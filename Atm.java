package com.xworkz.atmapp;

import com.xworkz.atmapp.atmDto.AtmDto;

public class Atm {
	public AtmDto[] atm;
	
	private int index;
	
	public Atm(int size)
	{
		atm = new AtmDto[size];
	}
	
	public boolean addAtmDetails(AtmDto atm)
	{
		boolean detAdded = false;
		if(atm != null)
		{
			this.atm[index++] = atm;
			detAdded = true;
		}
		else
		{
			System.out.println("Atm details not added...");
			detAdded = false;
		}
		
		return detAdded;
	}
	
	public AtmDto getAllDetailsByPassword(String passWord)
	{
		AtmDto pw = null;
		
		if(passWord != null)
		{
			for(int i=0; i<atm.length; i++)
			{
				if(atm[i].getPassWord().equals(passWord))
				{
					pw = atm[i];
					break;
				}
				else
					System.out.println("Incorrect Password...");
			}
		}
		return pw;
	}
	
	public void updatePasswordByOldPassWord(String oldPw, String passWord)
	{
		AtmDto pw = null;
		
		if(oldPw != null && passWord != null)
		{
			for(int i=0; i<atm.length;i++)
			{
				if(atm[i].getPassWord().equals(oldPw))
				{
					atm[i].setPassWord(passWord);
					System.out.println("Password is updated succesfully...");
					break;
				}
				else
					System.out.println("Entered Password is Incorrect...");
			}
		}
	}
	
	public AtmDto updateBalanceByPassword(String passWord, double balance)
	{
		AtmDto pw = null;
		
		if(passWord != null && balance> 0)
		{
			for(int i=0; i<atm.length;i++)
			{
				if(atm[i].getPassWord().equals(passWord))
				{
					double get = atm[i].getBalance() + balance;
					atm[i].setBalance(get);
					pw = atm[i];
					break;
				}
				else
					System.out.println("Entered Password is Incorrect...");
			}
		}
		return pw;
	}
}
