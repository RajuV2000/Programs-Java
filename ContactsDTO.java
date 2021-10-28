package com.xworkz.phoneapp.contactsDto;

public class ContactsDTO {

	public ContactsDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + " object is created...");
	}
	
	private long contactNum;
	private String contactName;
	
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	@Override
	public String toString() {
		return "ContactsDTO [contactNum=" + contactNum + ", contactName=" + contactName + "]";
	}
}
