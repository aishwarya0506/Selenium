package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class File1 {
	WebDriver driver;

	
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("user enter username as mercury and password as mercury")
	public void user_enter_username_as_mercury_and_password_as_mercury() {
		PageObject loginpage = PageFactory.initElements(driver, PageObject.class);
		loginpage.un.sendKeys("mercury");
		loginpage.psd.sendKeys("mercury");
		//loginpage.login();
	}

	@When("Click on Submit button")
	public void click_on_Submit_button() {
		PageObject loginpage = PageFactory.initElements(driver, PageObject.class);
		PageObject.ok.click();
	}

	@Then("verify login result")
	public void verify_login_result() {
		String title=driver.getTitle();
		Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		driver.close();
	}
}
