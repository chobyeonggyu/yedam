package com.yedam;

public class CalculatorExample {

	public static void main(String[] args) {
		double result = Calculator.plus(30.5, 20.8);
		System.out.println("결과값은: " + result);
		result = Calculator.minus(30, 20);
		System.out.println("결과값은: " + result);
		System.out.println(Calculator.PI);
		System.out.println("결과값은: " + result);

		double result1 = Calculator.execute(2.3, 5.2, "*");
		System.out.println("결과값은:" + result1);
		double result2 = Calculator.getArea(4.5);
		System.out.println("결과값은:" + result2);
		double result3 = Calculator.getRect(5.2, 12.5);
		System.out.println("결과값은:" + result3);
		int sum = Calculator.getArgs(1, 2, 3, 4, 5, 6,7,8,9);
		System.out.println("합:" + sum);
	}

}
