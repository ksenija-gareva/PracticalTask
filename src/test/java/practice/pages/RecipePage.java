package practice.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class RecipePage {
    BaseFunc baseFunc;

//    private By INGREDIENT = By.xpath(".//div[@class='ing-list']//a");
    private By INGREDIENT = By.xpath(".//a[@itemprop='recipeIngredient']");
    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public RecipePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public IngredientPage getIngredient() {
        List<WebElement> ingredients = baseFunc.getElements(INGREDIENT);
        for (int item = 0; item == 0; item++) {
            ingredients.get(item).click();
            return new IngredientPage(baseFunc);
        }
        return null;
    }

}
