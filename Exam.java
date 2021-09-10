class Exam
{
 public static String univName = "VTU";
 public static int fees = 100;

 public static boolean allow(String hallTicket[])
{
 System.out.println("Welcome to " + univName);
 boolean allowedToWrite = false;
 if(fees > 1200)
 {
  if(hallTicket != null)
  {
    allowedToWrite = true;
    getHallTicket(hallTicket);
    return allowedToWrite;
   }
   else
   {
    System.out.println("No Hallticket!!!! Cannot allowed");
    }
   }
   else
   {
     System.out.println("Fees katto Gubaal" + " " + hallTicket[0]);
    }
    return allowedToWrite;
 }
 public static void getHallTicket(String hallTicket[])
 {
   for(int i=0; i< hallTicket.length; i++)
   { 
 	System.out.println(hallTicket[i]);
   }
 }
}