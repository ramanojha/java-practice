package com.jolly.java.practice.selenium.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClassAgain {
	@BeforeClass
	private static void before() {
		System.out.println(" *******");
	}
	@Test
	private static void test() {
		System.out.println("test");

	}
}
