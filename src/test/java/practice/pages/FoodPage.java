package practice.pages;

import com.google.common.collect.Iterables;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By COOKIES = By.xpath(".//a[@class='close cookie']");
    private final By RECIPE = By.xpath(".//h1[contains(@class, 'text-md')]");
    private final By ALL_HEADLINES = By.xpath(".//div[@class='col-aside pull-right']");

    public FoodPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.waitForElement(COOKIES);
        baseFunc.getElement(COOKIES).click();
    }

    public RecipePage getRecipe() {
        List<WebElement> tabs = baseFunc.getElement(ALL_HEADLINES).findElements(RECIPE);
        for (int tab = 0; tab == 0; tab++) {
            tabs.get(tab).click();
            return new RecipePage(baseFunc);
        }
            return null;
    }

    public void getRecipeName() {
        List<WebElement> names = baseFunc.getElement(ALL_HEADLINES).findElements(RECIPE);
        names.get(0).getText();
    }
}


