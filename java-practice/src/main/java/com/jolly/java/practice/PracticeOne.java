package com.jolly.java.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticeOne {
	private static final String string = null;
	public static void main (String[]args){
//		PracticeOne.add(10, 20);
//		PracticeOne.sub(30, 21);
//		PracticeOne.mul(10, 15);
//		PracticeOne.div(50, 2);
//		PracticeOne.printRightAngleTriangle(5);
//		PracticeOne.printHoloRectangle(4, 5);
//		PracticeOne.findArmStrongNumber(370);
//		PracticeOne.reverseANumber(153);
//		PracticeOne.toReplaceASpecifiedCharacterWithAnotherCharacter("This Site uses cookies ");
//		PracticeOne.aUniqueIdentifierAGivenNumber("java exercise.");
//		PracticeOne.toPrintCurentDateAndTime();
//		PracticeOne.toGetTheCononicalRepresentOfTheString();
//		PracticeOne.findPrimeNumber(10);
		//PracticeOne.removeSameElement();
	//	PracticeOne.toCheckWhetherAGivenStringStartsWithTheContentsOfAnotherString();
		//PracticeOne.toGetASubstringOfAGivenStringBetweenTwoSpecifiedPositions();
		//PracticeOne.toCreateACharacterArrayContainingTheContentsOfAString();
	//	PracticeOne.toConvertAllTheCharactersInAStringTolowercase();
		PracticeOne.toTrimAnyLeadingOrTrailingWhitespaceFromAGivenString();
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
	public static void findArmStrongNumber(int num){
		int temp = num;
		int length =0;
		while (temp!=0){
			temp = temp/10;
			length = length +1;
		}
		int temp1 = num;
		int rem =0;
		int arm = 0;
		while (temp1!=0){
			int mul =1;

			rem = temp1%10;
			for (int i=1; i<=length; i++){
				mul = mul*rem;
			}
			arm = arm + mul;
			temp1 = temp1/10;
		}

		if (num == arm){
			System.out.println("This is Armstrong number");
		}
		else {
			System.out.println(" This is not Armstong number" );
		}
	}
	public static void reverseANumber(int num ){
		int temp = num;
		int rem = 0;
		int rev =0 ;
		while (temp!=0){
			rem  = temp%10;
			temp = temp/10;
			
			rev = rev*10 + rem;

		}
	}
	
	public static void toReplaceASpecifiedCharacterWithAnotherCharacter(String Str){
		
		String NewStr = Str.replace('o', 'a');
		System.out.println("Orignal string  => " +Str);
		System.out.println("New string  => "   +NewStr);
	}
	public static void aUniqueIdentifierAGivenNumber(String Str){
		int hash_code = Str.hashCode();
		System.out.println(" hash code for " +Str+ " is " +hash_code);
	}
	public static void toPrintCurentDateAndTime(){
		String date = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").
				format(Calendar.getInstance().getTime());
		System.out.println(date);
	}
	public static void toGetTheCononicalRepresentOfTheString(){
		String Str1 = "Programing language";
		String Str2 = new StringBuffer ("programing").append ("language").toString();
		String Str3 = Str2.intern();
		System.out.println("Str1 = Str2 ?" +(Str1 == Str2));
		System.out.println("Str1 = Str3 ?" + (Str1 == Str3));
	}
	public static void findPrimeNumber(int num){
		for (int i=1; i<=num; i++){
			if (i==2 || i==3){
		System.out.println(i);
			}
			else {
				for (int j=2; j<=i-1; j++){
					if (i%j==0){
						break;
					}
					if (i%j!=0 && j == i-1){
						System.out.println(i);
					}
				}
			}
		}
	}
	public static void removeSameElement(){
		int []array1 = {2,4,5,6,3,4,5,4,4,4};
		int []array2 = new int [array1.length];
		int k =0;
		int cnt= 0;
		for (int i=0; i<=array1.length; i++){
			for (int j=0; j<=k; j++){
				cnt++;
				if(array1[i]== array2[j]){
					break;
				}
				else if (array1[i]!= array2[j] && j == k){
					array2[k] = array1[i];
					System.out.println(array2[k]);
					k++;
					break;
				}
			}
		}
	}
	public static void toCheckWhetherAGivenStringStartsWithTheContentsOfAnotherString(){
		String str1  = "red is a favorite color";
		String str2  = "orange is also favorite color";
		String startStr = "red";
		boolean stars1 = str1.startsWith(startStr);
		boolean stars2  = str2.startsWith(startStr);
		System.out.println(str1 + " stars With " +startStr+ " ? " +stars1);
		System.out.println(str2 + " star With " + startStr+ " ? " +stars2);
		
	}
	public static void toGetASubstringOfAGivenStringBetweenTwoSpecifiedPositions(){
		String str = "where my merchandise comes from";
		String new_str = str.substring(3, 10);
		System.out.println("old str => " + str);
		System.out.println("new str => " + new_str);
		
		
	}
	public static void toCreateACharacterArrayContainingTheContentsOfAString(){
		String str = "Where are you going";
		char[]arr = str.toCharArray();
		System.out.println(str);
	}
	public static void toConvertAllTheCharactersInAStringTolowercase(){
		String str = "WHERE ARE YOU COME FROM";
		String lowerStr = str.toLowerCase();
		System.out.println("old Str =>" + str);
		System.out.println("New str =>" + lowerStr);
	}
	public static void toTrimAnyLeadingOrTrailingWhitespaceFromAGivenString(){
		String Str = "I HAVE TO GO MARKET FOR SHOPPING";
		String new_Str = Str.trim();
		System.out.println("old Str => " +Str);
		System.out.println("New Str => " +new_Str);
	}
}

