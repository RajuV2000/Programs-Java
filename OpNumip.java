import java.util.Scanner;

class OpNumip
{
 public static void main(String a[])
    { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int x = sc.nextInt();
	System.out.println("Enter another number : ");
	int y = sc.nextInt();
	
	num(x , y);
    }
 public static void num(int a, int b)
    {
	int add = a + b;
	int sub = a - b;
	int mul = a * b;
	float div = a/b;
	int mod = a%b;
    	System.out.println(a + " + " + b + " = " + add);
	System.out.println(a + " - " + b + " = " + sub);
	System.out.println(a + " * " + b + " = " + mul);
	System.out.println(a + " / " + b + " = " + div);
	System.out.println(a + " % " + b + " = " + mod);
    }
}