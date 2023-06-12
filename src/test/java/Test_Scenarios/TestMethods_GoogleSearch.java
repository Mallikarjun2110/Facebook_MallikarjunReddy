package Test_Scenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {

	WebDriver driver;
	GoogleSearchPage objectrepo;
	
    @BeforeTest
    public void beforetest() {
    	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	driver.get("https://www.google.com/");
    }
    
    @Test
    public void SearchOperation()  {
    	
    	GoogleSearchPage page = new GoogleSearchPage(driver);
    	page.searchgoogle("facebook");
    	
    }
    
    @Test
    public void VerifyAndAccessFacebook() {
    	
    	objectrepo = new GoogleSearchPage(driver);
    	objectrepo.ClickFacebook();
    }
    
    @Test
    public void VerifyLogin() {
    	FacebookPage page = new FacebookPage(driver);
    	page.EnterUsername();
    	page.Enterpassword();
    	page.VerifyLogin();
    }
    
    @AfterTest
    public void aftertest() {
    	
    	driver.quit();
    }
}
