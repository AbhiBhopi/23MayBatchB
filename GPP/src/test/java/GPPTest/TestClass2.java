package GPPTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeSuite
	public void beforeSute() {
		System.out.println("before sute - TestClass2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test - TestClass2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class - TestClass2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method - TestClass2");
	}
	
	@Test 
	public void test1() {
		System.out.println("Test 1 - TestClass2");
	}
	       
	@Test 
	public void test2() throws InterruptedException {
		System.out.println("Test 2 - TestClass2");
	}
	
	@Test  
	public void test3() {
		System.out.println("Test 3 - TestClass2");
	}
	
	@Test  
	public void test4() {
		System.out.println("Test 4 - TestClass2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method - TestClass2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class - TestClass2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test - TestClass2");
	}
	
	@AfterSuite
	public void afterSute() {
		System.out.println("After sute - TestClass2");
	}
}
