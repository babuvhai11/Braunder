package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DesheCartPageObjects;

public class DesheCartPageSteps extends TestBase {

	public WebDriver driver;
	DesheCartPageObjects lp;

	@Given("User open the browser")
	public void user_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lp = new DesheCartPageObjects(driver);

	}

	@Then("quit the browser")
	public void quitDriveer() {
		driver.quit();
	}

	@Then("Go to url {string}")
	public void go_to_url(String url) {

		driver.get(url);
	}

	@Then("Click on the sign-in button")
	public void click_on_the_sign_in_button() throws IOException {
       lp.clickLoginButton(); 
	}

	@Then("insert valid uid and password")
	public void insertUIDandPasword() throws Exception {
        lp.sendUidAndPswd();
	}
	@Then("click on submit button")
	public void clickSubmitBtn() throws Exception {
        lp.clickSubmitBtn();
	}
	@Then("select the remember me box")
	public void clickRemMe() throws Exception {
        lp.clickRememberMeBtn();
	}
	
	
	
	
	
	
	
	
}
