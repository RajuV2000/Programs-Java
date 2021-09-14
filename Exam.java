class Exam
{
 public static String univ = "VTU";
 
 public static void allow(String[] hallTicket)
 {
        System.out.println("Welcome to " + univ);
 	if(hallTicket != null)
	  {
		System.out.println("Hall ticket issued... kindly go through the following details!!!");
		getHallTicketDetails(hallTicket);
	  }
	else
	  {
	    System.out.println("No hallticket found!!");
	  }
 }
 public static void allow(int feesAmnt)
 {
	if(feesAmnt>=1000)
	  {
		System.out.println(feesAmnt);
	  }
	else
	  {
	    System.out.println("Please pay the Fees!!!");
	  }
 }
 public static void getHallTicketDetails(String[] hallTicket)
  {
	for(int i=0; i<hallTicket.length; i++)
	   {
		System.out.println(hallTicket[i]);
	   }
  }
}