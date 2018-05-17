package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class single_Test {

	

@Test
public void test_junit() {
	Multi s1 = new Multi(5,4);
	Assert.assertEquals(20,s1.multiplication());
}

@Test
public void test_junit2() {
	Multi s2 = new Multi(20,4);
	Assert.assertEquals(5,s2.divide());
}

@Test
public void test_junit3(){
	Multi obj = new Multi(2,3);
	Assert.assertEquals(6, obj.multiplication());
}
}

	


