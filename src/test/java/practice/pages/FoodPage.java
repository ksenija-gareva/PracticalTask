package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public FoodPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public RecipePage getOrangeCake(String name) {
        List<WebElement> recipes = baseFunc.getElements(RECIPE);
        for (WebElement cake : recipes) {
            if (cake.findElement(RECIPE).getText().contains(name)) {
                cake.click();
                return new RecipePage(baseFunc);
            }
        }
        return null;
    }
}


