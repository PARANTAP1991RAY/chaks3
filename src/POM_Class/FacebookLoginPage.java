package POM_Class;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.annotations.Test;//

//import org.testng.annotations.BeforeMethod;

//import org.testng.annotations.AfterMethod;
public class FacebookLoginPage {
WebDriver driver;

By username=By.name("uname");
By pwd=By.name("pwdname");
By loginbtn=By.name("btn");

public FacebookLoginPage(WebDriver driver)
{
	this.driver=driver;
}

public void loginfbsetusername(String strusername)
{
driver.findElement(username).sendKeys(strusername);
}


public void loginfbsetpwd(String strpwd)
{
driver.findElement(pwd).sendKeys(strpwd);
}


public void loginfblogin()
{
	driver.findElement(loginbtn).click();
}

public void logintofb(String strusername,String strpwd)
{
	
	this.loginfbsetusername(strusername);
	this.loginfbsetpwd(strpwd);
	this.loginfblogin();
	
}

}
