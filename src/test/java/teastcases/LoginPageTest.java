package teastcases;

import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.DatabasePage;
import Page.LoginPage;
import base.TestBase;

public class LoginPageTest extends TestBase {
LoginPage LoginpageObj;

@BeforeMethod
public void setUp() {
 initializeDriver();
 LoginpageObj = PageFactory.initElements(driver, LoginPage.class);
}
@Test
public void LoginTest() throws InterruptedException, ClassNotFoundException, SQLException {
	LoginpageObj.enterUserName("demo@techfios.com");
	LoginpageObj.enterPassword("abc123");
	LoginpageObj.clickSignInButton();
	//LoginpageObj.enterUserName(DatabasePage.getData("username"));
	Thread.sleep(3000);
	//LoginpageObj.enterPassword(DatabasePage.getData("password"));
	Thread.sleep(3000);
	//LoginpageObj.clickSignInButton();
}
@AfterMethod
public void tearDown() {  
 driver.close();
 driver.quit();
}

}
