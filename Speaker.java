import java.util.Scanner;

class Speaker
{
  
  static int minVol = 0;
  static int maxVol = 3;
  static int currentVol;
  static boolean isConnected = false;
  
 public static boolean onOrOff()
 {
   Scanner sc = new Scanner(System.in);
  if(isConnected==false)
    {   
	System.out.println("press 1 to turn ON, 0 to Turn OFF!!");
	int on = sc.nextInt();
	if(on==1)
	{
 	  isConnected = true;
	  System.out.println("Speaker is turned ON!!!");
 	  return isConnected;
	}
	else
	{
	  isConnected = false;
	  System.out.println("Speaker is turned OFF!!!");
	  return isConnected;
	}
    }
  else if(isConnected==true)
    {   
	isConnected = false;
	System.out.println("Speaker is turned OFF!!!");
 	return isConnected;
    }
 }

 public static void increaseVol()
 {
  if(isConnected)
   { 
	if(currentVol<maxVol)
	 {
	   currentVol = currentVol +1;
	   System.out.println("The current volume is: " + currentVol);
	 }
	else
	 {
	   System.out.println("Maximum volume is reached!!");
	 }
   }
  }
 public static void decreaseVol()
 {
  if(isConnected)
   {
	if(currentVol>minVol)
	{
	  currentVol = currentVol-1;
	  System.out.println("The current Vol is: " + currentVol);
	}
	else
	{
	  System.out.println("Minimum volume is reached!!");
	}
   }
 }
}