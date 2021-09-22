import java.util.Scanner;
class PcDet
{
 public static void main(String a[])
 {
   Scanner sc = new Scanner(System.in);
   Pc pc1 = new Pc();
   System.out.println("Enter the brand Name: ");
   pc1.brand = sc.next();
   System.out.println("Enter the Model Number: ");
   pc1.mdlNum = sc.nextInt();
   System.out.println("Enter the processor name: ");
   pc1.processor = sc.next();
   System.out.println("Which generation Laptop?");
   pc1.gen = sc.nextInt();
   System.out.println(" Enter the price: ");
   pc1.price = sc.nextInt();

   pc1.details();
   System.out.println("Name: " +pc1.brand + "\n" +"Model Number: " + pc1.mdlNum + "\n" +"Processor: " + pc1.processor + "\n" + "Generation: " + pc1.gen + "\n" +"Price: " + pc1.price);


   
   Pc pc2 = new Pc();
   System.out.println("Enter the brand Name: ");
   pc2.brand = sc.next();
   System.out.println("Enter the Model Number: ");
   pc2.mdlNum = sc.nextInt();
   System.out.println("Enter the processor name: ");
   pc2.processor = sc.next();
   System.out.println("Which generation Laptop?");
   pc2.gen = sc.nextInt();
   System.out.println(" Enter the price: ");
   pc2.price = sc.nextInt();

   pc2.details();
   System.out.println("Name: " +pc2.brand + "\n" +"Model Number: " + pc2.mdlNum + "\n" +"Processor: " + pc2.processor + "\n" + "Generation: " + pc2.gen + "\n" +"Price: " + pc2.price);

   
   Pc pc3 = new Pc();
   System.out.println("Enter the brand Name: ");
   pc3.brand = sc.next();
   System.out.println("Enter the Model Number: ");
   pc3.mdlNum = sc.nextInt();
   System.out.println("Enter the processor name: ");
   pc3.processor = sc.next();
   System.out.println("Which generation Laptop?");
   pc3.gen = sc.nextInt();
   System.out.println(" Enter the price: ");
   pc3.price = sc.nextInt();

   pc3.details();
   System.out.println("Name: " +pc3.brand + "\n" +"Model Number: " + pc3.mdlNum + "\n" +"Processor: " + pc3.processor + "\n" + "Generation: " + pc3.gen + "\n" +"Price: " + pc3.price);

   }
}