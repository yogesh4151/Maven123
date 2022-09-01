package Libraray_files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	public WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kotka\\eclipse-workspace\\26_March_Maven\\Browesr_files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_class.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
