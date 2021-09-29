package com.jolly.java.practice;

public class PracticeOne {
	public static void main (String[]args){
		PracticeOne.add(10, 20);
		PracticeOne.sub(30, 21);
		PracticeOne.mul(10, 15);
		PracticeOne.div(50, 2);
	}
	public static void add(int a , int b){
		System.out.println(a+b);
		
	}
	public static void sub(int a , int b){
		System.out.println(a-b);
	}
	public static void mul (int a ,int b){
		System.out.println(a*b);
	}
	public static void div (int a , int b){
		System.out.println(a/b);
	}
}
