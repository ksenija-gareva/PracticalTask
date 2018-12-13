package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class IngredientPage {
    BaseFunc baseFunc;

    private By RECIPE_HEADLINE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public IngredientPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean getRecipeNameOnIngredientPage(String name) {
        List<WebElement> names = baseFunc.getElements(RECIPE_HEADLINE);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getText().contains(name)) {
               return true;
            }
        }
       return false;
    }

}

