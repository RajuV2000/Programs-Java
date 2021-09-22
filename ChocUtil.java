class ChocUtil
{
 public static void main(String a[])
 {
  Chocolates ch = new Chocolates();
  ch.name = "Dairy Milk";
  ch.brand = "Cadbury";
  ch.price = 100;
  ch.type = "Choco bar";
  
  Chocolates ch1 = new Chocolates();
  ch1.name = "Raspberry & Goji";
  ch1.brand = "Hershey's";
  ch1.price = 55;
  ch1.type = "Exotic Dark choco balls";

  Chocolates ch2 = new Chocolates();
  ch2.name = "KitKat";
  ch2.brand = "Nestle";
  ch2.price = 25;
  ch2.type = "Choco vafours";
  System.out.println("Here is a famous quote about chocolate\n");
  ch.quote();
  System.out.println("\nThese are some famous chocolates in india...\n");
  System.out.println(ch.name + ", this one is from " + ch.brand + " company. This is actually a " + ch.type + ".\n" + ch.brand + " " + ch.name + " is available in various price ranges. Generally the minimum price is of " + ch.price + " Rs/-.\n"); 
  System.out.println(ch1.name + ", this one is from " + ch1.brand + " company. This is actually a " + ch1.type + ".\n" + ch1.brand + " " + ch1.name + " is available in various price ranges. Generally the minimum price is of " + ch1.price + " Rs/-.\n"); 
  System.out.println(ch2.name + ", this one is from " + ch2.brand + " company. This is actually a " + ch2.type + ".\n" + ch2.brand + " " + ch2.name + " is available in various price ranges. Generally the minimum price is of " + ch2.price + " Rs/-.\n");
 }
}
  