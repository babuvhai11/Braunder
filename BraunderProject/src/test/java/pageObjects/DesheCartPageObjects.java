package pageObjects;

import UtilsPackage.$$;
import UtilsPackage.ReadConfig;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DesheCartPageObjects{
	public WebDriver driver;
//	public Logger log;
	public DesheCartPageObjects(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
		//log = LogManager.getLogger("Get Log");
		//PropertyConfigurator.configure("Log4j.properties");
	}
	ReadConfig data;
	By logInButton = By.xpath("//a[contains(text(),'Sign In')]");
	By UID = By.xpath("//input[@id='email']");
	By Pswd = By.xpath("//input[@id='password-login']");
	By submitBtn = By.xpath("");///html/body/div[9]/div/div[1]/div/div/div[1]/div/form/div[4]/div[1]/button
	By rememberMe = By.xpath("//input[@id='exampleCheck1']");
	
	public void clickLoginButton() throws IOException {
		$$.clickElement(driver,logInButton, 2000);
		$$.captureScreen(driver, "LandingPage");
	//	log.info("Login Button Clicked");
	}
	 
	public void sendUidAndPswd() throws Exception {
		data = new ReadConfig();
	    driver.findElement(UID).sendKeys(data.getUsername());
	    Thread.sleep(1000);
	    driver.findElement(Pswd).sendKeys(data.getPassword());
	}
	public void clickSubmitBtn() throws Exception {
		Thread.sleep(1000);
		driver.findElement(submitBtn).click();
	}
	public void clickRememberMeBtn() throws Exception {
		Thread.sleep(1000);
		driver.findElement(rememberMe).click();
	//	log.info("Login Button Clicked");

	}
	
}
