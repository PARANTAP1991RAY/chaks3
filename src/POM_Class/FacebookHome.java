package POM_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHome {

	WebDriver driver;
	By headername=By.name("header");
	
	public void FacebookHome()
	{
		this.driver=driver;
		
	}
	

	public String gethomepageheader()
	{
		return driver.findElement(headername).getAttribute("value");
	}
	

	
}
