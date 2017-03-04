package testNGScenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestNGBaseClass {
	String username;
	String password;
	String confirmPassword;
	String firstname;
	String lastName;
	String day;
	String month;
	String year;
	String emailID;
	String mobileNumber;
	String gender;
	String address;
	String city;
	String pincode;
	String state;
	String country;
	String hobbies;
	String url = "https://seleniumqtpautomation.000webhostapp.com/final.html";
	WebDriver driver = new FirefoxDriver();

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getMonth() {
		return month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setCity(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPincode() {
		return pincode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void openUrl() {		// open url
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	}

	public void verifyTitle() {  // verify the application title
		String actual = "Register page";
		String expected = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	public void verifyField() {   //inserting all data in all field
		if (driver.findElement(By.name("name")).isDisplayed()) {
			if (driver.findElement(By.name("name")).isEnabled()) {
				driver.findElement(By.name("name")).sendKeys(getUsername());
			}
		}
		if (driver.findElement(By.name("password")).isDisplayed()) {
			if (driver.findElement(By.name("password")).isEnabled()) {
				driver.findElement(By.name("password")).sendKeys(getPassword());
			}
		}
		if (driver.findElement(By.name("confirmpassword")).isDisplayed()) {
			if (driver.findElement(By.name("confirmpassword")).isEnabled()) {
				driver.findElement(By.name("confirmpassword")).sendKeys(getConfirmPassword());
			}
		}
		String type = driver.findElement(By.name("password")).getText();
		String type1 = driver.findElement(By.name("confirmpassword")).getText();
		if (type.equals(type1)) {
			driver.findElement(By.name("insert")).click();
		} else {
			System.out.println("Password and confirm Password not match");
		}
		if (driver.findElement(By.name("First_Name")).isDisplayed()) {
			if (driver.findElement(By.name("First_Name")).isEnabled()) {
				driver.findElement(By.name("First_Name")).sendKeys(getFirstname());
			}
		}
		if (driver.findElement(By.name("Last_Name")).isDisplayed()) {
			if (driver.findElement(By.name("Last_Name")).isEnabled()) {
				driver.findElement(By.name("Last_Name")).sendKeys(getLastName());
			}
		}
		if (driver.findElement(By.id("Birthday_Day")).isDisplayed()) {
			if (driver.findElement(By.id("Birthday_Day")).isEnabled()) {
				Select day = new Select(driver.findElement(By.id("Birthday_Day")));
				day.selectByVisibleText(getDay());
			}
		}
		if (driver.findElement(By.id("Birthday_Month")).isDisplayed()) {
			if (driver.findElement(By.id("Birthday_Month")).isEnabled()) {
				Select day = new Select(driver.findElement(By.id("Birthday_Month")));
				day.selectByVisibleText(getMonth());
			}
		}
		if (driver.findElement(By.id("Birthday_Year")).isDisplayed()) {
			if (driver.findElement(By.id("Birthday_Year")).isEnabled()) {
				Select day = new Select(driver.findElement(By.id("Birthday_Year")));
				day.selectByVisibleText(getYear());
			}
		}
		if (driver.findElement(By.name("Email_Id")).isDisplayed()) {
			if (driver.findElement(By.name("Email_Id")).isEnabled()) {
				driver.findElement(By.name("Email_Id")).sendKeys(getEmailID());
			}
		}
		if (driver.findElement(By.name("Mobile_Number")).isDisplayed()) {
			if (driver.findElement(By.name("Mobile_Number")).isEnabled()) {
				driver.findElement(By.name("Mobile_Number")).sendKeys((getMobileNumber()));
			}
		}
		if (driver.findElement(By.name("Gender")).isDisplayed()) {
			if (driver.findElement(By.name("Gender")).isEnabled()) {
				driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input[1]")).click();
			}
		}
		if (driver.findElement(By.name("insert")).isDisplayed()) {
			if (driver.findElement(By.name("insert")).isEnabled()) {
				driver.findElement(By.name("insert")).click();
			}
		}
		if (driver.findElement(By.name("Address")).isDisplayed()) {
			if (driver.findElement(By.name("Address")).isEnabled()) {
				driver.findElement(By.name("Address")).sendKeys(getAddress());
			}
		}
		if (driver.findElement(By.name("City")).isDisplayed()) {
			if (driver.findElement(By.name("City")).isEnabled()) {
				driver.findElement(By.name("City")).sendKeys(getCity());
			}
		}
		if (driver.findElement(By.name("Pin_Code")).isDisplayed()) {
			if (driver.findElement(By.name("Pin_Code")).isEnabled()) {
				driver.findElement(By.name("Pin_Code")).sendKeys(getPincode());
			}
		}

		if (driver.findElement(By.name("State")).isDisplayed()) {
			if (driver.findElement(By.name("State")).isEnabled()) {
				driver.findElement(By.name("State")).sendKeys(getState());
			}
		}

		if (driver.findElement(By.name("Country")).isDisplayed()) {
			if (driver.findElement(By.name("Country")).isEnabled()) {
				Select selectCountry = new Select(driver.findElement(By.name("Country")));
				selectCountry.selectByVisibleText(getCountry());

			}
		}
		if (driver.findElement(By.name("insert")).isDisplayed()) {
			if (driver.findElement(By.name("insert")).isEnabled()) {
				driver.findElement(By.name("insert")).click();
			}
		}
		if (driver.findElement(By.name("Hobby_Drawing")).isDisplayed()) {
			if (driver.findElement(By.name("Hobby_Drawing")).isEnabled()) {
				driver.findElement(By.name("Hobby_Drawing")).click();
			}
		}
		if (driver.findElement(By.name("Hobby_Singing")).isDisplayed()) {
			if (driver.findElement(By.name("Hobby_Singing")).isEnabled()) {
				driver.findElement(By.name("Hobby_Singing")).click();
			}
		}
		if (driver.findElement(By.name("Hobby_Dancing")).isDisplayed()) {
			if (driver.findElement(By.name("Hobby_Dancing")).isEnabled()) {
				driver.findElement(By.name("Hobby_Dancing")).click();
			}
		}
		if (driver.findElement(By.name("Hobby_Cooking")).isDisplayed()) {
			if (driver.findElement(By.name("Hobby_Cooking")).isEnabled()) {
				driver.findElement(By.name("Hobby_Cooking")).click();
			}
		}

		if (driver.findElement(By.name("insert")).isDisplayed()) {
			if (driver.findElement(By.name("insert")).isEnabled()) {
				driver.findElement(By.name("insert")).click();
			}
		}
		driver.close();
	}
	
	public void verifyLastPage() {   //verifying last page message
		driver.get("https://seleniumqtpautomation.000webhostapp.com/welcome.html");
		String actual_Message = "Welcome To Selenium Automation Testing";
		String expected_Message = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(actual_Message, expected_Message);
	}

	public void closeBrowser() {  //Close all opened browser
		driver.quit();
	}
}
