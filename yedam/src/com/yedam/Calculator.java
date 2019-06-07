package com.yedam;

public class Calculator {
	static double PI = 3.14;
	String color;

	void setColor(String color) {
		this.color = color;
	}

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	static double plus(double x, double y) {
		return x + y;
	}

	static double minus(double x, double y) {
		return x - y;
	}

	static double multi(double x, double y) {
		return x * y;
	}

	static double divide(double x, double y) {
		return x / y;
	}

	static double execute(double x, double y, String z) {
		if (z == "*")
			// return x * y;
			return multi(x, y);
		else if (z == "/")
			return divide(x, y);
		else if (z == "+")
			return plus(x, y);
		else if (z == "-")
			return minus(x, y);
		return 0;
	}

	static double getArea(double r) {
		return r * r * PI;
	}

	static double getRect(double a, double b) {
		return a * b;
	}

	static int getArgs(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			if (i%2 == 0)
			//System.out.println(i+","+values[i]);
				sum = sum + values[i];
			
		}
		return sum;
	}

}