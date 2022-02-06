package com.xworkz.Calculator;

public class Cal_Gen implements Calculator{
	
	int a;
	int b;
	int c;
	int d;

	public Cal_Gen(int a, int b, int c, int d) {
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

	@Override
	public int sub() {
		int diff = a - b;
		return diff;
	}

	@Override
	public int mul() {
		int mul = a*b*c*d;
		return mul;
	}

	@Override
	public int div() {
		
		int div = 0;
		if(a!=0 && b!=0) {
			div = a/b;
		}
		return div;
	}

	
}
