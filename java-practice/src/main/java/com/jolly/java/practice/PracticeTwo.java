package com.jolly.java.practice;

public class PracticeTwo {
	static int b = 20;
	private static int  c = 30;
	private int d = 40;

	public static void main(String[] args) {

		PracticeTwo.createTable();
		System.out.println(b);
		
		PracticeTwo c1 = new PracticeTwo();
	}

	public static void createTable( ){
		int a =10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		
		PracticeTwo obj = new PracticeTwo();
		System.out.println(obj.d);
		

	}

}
