package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	@BeforeClass
	public void beforeClass() {
//		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforMethod() {
//	Date d=new Date();
//		System.out.println("=======Start Time========"+d);
//		System.out.println("before");
	}
	
	@AfterClass
	public void afterClass() {
//		System.out.println("After Class");
	}
	@AfterMethod
	public void after() {
//		Date d=new Date();
//		System.out.println("=======Finish Time========="+d);
//		System.out.println("after");
	}
	@Test
	public void test2()  {
		System.out.println("test2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test1() {
		System.out.println("test1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("test3");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("test4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test5() {
		System.out.println("test5");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test6() {
		System.out.println("test6");
		System.out.println(Thread.currentThread().getId());
	}
	

}
