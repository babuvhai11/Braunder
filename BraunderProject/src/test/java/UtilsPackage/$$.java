package UtilsPackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class $$ {
    public WebDriver driver;
    protected WebDriverWait wait;
    // Method to navigate to a URL
    public void navigateTo(String url) {
        driver.get(url);
    }

    // Method to find a WebElement using a locator
    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Method to find multiple WebElements using a locator
    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    // Method to click on a WebElement
    public void click(By locator) {
        find(locator).click();
    }

    // Method to enter text into a WebElement
    public void type(By locator, String text) {
        find(locator).sendKeys(text);
    }

    // Method to wait for a WebElement to be visible
//    public void waitForVisibility(By locator) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//
//    // Method to wait for a WebElement to be clickable
//    public void waitForClickable(By locator) {
//        wait = new WebDriverWait(driver,000 );
//        wait.until(ExpectedConditions.elementToBeClickable(locator));
//    }
    public static void clickElement(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }


    // Method to wait for a WebElement's text to be present
//    public void waitForTextPresent(By locator, String text) {
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
//    }
//
//    // Method to wait for a page title to be present
//    public void waitForTitle(String title) {
//        wait.until(ExpectedConditions.titleIs(title));
//    }

    // Method to switch to a new window
    public void switchToWindow(String windowHandle) {
        driver.switchTo().window(windowHandle);
    }

    // Method to switch to a new frame
    public void switchToFrame(By frameLocator) {
        driver.switchTo().frame(find(frameLocator));
    }

    // Method to accept an alert
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    // Method to dismiss an alert
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    // Method to get the text of an alert
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public static void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+ ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");

    }

    public static void selectOptionByVisibleText(WebDriver driver, WebElement selectCountry, String visibleText) {
        WebElement dropdownElement = driver.findElement((By) selectCountry);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public static void selectOptionByValue(WebDriver driver, By locator, String value) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }

    public static void selectOptionByIndex(WebDriver driver, By locator, int index) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);

        //By dropdownLocator = By.id("dropdown");
        // Select option by visible text
        //selectOptionByVisibleText(driver, dropdownLocator, "Option 2");
    }
    public static void hoverOverElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        //WebElement elementToHover = driver.findElement(By.id("elementId"));
        // Perform mouse hover action
        //hoverOverElement(driver, elementToHover);
    }
}
