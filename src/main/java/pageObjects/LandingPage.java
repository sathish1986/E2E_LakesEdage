package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin =By.cssSelector("a[href*='sign_in']");
	By ti =By.cssSelector(".text-center>h2");
	
	public LandingPage(WebDriver driver){
	this.driver=driver;	
	}
	

	public WebElement getTi(){
		return driver.findElement(ti);
	}

	public WebElement getLogin(){
		return driver.findElement(signin);
	}
}
