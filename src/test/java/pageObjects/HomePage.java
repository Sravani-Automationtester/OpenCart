package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}


@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lnkMyAccount;

@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']")
WebElement lnkRegister;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement lnkLogin;

//Actions act=new Actions(driver);

public void clickMyAccount()
{
	lnkMyAccount.click();
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0],click();", lnkMyAccount);
	//act.moveToElement(lnkMyAccount).build().perform();
}
public void clickRegister()
{
	lnkRegister.click();
	//act.moveToElement(lnkRegister).build().perform();
}
public void clickLogin()
{
	lnkLogin.click();
}
}
