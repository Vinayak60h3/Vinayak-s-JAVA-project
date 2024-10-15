package com.project;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();

		System.out.println("Enter First Number:");
		double num1 = scan.nextDouble();
		calculator.setNumber1(num1);

		System.out.println("Enter Second Number : ");
		double num2 = scan.nextDouble();
		calculator.setNumber2(num2);

		System.out.println("Choose A Number");
		System.out.println("1. Add Sum");
		System.out.println("2. Add Sub");
		System.out.println("3. Add Multiplication");
		System.out.println("4. Add Division");
		
		double result;
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			result= calculator.add();
			System.out.println("Result Sum "+result);
			break;
		case 2:
			result= calculator.sub();
			System.out.println("Result Diff "+result);
			break;

		case 3:
			result= calculator.mul();
			System.out.println("Result Pdt "+result);
			break;
		case 4:
			result= calculator.div();
			System.out.println("Result Division "+result);
			break;

		default:
			break;
		}

	}

}