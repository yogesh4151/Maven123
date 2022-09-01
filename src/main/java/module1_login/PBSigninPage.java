package module1_login;

//class1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSigninPage {

	@FindBy (xpath="//a[@class='sign-in']") private WebElement signIN;
	
	@FindBy(xpath="(//i[@class='arrow'])[5]") private WebElement Myaccount;
	
	WebDriver driver1;
	
	public PBSigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void clickPBSigninPagesignIN()
	{
		signIN.click();
	}
	
	public void movetoPBSigninPageMyaccount()
	{
		Actions act=new Actions(driver1);
		
		act.moveToElement(Myaccount).perform();
				
	}
	
		
	
}
