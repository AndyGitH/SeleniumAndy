package test;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
  @BeforeSuite //executed once before all the test cases
  public void initailizeSelenium(){
	  //Selenium object - WebDriver
	  
	  System.out.println("In the very beggining - initialize Selenium");
	  
  }
  
  @AfterSuite //executed once after all the test cases
  public void shutDownSelenium(){
	  //destroyed
	  System.out.println("At the very End - destroy Selenium");
  }
	
  @BeforeTest //executed once, before all test cases
  public void openConn() {
	  System.out.println("Connect to a database");
		  //connection with database
	  
	  
  }
	
  @AfterMethod
  public void closeBroswer(){
	  System.out.println("Close browser");
	  
  }
  @Test
  public void testReceiveMail() {
	  //Selenium code
	  System.out.println("Testing recieving email");
  }
  
  @Test
  public void testSendMail() {
	  //Selenium code
	  System.out.println("Testing sending email");
  }
  @BeforeMethod //executed before each test
  public void openBrowser() {
	  System.out.println("Opening browser");
  }
  
  @AfterTest //After executing all test cases
  public void closeConn(){
	  System.out.println("Close database connection");
  }

  

}
