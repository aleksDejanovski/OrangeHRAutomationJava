package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

WebDriver driver;
	
	public DashboardPage (WebDriver driver) {
		this.driver = driver;
	}	
	
	
	private By lbl_dashboardLabel = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");
	
	
	public String ReturnNameOfPage()
	{
		return driver.findElement(lbl_dashboardLabel).getText();
	}
	
	
}
