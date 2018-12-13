package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By RECIPE_HEADLINE = By.xpath(".//h1[contains(@class, 'text-md')]");
    private final By ALL_HEADLINES = By.xpath(".//div[@class='col-aside pull-right']");

    public FoodPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getRecipeName() {
        return baseFunc.getFirstElementOnList(ALL_HEADLINES, RECIPE_HEADLINE);
    }

    public RecipePage getRecipe() {
        List<WebElement> recipe = baseFunc.getElement(ALL_HEADLINES).findElements(RECIPE_HEADLINE); {
            for (int i = 0; i == 0; i++) {
                recipe.get(i).click();
            }
            return new RecipePage(baseFunc);
        }
    }

}


