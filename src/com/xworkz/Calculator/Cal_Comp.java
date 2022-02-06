package com.xworkz.Calculator;

public class Cal_Comp implements Calculator{
	
	int a;
	int b;
	int c;
	int d;
	
	
	
	public Cal_Comp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cal_Comp(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public int add() {
		int sum = a+b+c;
		return sum;
	}
	
	public int add(double x, double y, double z) {
		int sum = (int) (x+y+z);
		return sum;
	}

	@Override
	public int sub() {
		int diff = a-b;
		return diff;
	}

	@Override
	public int mul() {
		int mul = a*b*c*d;
		
		return mul;
	}
	
	public int mul(double m, double n) {
		int mul = (int) (a*b*m*n);
		return mul;
	}

	@Override
	public int div() {
		int div = 0;
		if(b !=0 && b%2 != 0) {
			div = a/b;
		}
		return div;
	}

}
