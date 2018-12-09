package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunc baseFunc;

    private final By COOKIES = By.xpath(".//a[@class='close cookie']");
    private final By MENU = By.id("quick-site-section-navigation-inner");
    private final By MENU_ITEM = By.xpath(".//span");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public void acceptCookies() {
        baseFunc.waitForElement(COOKIES);
        baseFunc.getElement(COOKIES).click();
    }

    public FoodPage getMenuByName(String name) {
        List<WebElement> menuItem = baseFunc.getElement(MENU).findElements(MENU_ITEM);
        for (WebElement menu : menuItem) {
            if (menu.getText().equals(name)) {
                menu.click();
                return new FoodPage(baseFunc);
            }
        }
        return null;
    }
}
