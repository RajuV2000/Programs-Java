package com.xworkz.functional.email;

public class EmailCommence {
	public static void main(String[] args) {
		
		EmailDao dao = new EmailDao();
		
		dao.save("rajvrj2000@gmail.com");
		dao.save("rajvraj55@gmail.in");
		
		EmailSearch find = new SearchMail();
		boolean found = dao.search(find, "rajvraj55@gmail.com"); //replace com by in to get true..
		
		System.out.println(found);
		
		EmailSearch find1 = new SearchMailCaseInsensitive();
		found = dao.search(find1, "RajVraj55@gmail.com"); //replace com by in to get true..
		
		System.out.println(found);
		
		EmailSearch find2 = new SearchMailForCom();
		found = dao.search(find2, "com");
		
		System.out.println(found);
		
		EmailSearch find3 = new SearchMailForIn();
		found = dao.search(find3, "in");
		
		System.out.println(found);
	}
}
