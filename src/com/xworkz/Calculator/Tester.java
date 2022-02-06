package com.xworkz.Calculator;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator gen = new Cal_Gen(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()); //provide inputs here.....
		int add = gen.add(); 
		int sub = gen.sub();    
		int mul = gen.mul(); 
		int div = gen.div(); 
		
		System.out.println(add + "\n" + sub + "\n" + mul + "\n" + div);
		
		Calculator comp = new Cal_Comp(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()); //provide inputs here.....
		add = comp.add(); 
		sub = comp.sub(); 
		mul = comp.mul(); 
		div = comp.div(); 
		
		Cal_Comp doubleComp = new Cal_Comp();
		
		int doubleAdd = doubleComp.add(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()); //provide inputs here...
		
		int doubleMul = doubleComp.mul(sc.nextDouble(), sc.nextDouble()); //provide inputs here.....
		
		System.out.println(add + "\n" + sub + "\n" + mul + "\n" + div + "\n" + doubleAdd + "\n" + doubleMul);

	}
}
