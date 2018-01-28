package GmailTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MarketViewEditCompare {

	public static void main(String[] args) {
        //run the homePageLinks functionality
		new MarketViewEditCompare().homePageLinks();
		
	}
	
	

	public void homePageLinks() {
     
		 WebDriver driver;
		MarketViewEditCompare objHomePage = new MarketViewEditCompare();
		
   //* ******	Chrome Driver	
		// Create a new instance of the Google Chrome driver
		String exePath = "C:\\Janardhan\\Selenium_Tools\\04_chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		

	//	System.setProperty("webdriver.chrome.driver","c:\\Grid\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver=new ChromeDriver(options);
  
		
    /*   // *****  Internet Explorer Driver	

				//Path to the folder where you have extracted the IEDriverServer executable
				 String service = "C:\\\\Janardhan\\\\Selenium_Tools\\\\IEDriver\\\\IEDriverServer.exe";
				 System.setProperty("webdriver.ie.driver", service);

					// Create a new instance of the Internet Explorer driver				 
				 InternetExplorerDriver  driver = new InternetExplorerDriver();
				 
				   // *****  Internet Explorer Driver  **/
				

		
		  //Maximize browser window
		//driver.manage().window().maximize();
		
		// Storing the Application Url in the String variable
		String url = "http://coengs-oszow1/zoniac/#/";

//		WebDriver driver = new ChromeDriver();
		// Launch the ToolsQA WebSite
		driver.get(url);
	    objHomePage.SetWait(2000);



	
	    

/*###################################################             Market View Code  ############################################################################################### 
  	    // Click Home link on Market
		driver.findElement(By.linkText("Market")).click();
		    objHomePage.SetWait(2000);
 
		 //click on view icon    
		 driver.findElement(By.xpath("//*[@id=\"tblMarketsHub\"]/tbody/tr[2]/td[1]/div/a[1]/span")).click();
		    objHomePage.SetWait(2000);
		    
		 WebElement MarketName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div"));
		    objHomePage.SetWait(2000);
 		 
         System.out.println("Data of Market Name :" + MarketName.getText());
         
 
         
         String MarketNameNew = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div")).getText();
         System.out.println("MarketName is :" + MarketNameNew );

         String MarketKey = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[2]/div")).getText();
         System.out.println(" MarketKey is :" + MarketKey );

         String SpotlightMarket = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div")).getText();
         System.out.println(" SpotlightMarket is :" + SpotlightMarket );

         String SpotlightDivision = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[2]/div")).getText();
         System.out.println(" SpotlightDivision is :" + SpotlightDivision );


         String Region = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[3]/div[1]/div")).getText();
         System.out.println(" Region is :" + Region );

         String CableDivision = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[3]/div[2]/div")).getText();
         System.out.println(" CableDivision is :" + CableDivision );

         String TrafficSystem = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[4]/div[1]/div")).getText();
         System.out.println(" TrafficSystem is :" + TrafficSystem );

         String TrafficSystemID = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[4]/div[2]/div")).getText();
         System.out.println(" TrafficSystemID is :" + TrafficSystemID );

         
         String TRVS = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[5]/div[1]/div")).getText();
         System.out.println(" TRVS is :" + TRVS );         

         String Threshold = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[5]/div[2]/div")).getText();
         System.out.println(" Threshold is :" + Threshold );


         String MarketGo_LiveDate = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[6]/div[1]/div")).getText();
         System.out.println(" MarketGo_LiveDate is :" + MarketGo_LiveDate );

         String TurnKeyOut = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[6]/div[2]/div")).getText();
         System.out.println(" TurnKeyOut is :" + TurnKeyOut );


         String MarketingMarketName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[7]/div[1]/div")).getText();
         System.out.println(" MarketingMarketName is :" + MarketingMarketName );

         String PrimaryMVPD = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[7]/div[2]/div")).getText();
         System.out.println(" PrimaryMVPD is :" + PrimaryMVPD );




         String AdSalesMarketName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[8]/div[1]/div")).getText();
         System.out.println(" AdSalesMarketName is :" + AdSalesMarketName );

         String CableTrackMarketName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[8]/div[2]/div")).getText();
         System.out.println(" CableTrackMarketName is :" + CableTrackMarketName );

         String OverrideSubscriberCounts = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[9]/div[1]/div")).getText();
         System.out.println(" OverrideSubscriberCounts is :" + OverrideSubscriberCounts );
      
         */
		    
/* *****   MARKET EDIT *****  ################################################################################################################################################## */
            /*		    
 	    // Click Home link on Market
 		driver.findElement(By.linkText("Market")).click();
 		    objHomePage.SetWait(2000);

 		 //click on Edit icon    
 		 driver.findElement(By.xpath("//*[@id=\"tblMarketsHub\"]/tbody/tr[2]/td[1]/div/a[2]/span")).click();
 		    objHomePage.SetWait(2000);         
 
 		   
 		  
//// 		   driver.findElement(By.xpath("//input[contains(@name,'MarketName')]")).sendKeys("JANA"); 
 	////	  objHomePage.SetWait(2000);
 		   //objHomePage.SetWait(10000);
 		    //get Market Name using contains
 		   WebElement EditMarketName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div/input"));
		  		
 		  //objHomePage.SetWait(4000);  
 		  System.out.println(" EditMarketName is :" + EditMarketName.getAttribute("value") );
 		    
         
 		 String ValueInMarketEditNameUsingContains = driver.findElement(By.xpath("//input[contains(@name,'MarketName')]")).getAttribute("value");
 		 System.out.println(" ValueInMarketEditNameUsingContains " +  ValueInMarketEditNameUsingContains ) ;
 		 
/*
 		 //Select the Checkbox code  
 		 
 		List oCheckBox = driver.findElements(By.name("radioMarketIsNonSpotlightMarket"));
 		 
 		 // This will tell you the number of checkboxes are present
 		 
 		 int iSize = oCheckBox.size();
 		 
 		 // Start the loop from first checkbox to last checkboxe
 		 
 		 for(int i=0; i < iSize ; i++ ){
 		 
 			 // Store the checkbox name to the string variable, using 'Value' attribute
 		 
 			 String sValue = oCheckBox.get(i).getAttribute("value");
 		 
 			 // Select the checkbox it the value of the checkbox is same what you are looking for
 		 
 			 if (sValue.equalsIgnoreCase("toolsqa")){
 		 
 				 oCheckBox.get(i).click();
 		 
 				 // This will take the execution out of for loop
 		 
 				 break;
 		 
 				 }
 *//* ################################################################################################################################################## */
 		 /*
 		objHomePage.SetWait(2000);     
//Radio button code - find number of radio buttons and select radio button which is not default ##################################################################################################################################################
 		 
 		// //If u want to know the number of radio buttons then use 

 		List<WebElement> oRadioButton = driver.findElements(By.name("radioMarketIsNonSpotlightMarket"));
 		  System.out.println("Number of Radio Buttons of Spotlight Market are : " + oRadioButton.size());  //  
 		 // Create a boolean variable which will hold the value (True/False)
 		 
 		 boolean bSelected = false;
 		 
 		 // Verify if first Radio button is selected
 		 
 		 bSelected = oRadioButton.get(0).isSelected();
 		int numOfRadioButtons = oRadioButton.size() ;
 		 
 		 // This will check that if the bValue is True means if the first radio button is selected
 		 
 		 if(bSelected = true){
 		 
 			// This will select Second radio button, if the first radio button is selected by default
 		 
 			oRadioButton.get(1).click();
 		 
 		 }else{
 		 
 			// If the first radio button is not selected by default, the first will be selected
 		 
 			oRadioButton.get(0).click();
 		 
 		 }
 		objHomePage.SetWait(2000);     
 	
 		 //	Select the radio button by value
   		   // Radio button code to select a particular value. Spotlight market has 2 radio Yes or No. below code to select Yes and also No 
 		 	 // String sRadioValue = oRadioButton.get(0).getAttribute();
 		 
 	 //	WebElement radioBtn1 =  driver.findElement(By.xpath("//input[@name='radioMarketIsNonSpotlightMarket' and @value='Yes']"));
 	//	radioBtn1.click();
                */

 		/*
//Code for drop down ##################################################################################################################################################   		
 		objHomePage.SetWait(2000);     
 		Select dropdownprimaryMVPD = new Select(driver.findElement(By.xpath("//select[@name='MarketPrimaryMVPD']")));
 		//Code for drop down selection by index
 		objHomePage.SetWait(2000);   
 		dropdownprimaryMVPD.selectByIndex(3);
 		//Code for drop down selection by value
 		objHomePage.SetWait(2000);   
 		dropdownprimaryMVPD.selectByVisibleText("COMCAST");
 		//get the default value of dropdown
 		objHomePage.SetWait(2000);   
 
 		//System.out.println("Value of Pri MVPD dropdown values = " + dropdownprimaryMVPD.getAllSelectedOptions() );
 		System.out.println("Value of Pri MVPD dropdown values = " + dropdownprimaryMVPD.getFirstSelectedOption());
 		
 		objHomePage.SetWait(2000);   
 		Select dropdownMarketRegion = new Select(driver.findElement(By.xpath("//select[@name='MarketRegion']")));
 		WebElement optionDropdownMarketRegion = dropdownMarketRegion.getFirstSelectedOption();
 		System.out.println("Value of dropdownMarketRegion values = " + optionDropdownMarketRegion.getText());
 		*/
 		
// Reports Module ################################################################################################################################################## 
	    // Click Report  link on 
		driver.findElement(By.linkText("Reporting")).click();
		    objHomePage.SetWait(2000);

// Close Browser ################################################################################################################################################## 
		   // driver.close();		    
 		
	}       // End of the function
	
 
	
	
	public void SetWait(int msec) {
		try {
			Thread.sleep(msec);
		} catch (InterruptedException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	


	

}