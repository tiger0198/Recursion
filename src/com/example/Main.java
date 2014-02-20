package com.example;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		long factN = Recursion.Factorial(n);
		System.out.println("Factorial ->" +n + "! = " + factN);
		factN = Recursion.FactorialTail(n,1);
		System.out.println("FactorialTail ->" +n + "! = " + factN);

	}

}
