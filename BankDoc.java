import java.util.Scanner;
class BankDoc
{ 
  static String[] docum = new String[3];
  public static void main(String a[])
{ 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Your name: ");
  String name = sc.next();
  System.out.println("Enter age: ");
  String agex = sc.next();
  System.out.println("Enter mobile Number: ");
  String num = sc.next();
  docum[0] = name;
  docum[1] = agex;
  docum[2] = num;

  Bank.accnt(docum);
}
}