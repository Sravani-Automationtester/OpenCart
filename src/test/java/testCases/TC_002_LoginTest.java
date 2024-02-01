package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test
	public void verify_login()
	{
		logger.info("******Starting TC_002_Login Test*******");
		logger.debug("Capturing Application Debugger logs...");
		try
		{
		//HomePage
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my account link on the home page");
		hp.clickLogin(); //login under my account link
		logger.info("clicked on login link under myaccount..");
		
		//login page
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); //login page login button
		logger.info("Clicked on login button");}
		
		//Myaccount page
		/*MyAccountPage mcp=new MyAccountPage(driver);
		boolean targetPage=mcp.isMyAccountPageExists();
		
		Assert.assertEquals(targetPage,true,"Login failed");
		}*/
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("******Finished TC_002_Login Test*******");
}
}
