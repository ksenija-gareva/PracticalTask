package practice.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "/Users/ksenijagareva/Desktop/QA/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToPage(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }
    public List<WebElement> getElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "Error 404, element not found");
        return driver.findElements(locator);
    }

    public WebElement getElement(By locator) {
        Assertions.assertFalse(driver.findElement(locator).isDisplayed(), "There is no such element!");
        return driver.findElement(locator);

    }

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void sendKey(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void selectFromDropdown(By locator, String text) {
        Select dropdown = new Select(getElement(locator));
        dropdown.selectByVisibleText(text);
    }

    public void closeDriver() {
        driver.close();
    }
}