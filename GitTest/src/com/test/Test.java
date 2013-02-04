package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		foo1();
	}

	private static void foo1() {
		for (int i=0; i < 6; i++)
			System.out.println(i);
		
	}
	
	private int subtract(int a, int b){
		return a - b;
	}

}
