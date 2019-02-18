package com.JenkinsIntTest;

import org.testng.annotations.Test;

public class SampleLogicsTest 
{
	@Test
	public void addTest()
	{
		int a=10,b=20;
		System.out.println(a+b);
	}
	@Test
	public void subTest()
	{
		int a=10,b=20;
		System.out.println(b-a);
	}
	@Test
	public void mulTest()
	{
		int a=10,b=20;
		System.out.println(a*b);
	}

}
