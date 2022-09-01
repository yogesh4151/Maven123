package module1_login;

//class4

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage {
	
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
	
	public PBMyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBMyProfilePageMyProfile()
	{
		MyProfile.click();
	}

}
