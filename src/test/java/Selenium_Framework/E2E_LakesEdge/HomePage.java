package Selenium_Framework.E2E_LakesEdge;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resource.base;

public class HomePage extends base {
	
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	
	public void initlazation() throws IOException{
	driver = initialzeDriver();
	log.debug("Browser Lanuced");
	
	}
	
	@Test(dataProvider="getData")
	
	public void browserLanuch(String Username, String Password) throws IOException{
		driver.navigate().to(prop.getProperty("url"));
	    log.debug("URL Lanuced");
    
	LandingPage lp=new LandingPage(driver);
	lp.getLogin().click();
	LoginPage lo=new LoginPage(driver);
	lo.getEmail().sendKeys(Username);
	lo.getPassword().sendKeys(Password);
	lo.getSign().click();
	log.debug("clicked sign in button");
	
	}
	
	@DataProvider
 public Object[][] getData(){
		
		Object[][] a=new Object[2][2];
		a[0][0]="singapore.sathish14@gmail.com";
		a[0][1]="Sathish@1986";
	//a[1][0]="vaishaus@gmail.com";
// a[1][1]="54321";
			
		return a;
		
	}
	
	@AfterTest
	public void closeBrow(){
		driver.close();
		 driver=null;
	}
	
}
