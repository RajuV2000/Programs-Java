import java.util.Scanner;

class CheckNum
{
  public static void main(String a[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to check: ");
     int num = sc.nextInt();
     getTypeofNum(num);
   }
   public static void getTypeofNum(int num)
   {
	int c = num%2;
	if(c==0)
	{
          System.out.println("The given number " + num+ " is even number");
	}
	else
	{
	 System.out.println("The given number " + num + " is odd number");
	}
   }
}