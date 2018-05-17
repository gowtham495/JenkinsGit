package com;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestMultiplication {

	@Test
	public void test() {
		int a=2;
		int b=6;
		Sample obj = new Sample();
		Assert.assertEquals(12, obj.multiplication(a, b));
	}
}
