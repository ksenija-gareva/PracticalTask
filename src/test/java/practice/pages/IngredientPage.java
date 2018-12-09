package practice.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IngredientPage {
    BaseFunc baseFunc;
    RecipePage recipePage;
    FoodPage foodPage;
    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public IngredientPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void checkRecipeOnIngredientPage() {
        foodPage.getRecipeName();
    }
}
