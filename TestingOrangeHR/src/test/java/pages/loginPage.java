package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	public loginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	private By lbl_titleName = By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title");
	private By txt_username = By.name("username");
	private By txt_pass = By.name("password");
	private By btn_login = By.cssSelector("button[type='submit']");
	
	
	public String titleName()
	{
		return driver.findElement(lbl_titleName).getText();
	}
	
	public void EnterUsernameAndPass()
	{
		driver.findElement(txt_username).sendKeys("Admin");
		driver.findElement(txt_pass).sendKeys("admin123");
	}
	
	public void ClickSubmit()
	{
		driver.findElement(btn_login).click();
	}
}
