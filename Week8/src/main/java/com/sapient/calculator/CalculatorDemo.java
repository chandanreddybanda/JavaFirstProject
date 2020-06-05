package com.sapient.calculator;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c=null;
		System.out.println("Enter the two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Choose the Operation:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int ch = sc.nextInt();
		sc.close();
		switch (ch) {
		case 1:
			c = new AddCalculate();
			break;
		case 2:
			c = new SubtractCalculate();
			break;
		case 3:
			c = new MultiplyCalculate();
			break;
		case 4:
			c = new DivideCalculate();
			break;
		default:
			System.out.println("Invalid Operation");
			return;
		}
		System.out.println("Result: " + c.calculate(a, b));
	}

}
