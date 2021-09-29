package com.jolly.java.practice;

public class PracticeOne {
	public static void main (String[]args){
		PracticeOne.add(10, 20);
		PracticeOne.sub(30, 21);
		PracticeOne.mul(10, 15);
		PracticeOne.div(50, 2);
		PracticeOne.printRightAngleTriangle(5);
		PracticeOne.printHoloRectangle(4, 5);
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
	public static void printRightAngleTriangle(int n){
		
		for (int i=1; i<=n; i++){
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println( );
		}
	}
	public static void printHoloRectangle(int m ,int n){
		for (int i=1; i<=m; i++){
			for (int j =1; j<=n; j++){
				if (i==1 || i==m || j==1 || j==n){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
	}
}
