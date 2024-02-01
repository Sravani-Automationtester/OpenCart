package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegisterationPage extends BasePage
{

	WebDriver driver;
	public AccountRegisterationPage(WebDriver driver) 
	{
		super(driver);	
	}
	

@FindBy(xpath="//input[@id='input-firstname']")
private WebElement txtFirstName;

@FindBy(xpath="//input[@id='input-lastname']")
private WebElement txtLastName;

@FindBy(xpath="//input[@id='input-email']")
private WebElement txtEmail;

@FindBy(xpath="//input[@id='input-password']")
private WebElement txtPassword;

@FindBy(xpath="//input[@id='input-newsletter-no']")
private WebElement radiobtn;

@FindBy(xpath="//input[@name='agree']")
private WebElement checkboxclick;

@FindBy(xpath="//button[normalize-space()='Continue']")
private WebElement btnSubmit;

public void setFirstName(String fname)
{
	txtFirstName.sendKeys(fname);
}
public void setLastName(String lname)
{
	txtLastName.sendKeys(lname);
}
public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}

public void subscribeRadiobtn()
{
	txtPassword.click();
}

public void privacyCheckbox()
{
	//checkboxclick.click();
	checkboxclick.submit();
}

public void submitBtn()
{
	//Sol1
	btnSubmit.click();
	
	//Sol2
	//btnSubmit.submit();
	
	//Sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnSubmit).build().perform();
	
	//Sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0],click();", btnSubmit);
	
	//Sol5
	//btnSubmit.sendKeys(Keys.RETURN);
	
	//Sol6
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(btnSubmit)).click();
}

}



