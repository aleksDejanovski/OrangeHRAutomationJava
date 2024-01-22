package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.loginPage;

public class LoginSteps {

	WebDriver driver = null;
	loginPage loginP; 

@Given("I am navigated to the orange hr page")
public void i_am_navigated_to_the_orange_hr_page() {
    // Write code here that turns the phrase above into concrete actions

System.setProperty("webdriver.chrome.driver","C:\\Testing123\\testing\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(34,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		loginP = new loginPage(driver);
		Assert.assertTrue(loginP.titleName().contains("Login"));
}

@When("I enter valid credentials")
public void i_enter_valid_credentials() throws InterruptedException {
   
    loginP = new loginPage(driver);
    loginP.EnterUsernameAndPass();
    Thread.sleep(2000);
}

@When("I click to login button")
public void i_click_to_login_button() {
    
	loginP = new loginPage(driver);
    loginP.ClickSubmit();
}

@Then("I am navigated to the orange hr homepage")
public void i_am_navigated_to_the_orange_hr_homepage() {
    
	// Write code here that turns the phrase above into concrete actions

    DashboardPage DashboardPage = new DashboardPage(driver);
    Assert.assertTrue(DashboardPage.ReturnNameOfPage().contains("Dash"));
    driver.quit();
}



	
}
