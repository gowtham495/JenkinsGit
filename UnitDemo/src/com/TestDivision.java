package com;

import org.junit.Test;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class TestDivision {

	@Test
	public void test() {
		int a=6;
		int b=2;
		Sample obj = new Sample();
		Assert.assertEquals(3, obj.division(a, b));
	}
}
