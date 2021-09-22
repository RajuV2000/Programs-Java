class SweetsUtil
{
 public static void main(String a[])
 {
  Sweets sw = new Sweets();
  sw.name = "Mysore pak";
  sw.ing = "Chickpea flour";
  sw.price = 450;
  sw.place = "Mysore";
  
  Sweets sw1 = new Sweets();
  sw1.name = "Malpuri";
  sw1.ing = "Maida Flour";
  sw1.price = 250;
  sw1.place = "Gulbarga";

  Sweets sw2 = new Sweets();
  sw2.name = "Kunda";
  sw2.ing = "Sugar Milk and Curd";
  sw2.price = 280;
  sw2.place = "Belgavi"; 

  sw1.message();
  System.out.println("\n\n" + "Name: " + sw.name +"\n" + "The main ingrediant is "+sw.ing + ".\n"+ "Price per Kg: " + sw.price + "\n" + "And it is from " + sw.place + ".\n\n");
  System.out.println("\n\n" + "Name: " + sw1.name +"\n" + "The main ingrediant is "+sw1.ing + ".\n"+ "Price per Kg: " + sw1.price + "\n" + "And it is from " + sw1.place + ".\n\n");
  System.out.println("\n\n" + "Name: " + sw2.name +"\n" + "The main ingrediant is "+sw2.ing + ".\n"+ "Price per Kg: " + sw2.price + "\n" + "And it is from " + sw2.place + ".\n\n");
  
  System.out.println("You must try these in your next visit!!!");
 }
}
