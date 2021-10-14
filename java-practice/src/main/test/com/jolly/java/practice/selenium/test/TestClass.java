package com.jolly.java.practice.selenium.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeClass
	private static void before() {
		System.out.println(" ----------");
	}
	@Test
	@Parameters({"param1", "param2", "param3", "param4", "param6"})
	private static void test(String param11, String param22, String param33, @Optional("optional string")String param44,@Optional("optional string")String param66 ) {
		System.out.println("test "+param11);
		System.out.println("test "+param22);
		System.out.println("test "+param33);
		System.out.println("test "+param44);
		System.out.println("test "+param66);
		

	}
}
