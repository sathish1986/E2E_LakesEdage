package Selenium_Framework.E2E_LakesEdge;

import java.io.IOException;

import junit.framework.Assert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resource.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ValidateTitle {
	
	public static Logger log = LogManager.getLogger(ValidateTitle.class.getName());
	public class HomePage extends base {
		
		@BeforeTest
		
		public void initlazation() throws IOException{
		driver = initialzeDriver();
	    log.debug("Broweser Lanuced");
		driver.navigate().to(prop.getProperty("url"));
		log.debug("URL Lanuced");
		}
		@Test
		
		public void browserLanuch() throws IOException{
	
		LandingPage lp=new LandingPage(driver);
		//Assert.assertEquals(, lp.getTi().getText())
		log.debug(lp.getTi().getText());
		
		}
		@AfterTest
		public void closeBrow(){
			driver.close();
		    driver=null;
		}
		
	}
}

