package com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddition.class, TestDivision.class, TestMultiplication.class, TestSubtraction.class })
public class AllTests {

}
