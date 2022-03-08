package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass123 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite TestClass123");
	}
	@BeforeTest
	@Parameters("testData")
	public void beforeTest(String data)
	{
		System.out.println(data);
		System.out.println("beforeTest TestClass123 ");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class TestClass123");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method TestClass123");
	}
	
	@Test
	public void testA()
	{
		System.out.println("test A TestClass123");
	}
	
	@Test
	public void testB()
	{
		System.out.println("test B TestClass123");
	}
	
	@Test
	public void testC()
	{
		System.out.println("test C TestClass123");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method TestClass123");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class TestClass123");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest TestClass123 ");
	}
   
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite TestClass123");
	}
}
