package com.xworkz.phoneapp;

import com.xworkz.phoneapp.contactsDto.ContactsDTO;

public class Phone {
	public ContactsDTO[] contacts;
	private int index;
	
	public Phone(int size){
		  contacts = new ContactsDTO[size];
		  
		}

		public boolean addContactDetails(ContactsDTO contacts){
		boolean contactAdded=false;
		if(contacts !=null){
		  this.contacts[index++]= contacts;
		  contactAdded=true;
		}

		else{
		System.out.println("No Contacts added");
		return contactAdded=false;
		}
		return contactAdded;
		}

		public void getAllContacts(){
		for(int i=0;i<contacts.length;i++){
		System.out.println(contacts[i]);
		}
		}
		
		
		public ContactsDTO getContactByName(String contactName)
		{
			ContactsDTO contactsDTO=null;
			if(contactName != null)
			{
			   for(int i=0;i<contacts.length;i++)
			   {
			     if(contacts[i].getContactName().equals(contactName))
			     {
			    	 contactsDTO=contacts[i];
			     }
			  
			     else{
			    	 System.out.println("No Contacts Found...");
			     }
			   }
			}
			return contactsDTO;
		}

		public ContactsDTO getContactByContactNum(long contactNum)
		{
			ContactsDTO contactsDTO=null;
			if(contactNum >0)
			{
				for(int i=0;i<contacts.length;i++)
				{
					if(contacts[i].getContactNum()==contactNum)
					{
						contactsDTO=contacts[i];
					}
		  
					else{
						System.out.println("No Contacts Found....");
					}
				}
			}
			return contactsDTO;
		}

		
	public ContactsDTO updateContactNumByContactName(String contactName,long contactNum)
	{
		ContactsDTO contactsDto = null;
		
		if(contactNum>0 && contactName!=null)
		{
		   for(int i=0;i<contacts.length;i++)
		   {
		     if(contacts[i].getContactName().equals(contactName))
		     {
		    	 contacts[i].setContactNum(contactNum);
		    	 contactsDto = contacts[i];
		     }
		     else
		    	 System.out.println("No Contacts found...");
		  }
		}
		return contactsDto;
	}

	public ContactsDTO deleteContactsByContactName(String contactName)
	{
		ContactsDTO contactDto = null;
		int y=0;
		
		if(contactName != null){
		for(int i=0; i<contacts.length; i++)
		{
			if(contacts[i].getContactName().equals(contactName))
			{
				y = i;
				break;
			}
			else
				System.out.println("No Contacts found...");
			if(contacts.length == 1)
			{
				contacts[i] = null;
				contactDto = contacts[i];
			}
			else
			{
				for(int x=y; x<contacts.length-1; x++)
				{
					contacts[i] = contacts[i+1];
					contactDto = contacts[i];
				}
			}
		}
	}
	return contactDto;
		
	}
}
