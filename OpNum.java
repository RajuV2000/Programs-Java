class OpNum
{
 public static void main(String a[])
    { 
	num(11 , 15);
    }
 public static void num(int a, int b)
    {
	int add = a + b;
	int sub = a - b;
	int mul = a * b;
	int div = a/b;
	int mod = a%b;
    	System.out.println(a + " + " + b + " = " + add);
	System.out.println(a + " - " + b + " = " + sub);
	System.out.println(a + " * " + b + " = " + mul);
	System.out.println(a + " / " + b + " = " + div);
	System.out.println(a + " % " + b + " = " + mod);
    }
}