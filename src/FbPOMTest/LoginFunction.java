package FbPOMTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Class.FacebookHome;
import POM_Class.FacebookLoginPage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class LoginFunction {
WebDriver driver;
FacebookLoginPage objlogin;
FacebookHome objhome;


@BeforeTest
public void browserSetUp()

{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.navigate().to("www.facebook.com");
	
	
}
@Test
public void homepageappearsuccess()
{
	//create login
	
	objlogin=new FacebookLoginPage(driver);
	
	//logintoapplication
	objlogin.logintofb("Ray1", "pwd");
	
	objhome=new FacebookHome();
;
	Assert.assertTrue(	objhome.gethomepageheader().toLowerCase().equalsIgnoreCase("Wow"));
}

}
