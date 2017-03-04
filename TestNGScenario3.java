package testNGScenario3;

import org.testng.annotations.Test;

public class TestNGScenario3 {
	TestNGBaseClass testng=new TestNGBaseClass(); //Create object of TestNGBaseClass

	@Test(priority=0) //Testcase 1 Open URL and verify page Title
	public void verifyApplicationTitle() {
		testng.openUrl();   //invoked function for opening browser
		testng.verifyTitle(); //invoked method for verifying page title
	}
	
	@Test(priority=1)  // Verifying all field 
	public void SetAndVerifyAllField(){
		
		testng.setUsername("Siddheshwar");  
		testng.setPassword("sid@03");
		testng.setConfirmPassword("sid@03");

		testng.setFirstname("Siddhesh");
		testng.setLastName("Salunkhe");
		testng.setDay("7");
		testng.setMonth("Nov");
		testng.setYear("1988");
		testng.setEmailID("sidsalunkhe13@gmail.com");
		testng.setMobileNumber("9730203803");
		testng.setGender("Gender");

		testng.setAddress("flat No.06, Krishnatara Apts, Uthkarsh Society, Katraj Kondwa Road, Katraj, Pune-46");
		testng.setCity("Pune");
		testng.setPincode("411046");
		testng.setState("Maharastra");
		testng.setCountry("India");
		testng.verifyField();  // invoked method for inserting data in all field
	}
	@Test(priority=2)  // verify the last page message and close browser
	public void VerifyLast(){
		testng.openUrl(); // Open URL
		testng.verifyTitle(); // Verifying first page title
		testng.verifyLastPage();  // verifying last page message
		testng.closeBrowser();  //method invoked for close browser
	}
}