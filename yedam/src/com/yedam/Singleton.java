package com.yedam;

public class Singleton {

	private static int num;
	private static Singleton singleton = new Singleton();
	private Singleton() {
}
