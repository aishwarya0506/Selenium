package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver driver;
	@Given("^Navigate to Home Page$")
	public void navigate_to_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\path\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demoaut.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user enters name and password$")
	public void user_enters_name_and_password() throws Throwable {
		PageObjects.signin.click();
		PageObjects.username.sendKeys("mercury");
		PageObjects.password.sendKeys("mercury");
		PageObjects.login.click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user logged successfully$")
	public void user_logged_successfully() throws Throwable {
		System.out.println("User login successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}


}
