class Airport1
{
 
 static String planeName[] = {"6E 2000", "6E 2021", "6E 2999", "6E 2013", "6E 2017"}; 
 static int terminalNo[] = { 1, 2, 3, 4, 5};
public static void main(String a[])
{
 getplaneName();
}

public static void getplaneName()
{
 
 for(int z=0; z < planeName.length; z++)
{ 
 System.out.print(planeName[z]+ " :  " + terminalNo[z] + "\n");
}
}
}