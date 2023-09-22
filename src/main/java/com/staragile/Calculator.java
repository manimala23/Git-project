package com.staragile;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number :");
		int a = sc.nextInt();
		
		System.out.println("enter the second number :");
		int b = sc.nextInt();
		Calculator cal =new Calculator();
		System.out.println(cal.sum(a,b));
		System.out.println(cal.minus(a,b));
		System.out.println(cal.divide(a,b));
		System.out.println(cal.multiply(a,b));
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a + b;  // ERROR!!!
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}


}
