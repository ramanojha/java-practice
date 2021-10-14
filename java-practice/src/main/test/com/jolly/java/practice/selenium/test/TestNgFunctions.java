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

public class TestNgFunctions {
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
	@BeforeMethod
	public static void before1Method(){
		System.out.println("before method 1");
	}
	
	
	@AfterMethod
	public static void after1Method(){
		System.out.println("after method 1");
	}
	
	@BeforeTest
	public static void beforeTest(){
		System.out.println("before test");
	}
	@AfterTest
	public static void afterTest(){
		System.out.println("after test");
		System.out.println("***************************");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("after class");
	}
	@BeforeClass
	public static void beforeClass(){
		System.out.println("before class");
	}
	@BeforeSuite
	public static void beforeSuite(){
		System.out.println("beforeSuite");
	}
	@AfterSuite
	public static void afterSuite(){
		System.out.println("after Suite");
	}
	@BeforeClass
	public static void beforeClass1(){
		System.out.println("before class");
	}
	
}
