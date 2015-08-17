package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {

	@BeforeTest
	public void xyz(){
		System.out.println("Before Executing Yahoo News Test");
		
		//throw new SkipException("Skipping the test..........");
	}
	@Test
	public void newsTest(){
		System.out.println("Executing Yahoo News Test");
		
		//Selenium code
		//compare expected with actual
		//text is present
		//link is present
		//Need to use assertions
		
		//Assert.assertEquals("Good", "Goodx");
		System.out.println("Before Assertion Error");
		try{
			Assert.assertTrue(6 > 12, "Error Message");
		}catch(Throwable t){
			System.out.println("Caught the error");
			//the test will pass, because the error is caught
			//code - we need to report the error into the reports
			
		}
		
		Assert.assertFalse(1>9, "Error Message");
		System.out.println("After Assertion Error");
	}
}
