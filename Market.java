class Market 
{
 static String vegName1 = "Tomato";
 static int tomPrice = 80;
 static boolean isTomCheap = true;
 
 static String vegName2 = "Onion";
 static int oniPrice = 100;
 static boolean isOniCheap = false;

 static String vegName3 = "Beans";
 static int beanPrice = 30;
 static boolean isBeaCheap = true;
 
 static String vegName4 = "Chilly";
 static int chilPrice = 20;
 static boolean isChilCheap = true;

public static void main(String a[])
{
 System.out.println("Vegetable name: " + vegName1);
 System.out.println("Vegetable price per Kg: " + tomPrice);
 System.out.println("Is it cheaper?\n" + isTomCheap);

 System.out.println("Vegetable name: " + vegName2);
 System.out.println("Vegetable price per Kg: " + oniPrice);
 System.out.println("Is it cheaper?\n" + isOniCheap);

 System.out.println("Vegetable name: " + vegName3);
 System.out.println("Vegetable price per Kg: " + beanPrice);
 System.out.println("Is it cheaper?\n" + isBeaCheap);

 System.out.println("Vegetable name: " + vegName4);
 System.out.println("Vegetable price per Kg: " + chilPrice);
 System.out.println("Is it cheaper?\n" + isChilCheap);
}
}