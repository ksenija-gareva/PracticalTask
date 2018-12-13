package practice.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        Assertions.assertFalse(getElements(locator).isEmpty(), "There is no such element!");
        return driver.findElement(locator);

    }

    public boolean waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return true;
    }

    public String getFirstElementOnList(By locatorA, By locatorB) {
        List<WebElement> elements = driver.findElement(locatorA).findElements(locatorB);
            return elements.get(0).getText();
    }

    public String getElementByName(By locator) {
        WebElement name = driver.findElement(locator);
        return name.getText();
    }

    public void closeDriver() {
        driver.close();
    }
}
