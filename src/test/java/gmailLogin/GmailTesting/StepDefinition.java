package gmailLogin.GmailTesting;


//import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class StepDefinition {

	//Declare the driver variable as static, so that it can be reused in all the methods 
	public static WebDriver driver=null;

	@Given("^url opened$")
	public void url_opened() {
		//	* ******	Chrome Driver	
		String exePath = "C:\\Janardhan\\Selenium_Tools\\04_chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		 
	}

	@Then("^enter user id and click next$")
	public void enter_user_id_and_click_next() throws Throwable {
	      driver.findElement(By.id("identifierId")).sendKeys("jantest2005");
	      Thread.sleep(2000);
	      driver.findElement(By.id("identifierNext")).click();
	      Thread.sleep(2000);
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("Gansai3#");
		 Thread.sleep(2000);
	}
	
	@Then("^click login$")
	public void click_login() throws Throwable {
		driver.findElement(By.id("passwordNext")).click();
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		//driver.quit();
	}


	
}
