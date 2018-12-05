package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunc baseFunc;

//    private final By COOKIES = By.xpath(".//a[@class='close cookie']");
    private final By COOKIES = By.className("close cookie");
    private final By FOOD = By.xpath(".//a[contains(@class, 'nav-link')]");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public void acceptCookies() {
        baseFunc.waitForElement(COOKIES);
        baseFunc.getElement(COOKIES).click();
    }

    public FoodPage getFoodTab(String title) {
        List<WebElement> tabs = baseFunc.getElements(FOOD);
        for (WebElement tab : tabs) {
            if (tab.findElement(FOOD).getText().contains(title)) {
                tab.click();
                return new FoodPage(baseFunc);
            }
        }
        return null;
    }
}
