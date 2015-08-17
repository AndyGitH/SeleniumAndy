package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {
	
	@Test(dataProvider="registerData") 
	//called as many times as the row in the Object[][]
	public void testRegister(String username, String password, 
			String email, String city){
		
		
		//Selenium code
		/* called more than once with different sets of data, equal to the number of cols
		 * 
		 * username
		 * password
		 * email
		 * city
		 * */
		
		System.out.println(username + "---" + password + "---" + email + "---" + city);
	}
	
	@DataProvider
	public Object[][] registerData(){
		
		//rows - number of times test has to be repeated
		//col - number pf parameters in data
		Object[][] data = new Object[3][4];
		
		
		//first row
		data[0][0] = "User1";
		data[0][1] = "pass1";
		data[0][2] = "andy@hotmail";
		data[0][3] = "London";
		
		//second row
		data[1][0] = "User2";
		data[1][1] = "pass2";
		data[1][2] = "JRRT@hotmail";
		data[1][3] = "Dublin";
		
		//Third row
		data[2][0] = "User3";
		data[2][1] = "pass3";
		data[2][2] = "nick@hotmail";
		data[2][3] = "NewYork";
		
		
		return data;
	}

}
