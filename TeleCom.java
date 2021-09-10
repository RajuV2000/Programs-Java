class TeleCom
{
 public static String netWorkName = "Airtel";
 public static int age = 18;

 public static String eligble(String docs[])
 {
  System.out.println("Welcome to " + netWorkName);
  String elig = " You are not eligible to get a Sim card";
  if(age >= 18)
  { 
    if(docs != null)
	{ 
	  elig = "You are eligible to get a simcard";
	  getDocs(docs);
	  System.out.println("Congrats you got a simcard");
	  return elig;
	}
    else
	{
	  System.out.println("Sorry insufficient documents!!!");
	}
   }
   else
	{
	  System.out.println("Sorry you are under age to get a sim card");
	}
   return elig;
  }
  public static void getDocs(String docs[])
  {
   for(int i=0; i< docs.length ; i++)
      {
	System.out.println(docs[i]);
      }
   }
}

  