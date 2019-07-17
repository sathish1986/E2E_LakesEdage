package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initialzeDriver() throws IOException {

		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sathish\\Desktop\\REST_API\\Automation_work\\E2E_LakesEdge\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		String Browername = prop.getProperty("browser");
		System.out.println(Browername);

		if (Browername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//sathish//Desktop//REST_API//Browser_Driver//chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (Browername.equals("Firefox")) {
			// System.setProperty("webdriver.chrome.driver",
			// "C://Users//sathish//Desktop//REST_API//Browser_Driver");
			// driver= new FirefoxDriver();
			System.out.println("run with FireFox Browser");
			
		} else if (Browername.equals("IE")) {
			// System.setProperty("webdriver.chrome.driver",
			// "C://Users//sathish//Desktop//REST_API//Browser_Driver");
			// driver= new IEDriver();
			System.out.println("run with IE Browser");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreen(String result) throws IOException{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C://Users//sathish//Desktop//REST_API//Selenium_Screenshots//"+result+"screenshot.png"));
		
	}

}
