package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By un=By.cssSelector("[id='user_email']");
	By pw=By.cssSelector("[id='user_password']");
	By sig= By.cssSelector("[type='submit']");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public WebElement getEmail(){
		return driver.findElement(un);
	}
	
	public WebElement getPassword(){
		return driver.findElement(pw);
	}
	public WebElement getSign(){
		return driver.findElement(sig);
	}
	
	
}
