package module1_login;

//class5

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PBProfilePage {
	
	@FindBy (xpath="//div[text()='Yogesh Suresh Shinde']") private WebElement profilname;
	
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchtochildwindow()
	{
		
		Set<String> allilds = driver1.getWindowHandles();
		ArrayList<String> id=new ArrayList<String>(allilds);
		String childwindowid = id.get(1);
		
		driver1.switchTo().window(childwindowid);
		
	}
	
	public String getPBProfilePageprofilename()
	{
		String actPN = profilname.getText();
		return actPN;
	}
	
//	public void gettextPBProfilePageprofilname(String exp)
//	{
//		
//		String act = profilname.getText();
//		
//		if(act.equals(exp))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		
	
//	}
}
