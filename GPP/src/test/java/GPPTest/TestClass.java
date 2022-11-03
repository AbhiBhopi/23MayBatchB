package GPPTest;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeSuite
	public void beforeSute() {
		System.out.println("before sute - TestClass 1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test - TestClass 1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class - TestClass 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method - TestClass 1");
	}
	
	@Test 
	public void testA() {
		System.out.println("Test A - TestClass 1");
	}
	       
	@Test 
	public void testB() {
		System.out.println("Test B - TestClass 1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method - TestClass 1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class - TestClass 1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test - TestClass 1");
	}
	
	@AfterSuite
	public void afterSute() {
		System.out.println("After sute - TestClass 1");
	}

}
