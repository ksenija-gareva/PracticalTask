package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunc baseFunc;

    private final By COOKIES = By.xpath(".//a[@class='close cookie']");
//    private final By COOKIES = By.className("close cookie");
    private final By SECTION = By.xpath(".//a[contains(@class, 'nav-link')]");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public void acceptCookies() {
        baseFunc.waitForElement(COOKIES);
        baseFunc.getElement(COOKIES).click();
    }

    public FoodPage getSectionByName(String name) {
        List<WebElement> tabs = baseFunc.getElements(SECTION);
        for (WebElement tab : tabs) {
            if (tab.findElement(SECTION).getText().contains(name)) {
                tab.click();
                return new FoodPage(baseFunc);
            }
        }
        return null;
    }
}

//ДЕЛАЙ ОЧЕНЬ ОБЩИМИ МЕТОДАМИ ВО ВСЕХ КЛАССАХ!!!! ВОЗЬМИ ПЕРВЫЙ РЕЦЕПТ ДНЯ