class GasCylinder
{
 public String agency;
 public int weight;
 public String color;
 public int price;
 
 public GasCylinder(String agency, int weight, String color, int price)
 {
  this.agency = agency;
  this. weight = weight;
  this. color = color;
  this. price = price;
 }
 public void msg()
 {
  System.out.println("\nThese are some agencies details who provides Gas Cylinders.....\n");
 } 
 public static void main(String a[])
 {
  GasCylinder gc = new GasCylinder("HP", 15, "Red", 110);
  gc.msg();
  System.out.println("Agency: " + gc.agency+ "\nWeight: " + gc.weight + "\nColor of Cylinder: " + gc.color+"\nPrice: " + gc.price + "\n");
  
  GasCylinder gc1 = new GasCylinder("indane", 14, "Blue", 120);
  System.out.println("Agency: " + gc1.agency+ "\nWeight: " + gc1.weight + "\nColor of Cylinder: " + gc1.color+"\nPrice: " + gc1.price + "\n");
  
  GasCylinder gc2 = new GasCylinder("Bharath", 16, "Red", 105);
  System.out.println("Agency: " + gc2.agency+ "\nWeight: " + gc2.weight + "\nColor of Cylinder: " + gc2.color+"\nPrice: " + gc2.price + "\n");
  }
}
  
 