class Sofa
{
 public String brand;
 public String type;
 public int price;
 public String color;
 
 public Sofa(String br, String tp, int pc, String clr)
 {
  brand = br;
  type = tp;
  price = pc; 
  color = clr;
 }
 
 public void det()
 {
  System.out.println("\nThese are some of the sofa brands available...\n");
 }
 
 public static void main(String a[])
 {
  Sofa sf = new Sofa("Royal Oak", "Spongy", 28000, "Golden Brown");
  sf.det();
  System.out.println("Brand: " + sf.brand + "\nMaterial Type: " + sf.type +"\nPrice: " + sf.price + "\nColor: " + sf.color + "\n");
  
  Sofa sf1 = new Sofa("CurlOn", "Wooden", 32000, "Royal Brown");
  System.out.println("Brand: " + sf1.brand + "\nMaterial Type: " + sf1.type +"\nPrice: " + sf1.price + "\nColor: " + sf1.color + "\n");
 }
}  