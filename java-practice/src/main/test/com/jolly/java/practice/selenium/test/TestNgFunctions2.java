package com.jolly.java.practice.selenium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFunctions2 {
	@Test
	public static void firstTest(){
		System.out.println("Hello world");
	}
	@Test
	public static void t1Test1(){
		System.out.println("t1");
	}
	@Test
	public static void t2Test2(){
		System.out.println("t2");
	}
	@Test
	public static void t3Test(){
		System.out.println("t3");
	}
	@Test
	public static void t4Test(){
		System.out.println("t4");
		
	}
	@Test
	public static void t5Test(){
		System.out.println("t5");
	}
	@Test
	public static void t6Test(){
		System.out.println("t6");
	}
	@Test
	public static void t7Test(){
		System.out.println("t7");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("after class --22");
	}
	@BeforeClass
	public static void beforeClass(){
		System.out.println("before class -22");
	}
	
	
}
