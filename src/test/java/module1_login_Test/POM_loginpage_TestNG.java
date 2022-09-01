package module1_login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libraray_files.Base_class;
import Libraray_files.Utility_class;
import module1_login.PBMyProfilePage;
import module1_login.PBProfilePage;
import module1_login.PBSignInWithmobileNumPage;
import module1_login.PBSignInwithPasswordPage;
import module1_login.PBSigninPage;

public class POM_loginpage_TestNG extends Base_class
{
	int a;
	PBSigninPage Signin;
	PBSignInWithmobileNumPage mobile;
	PBSignInwithPasswordPage Password;
	PBMyProfilePage profile;
	PBProfilePage name;
	int TCID;
	
	
	@BeforeClass
	public void opnebrowser() throws EncryptedDocumentException, IOException
	{
		
		
		initializeBrowser();
		
		Signin=new PBSigninPage(driver);
		mobile=new PBSignInWithmobileNumPage(driver);
		Password=new PBSignInwithPasswordPage(driver);
		profile=new PBMyProfilePage(driver);
		name=new PBProfilePage(driver);
		a=10;
		
	}
	
	
	@BeforeMethod
	public void loginToapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Signin.clickPBSigninPagesignIN();
		mobile.setPBSignInWithmobileNumberPagepassword(Utility_class.getPFData("mobNum"));
		mobile.clickPBSignInWithmobileNumPagesigninwithpasswrd();
		Thread.sleep(3000);
		Password.setPBSignInwithPasswordPagepassword(Utility_class.getPFData("PWD"));
		Password.clickPBSignInwithPasswordPageSignin();
		
	}
	
    @Test
	public void verifyuserID() throws InterruptedException, EncryptedDocumentException, IOException
	{
    	TCID=101;
    	
    	Thread.sleep(3000);
    	Signin.movetoPBSigninPageMyaccount();
		profile.clickPBMyProfilePageMyProfile();
		name.switchtochildwindow();
		//name.gettextPBProfilePageprofilname(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actProfile=name.getPBProfilePageprofilename();
		String expProfile=Utility_class.getTD(0, 2);
		
		Assert.assertEquals(actProfile, expProfile,"Failes:Both results are not equal");
	}
    
    @AfterMethod
    public void logoutToapp(ITestResult result ) throws IOException
    {
    	if (result.getStatus()==ITestResult.FAILURE)
    	{
    		Utility_class.captureScreenshot(driver, TCID);
    	}
    		
     }
    
    @AfterClass
    public void closebrowser()
    {
    	driver.quit();
    }
}
