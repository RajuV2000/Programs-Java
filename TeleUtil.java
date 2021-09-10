import java.util.Scanner;
class TeleUtil
{
 static String[] docs = new String[3];
 
 public static void main(String a[])
 { 
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter your Name: ");
  String name = sc.next();
  System.out.println("Enter adhaar number");
  String adhaar = sc.next();
  System.out.println("Enter your address:");
  String addr = sc.next();
  docs[0] = name; 
  docs[1] = adhaar;
  docs[2] = addr;
  
  Tele.eligble(docs);
 }
} 