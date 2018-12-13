package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class RecipePage {
    BaseFunc baseFunc;

    private By RECIPE_NAME = By.xpath(".//h1[@itemprop='name']");
    private By INGREDIENTS = By.xpath(".//a[@itemprop='recipeIngredient']");

    public RecipePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getRecipeNameOnRecipePage() {
        return baseFunc.getElementByName(RECIPE_NAME);
    }

    public List<String> getIngredientList() {
        List<WebElement> ingredients = baseFunc.getElements(INGREDIENTS);
        List<String> ingredientLinkList = new ArrayList<String>();
        for (int i = 0; i < ingredients.size(); i++) {
            ingredientLinkList.add(ingredients.get(i).getAttribute("href"));
        }
        return ingredientLinkList;
    }
}


