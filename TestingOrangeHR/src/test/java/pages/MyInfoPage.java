package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfoPage {

	
	
WebDriver driver;
	
	public MyInfoPage (WebDriver driver) {
		this.driver = driver;
	}


	
	private By lbl_NameOfMyInfoPage = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");
	
	
	




	public String ReturnNameOfMyInfoPage() {
		return driver.findElement(lbl_NameOfMyInfoPage).getText();
	}
	
}
