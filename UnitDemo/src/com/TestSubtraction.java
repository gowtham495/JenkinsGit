package com;


import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class TestSubtraction {

	int a=0;
	int b=0;
	Scanner s= new Scanner(System.in);
	
	@Test
	public void test1() {
		System.out.println("test1 method from subtraction class is tested");
		int a=6;
		int b=3;
		Sample obj = new Sample();
		Assert.assertEquals(3, obj.subtraction(a, b));
		
	}
	@Test
	public void test2() {
		System.out.println("test2 method from subtraction class is tested");
		Sample obj = new Sample();
		Assert.assertEquals(1, obj.subtraction(a, b));
	}
	   @BeforeClass
	   public static void beforeClass() {
	      System.out.println("in before class");
	   }

	   //execute only once, in the end
	   @AfterClass
	   public static void  afterClass() {
	      System.out.println("in after class");
	   }
/*
	   //execute for each test, before executing test
	   @Before
	   public void before() {
	      System.out.println("in before");
	      System.out.println("Enter values for a and b:");
			int a=s.nextInt();
			int b=s.nextInt();
	   }
*/	
	   //execute for each test, after executing test
	   @After
	   public void after() {
	      System.out.println("in after");
	   }


}
