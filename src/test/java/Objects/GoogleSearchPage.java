package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	 WebDriver driver;
	 
	 public GoogleSearchPage(WebDriver driver) 
	 {
		 
		 this.driver = driver;
		 
	 }
	 
	 By searchbox = By.xpath("//textarea[@name='q']");
	 By search_btn = By.xpath("(//input[@name='btnK'])[1]");
	 By Facebook_link = By.xpath("//h3[text()='Log into Facebook | Facebook']");
	 
	 public void searchgoogle(String Searchinput)
	 
	 {
		 try {
			 driver.findElement(searchbox).sendKeys(Searchinput);
			 driver.findElement(search_btn).click();
			 Thread.sleep(2000);
		     } catch (Exception e) {
		    	 System.out.println("Exception Caught" + e.getMessage());
		     }  
	 }
	 
	 public void ClickFacebook()
	 
	 {
		 try {
			driver.findElement(Facebook_link).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	 }
	 
	 
	 
}

