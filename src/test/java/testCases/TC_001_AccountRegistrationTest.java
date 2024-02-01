package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegisterationPage;
import pageObjects.BasePage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	WebDriver driver;
	@Test
	
	public void verify_account_registration()
	{
		logger.debug("*******Application logs********");
		try
		{
		
		logger.info("*****starting AccountRegistartionTest*****");
		HomePage hp=new HomePage(BaseClass.driver);
		
		hp.clickMyAccount();
		logger.info("*****Clicked on registration link*****");
		
		hp.clickRegister();
		logger.info("*****Clicked on registartion link*****");
		
		logger.info("*****Entering customer details*****");
		AccountRegisterationPage arp=new AccountRegisterationPage(BasePage.driver);
		arp.setFirstName(randomeString().toUpperCase());
		arp.setLastName(randomeString().toUpperCase());
		arp.setEmail(randomeString()+"gmail.com");
		arp.setPassword(randomStringNumeric());
		arp.subscribeRadiobtn();
		arp.privacyCheckbox();
		arp.submitBtn();
		logger.info("*****Clicked on Continue*****");
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("debug logs...");
			//Assert.fail();
		}
		logger.info("*****Finished AccountRegistartionTest*****");
	}

}
