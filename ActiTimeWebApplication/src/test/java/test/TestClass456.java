package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass456 {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest TestClass456");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class TestClass456");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method TestClass456");
	}
	
	@Test
	public void testD()
	{
		System.out.println("test D TestClass456");
	}
	
	@Test
	public void testE()
	{
		System.out.println("test E TestClass456");
	}
	
	@Test
	public void testF()
	{
		System.out.println("test F TestClass456");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method TestClass456");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestClass456");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest TestClass456");
	}

}
