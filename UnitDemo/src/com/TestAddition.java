package com;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestAddition {

	static Scanner s= new Scanner(System.in);
	static int a;
	static int b;
	
	@Test
	public void test() {
		int a=2;
		int b=3;
		Sample obj = new Sample();
		Assert.assertEquals(5, obj.addition(a, b) );
	}
	
/*	@BeforeClass
	public static void beforeClass(){
		System.out.println("Enter the values for a and b:");
		a=s.nextInt();
		b=s.nextInt();
	}
*/
	@Ignore
	public void testNew(){
		Sample obj = new Sample();
		Assert.assertEquals(a+b, obj.addition(a, b) );
	}

}
