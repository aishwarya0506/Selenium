package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
WebDriver driver;
public PageObjects(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
}
@FindBy(linkText="SignIn")
public static WebElement signin;

@FindBy(linkText="username")
public static WebElement username;

@FindBy(linkText="password")
public static WebElement password;

@FindBy(linkText="Login")
public static WebElement login;




}
