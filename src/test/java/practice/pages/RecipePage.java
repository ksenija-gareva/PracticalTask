package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class RecipePage {
    BaseFunc baseFunc;

    private By INGREDIENT = By.xpath(".//a[contains(@class, 'ing-title')]");
    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public RecipePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
//
//    public IngredientPage getIngredient(String name) {
//        List<WebElement> ingredients = baseFunc.getElements(INGREDIENT);
//        for (WebElement item : ingredients) {
//            if (item.findElement(INGREDIENT).getText().contains(name)) {
//                item.click();
//                return new IngredientPage(baseFunc);
//            }
//        }
//        return null;
//    }

//    public Map<String, List> clickOnIngredient() {
//        Map<String, List> ingredientsMap = new HashMap<String, List>();
//        List<WebElement> ingredients = baseFunc.getElements(INGREDIENT);
//        for (WebElement item : ingredients) {
//            item.click();
//            List<WebElement> recipeOnIngredientPage = baseFunc.getElements(RECIPE);
//        }
//        ingredientsMap.put(item.getText(), recipeOnIngredientPage);
//    }
//    return ingredientsMap;
}
