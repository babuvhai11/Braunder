package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.java.en.Given;
import org.testng.log4testng.Logger;
import pageObjects.DesheCartPageObjects;


public class TestBase {
	


	public WebDriver driver;
	protected WebDriverWait wait;
    public DesheCartPageObjects desheCartPageObjects;



//	@Parameters({ "browser" })
//	@BeforeMethod
//	@Given("User open the browser")
	public WebDriver beforeMethod() throws Exception {

//		Thread.sleep(2000);
//
//		if (browser.equalsIgnoreCase("Firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browser.equalsIgnoreCase("Chrome")) {
//			driver = new ChromeDriver();
//
//		} else if (browser.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//
//		}
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.deshecart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        return driver;

	}


    public DesheCartPageObjects navigateToLandingPage() throws Exception {
        driver = beforeMethod();
        desheCartPageObjects = new DesheCartPageObjects(driver);
        return desheCartPageObjects;

    }

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
//	public DesheCartPageObjects getActions() {
//		return new DesheCartPageObjects(driver);
//	}



}
