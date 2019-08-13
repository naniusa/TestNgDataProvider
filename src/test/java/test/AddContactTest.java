package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	@Test
	@Parameters({"email","password","Name","company","email","phone","address","city","state","zip","country"})
	public void AddContact(String email,String password,String Name,String company,String Email,String phone,String address,String city,String state,String zip,String country) throws InterruptedException {
		WebDriver driver=BrowserFactory.startBrowser("chrome","http://techfios.com/test/billing/?ng=login/");
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		login.LoginTechfios(email, password);
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.VerifyPageLogin();
		home.ClickAddContact();
		AddContactPage contact=PageFactory.initElements(driver,AddContactPage.class);
	    contact.FillingUpTheAddressForm( Name,company,Email,phone,address,city,state,zip,country);
		Thread.sleep(3000);
	driver.close();
	driver.quit();
	
	
	
	}

	

}


