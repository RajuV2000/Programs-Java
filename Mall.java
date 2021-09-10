class Mall
{
 static String shopName[] = new String[5];
 static int shopNo[] = new int[5];
public static void main(String a[])
{ 
 shopNo[0] = 1;
 shopNo[1] = 2;
 shopNo[2] = 3;
 shopNo[3] = 4;
 shopNo[4] = 5;

 shopName[0] = "Dominos Pizza Hut";
 shopName[1] = "Cafe Coffee day";
 shopName[2] = "Pantaloons";
 shopName[3] = "Spar Super Market";
 shopName[4] = "Reliance Digital";

System.out.println("Welcome to Bearys City Center Shimogga \n");
for(int z=0; z < shopName.length ; z++)
{
System.out.println(shopName[z] );
}
}
}