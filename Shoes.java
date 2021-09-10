class Shoes
{
public static void main(String a[])
{
 String brand1 = "PUMA";
 String shoe1 = "one-8";
 int price1 = 4000;
 boolean is1Avl = true;

 String brand2 = "ADIDAS";
 String shoe2 = "RESPONSE SR 5.0";
 int price2 = 5489;
 boolean is2Avl = true;

 String brand3 = "NIKE";
 String shoe3 = "Flex";
 int price3 = 3746;
 boolean is3Avl = false;
 
 String brand4 = "Wood Land";
 String shoe4 = "Boot";
 int price4 = 3424;
 boolean is4Avl = true;

 System.out.println("Brand name: " + brand1);
 System.out.println("Model: " + shoe1);
 System.out.println("Price of " + brand1  + " " + shoe1  + " is: " + price1 + "Rs/-.");
 System.out.println("Is that model is available on flipkart?\n" + is1Avl);

 System.out.println("Brand name: " + brand2);
 System.out.println("Model: " + shoe2);
 System.out.println("Price of " + brand2  + " " + shoe2  + " is: " + price2 + "Rs/-.");
 System.out.println("Is that model is available on flipkart?\n" + is2Avl);
 
 System.out.println("Brand name: " + brand3);
 System.out.println("Model: " + shoe3);
 System.out.println("Price of " + brand3  + " " + shoe3  + " is: " + price3 + " Rs/-.");
 System.out.println("Is that model is available on flipkart?\n" + is3Avl);

 System.out.println("Brand name: " + brand4);
 System.out.println("Model: " + shoe4);
 System.out.println("Price of " + brand4  + " " + shoe4  + " is: " + price4 + " Rs/-.");
 System.out.println("Is that model is available on flipkart?\n" + is4Avl);
}
}