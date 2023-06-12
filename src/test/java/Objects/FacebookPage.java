package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {

	WebDriver driver;
	 
	 public FacebookPage(WebDriver driver) 
	 {
		 
		 this.driver = driver;
		 
	 }
	 
	 By Username_editbox = By.id("email");
	 By password_editbox = By.id("pass");
	 By Login_btn = By.name("login");
	 
	 public void EnterUsername() {
		 driver.findElement(Username_editbox).sendKeys("TestUser");
	 }
	 
	 public void Enterpassword() {
		 driver.findElement(password_editbox).sendKeys("testuser123");
	 }
	 
	 public void VerifyLogin() {
		 driver.findElement(Login_btn).click();
		 String title = driver.getTitle();
		 assertEquals(title,"Log in to Facebook");
	 }
	 
}
