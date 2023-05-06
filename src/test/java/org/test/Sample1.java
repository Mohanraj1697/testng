package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {

	@BeforeClass
	public void beforeClass() {
//		System.out.println("bf1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
//		System.out.println("bm1");
	}
	@AfterClass
	public void afterClass() {
//		System.out.println("af1");
	}
	@AfterMethod
	public void afterMethod() {
//		System.out.println("am1");
	}
	@Test
	public void testA1() {
		System.out.println("testA1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testA2() {
		System.out.println("testA2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test2()  {
		System.out.println("testA3");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test1() {
		System.out.println("testA4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("testA5");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("testA6");
		System.out.println(Thread.currentThread().getId());
	}
	
	
	
}
