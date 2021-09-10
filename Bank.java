class Bank
{
 public static String bankName = "Karnataka Bank";
 public static boolean vaccntd = true;
 
 public static void accnt(String[] docum)
 {
  String accntCreated = "Your account is not created";
  if(vaccntd == true)
  { 
    if(docum !=null)
	{
 	  accntCreated = "Your account has been Created";
 	  getDocum(docum);
	  long accNum = 25896456215655l;
	  System.out.println("Your account number is " + accNum);
	}
    else
	{ 
	  System.out.println("Sorry insufficient details!! Account not created");
	}
   }
   else
   { 
     System.out.println(docum[0] + " first gands aagale!!!"  );
   }
  }
 public static void getDocum(String[] docum)
 {
   for(int i=0;i<docum.length;i++)
	{
	  System.out.println(docum[i]);
	}
  }
}