class Calci
{
public static void main(String a[])
{
 cal(25,35);
 cal(65, 43);
 cal(43,53);
}

public static void cal(int a, int b)
{
 int add = a + b;
 int sub = a - b;
 int mul = a * b;
 int div = a/b;
 int mod = a%b;
 System.out.println("ADDITION\n");
 System.out.println("a" + " + " + "b" + " = " + add + "\n");
 System.out.println("Substraction\n");
 System.out.println("a" + " - " + "b" + " = " + sub + "\n");
 System.out.println("Multiplication\n");
 System.out.println("a" + " * " + "b" + " = " + mul + "\n");
 System.out.println("Division\n");
 System.out.println("a" + " / " + "b" + " = " + div + "\n");
 System.out.println("Modulus\n");
 System.out.println("a" + " % " + "b" + " = " + mod + "\n");

}
}