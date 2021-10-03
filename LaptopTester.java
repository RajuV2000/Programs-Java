class LaptopTester
{
 public static void main(String a[])
 {
  Dell dell = new Dell();
  dell.price = 40000.53;
  dell.processor = "intel i5";
  dell.storage = "1TB";
  dell.modelNo = "45sse3ro8969";
  String dis = dell.store();
  System.out.println(dis);
  dell.display();
 }
}