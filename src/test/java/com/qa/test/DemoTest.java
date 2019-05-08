//author omsairam
package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void Sum()
	{
		System.out.println("SUM");
		int a=10;
		int b=20;
		Assert.assertEquals(30,a+b);
	}
	
	@Test
	public void Sub()
	{
		System.out.println("SUB");
		int a=10;
		int b=20;
		Assert.assertEquals(10,b-a);
	}

}
