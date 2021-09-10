class Airport
{
 static int terminals[] = new int[5];
 static String planeName[] = new String[5];
public static void main(String a[])
{
 terminals[0] = 1;
 terminals[1] = 2;
 terminals[2] = 3;
 terminals[3] = 4;
 terminals[4] = 5;
 
 planeName[0] = "6E 2000";
 planeName[1] = "6E 2021";
 planeName[2] = "6E 2999";
 planeName[3] = "6E 2013";
 planeName[4] = "6E 2017";

System.out.println("Welcome to Kempegowda Airport Bangalore \n");
System.out.println("Terminal " + terminals[0] + ":" + planeName[0] +"\n" +
"Terminal " + terminals[1] + ":" + planeName[1] +"\n" +
"Terminal " + terminals[2] + ":" + planeName[2] +"\n" +
"Terminal " + terminals[3] + ":" + planeName[3] +"\n" +
"Terminal " + terminals[4] + ":" + planeName[4] );
}
}