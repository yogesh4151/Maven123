package module1_login;

//class2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInWithmobileNumPage {

	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobilenumber;
	@FindBy (xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signinwithpasswrd;
	
	public PBSignInWithmobileNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPBSignInWithmobileNumberPagepassword(String mobilenum)
	{
		mobilenumber.sendKeys(mobilenum);
	}
	
	public void clickPBSignInWithmobileNumPagesigninwithpasswrd()
	{
		signinwithpasswrd.click();
	}
}
