package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	@Test
	@Parameters({"email","password"})
	public void login(String email,String password) throws InterruptedException {
		WebDriver driver=BrowserFactory.startBrowser("chrome","http://techfios.com/test/billing/?ng=login/");
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		login.LoginTechfios(email, password);
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.VerifyPageLogin();
		
	driver.close();
	driver.quit();

}
}