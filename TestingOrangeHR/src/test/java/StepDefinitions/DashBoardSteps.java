package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.MyInfoPage;
import pages.loginPage;



public class DashBoardSteps {
	
	
	WebDriver driver = null;
	DashboardPage DashBoardPage; 
	loginPage loginpage;

	MyInfoPage MyInfoPage;
	





@Given("I am navigated to the application logged in and navigated to the dashboard")
public void i_am_navigated_to_the_application_logged_in_and_navigated_to_the_dashboard() {
	System.setProperty("webdriver.chrome.driver","C:\\Testing123\\testing\\src\\test\\resources\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(34,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	loginpage = new loginPage(driver);
	loginpage.EnterUsernameAndPass("Admin", "admin123");
	loginpage.ClickSubmit();
	
}

@When("I click my info sub meny button")
public void i_click_my_info_sub_meny_button() {
	DashBoardPage = new DashboardPage(driver);
	DashBoardPage.ClickMyInfo();
    
}


@Then("I am navigated to Personal details page")
public void i_am_navigated_to_personal_details_page() throws InterruptedException {
   //MyInfoPage = new MyInfoPage(driver);
	MyInfoPage = new MyInfoPage(driver);
	Thread.sleep(3000);
	String actualTitle = MyInfoPage.ReturnNameOfMyInfoPage();
	String expectedTitle = "PIM";
	Assert.assertEquals(expectedTitle, actualTitle);
	driver.quit();
	
	
 
}


}
