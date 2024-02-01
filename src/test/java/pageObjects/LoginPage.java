package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) 
	{
		super(driver);	
	}
	
@FindBy(xpath="//input[@id='input-email']")
private WebElement txtEmailID;

@FindBy(xpath="//input[@id='input-password']")
private WebElement txtPwd;

@FindBy(xpath="//button[normalize-space()='Login']")
private WebElement btnlogin;

public void setEmail(String emailid)
{
	txtEmailID.sendKeys(emailid);
}
public void setPassword(String pwd)
{
	txtPwd.sendKeys(pwd);
}
public void clickLogin()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0],click();",btnlogin);
	//btnlogin.click();
}


}
