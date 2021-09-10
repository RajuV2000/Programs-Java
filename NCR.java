class NCR
{ 
 public static void main(String a[])
{
 int nCr, x, y, z,xf, yf,zf;
 x = 4;
 y = 2;
 z = x - y;
 xf = fact(4);
 yf= fact(2);
 zf = fact(z);
 
 nCr = xf/ (yf*zf);
 System.out.println(nCr);
}
 public static int fact(int n)
{
 int fact = 1;
 for (int i = 1; i<= n ; i++)
{ 
fact = fact*i;
}
return fact;
}
}