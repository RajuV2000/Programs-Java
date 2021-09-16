import java.util.Scanner;

class Add
{
 public static void main(String a[])
   {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter a number: ");
     byte b= sc.nextByte();
     System.out.println("Enter b number: ");
     byte c= sc.nextByte();
     byte d = b+ c;
     System.out.println(d);
   }
}
      