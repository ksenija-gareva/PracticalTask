package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class IngredientPage {
    BaseFunc baseFunc;

//    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");
    private By RECIPE_HEADLINE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public IngredientPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean getRecipeNameOnIngredientPage() {
        List<WebElement> names = baseFunc.getElements(RECIPE_HEADLINE);
        RecipePage recipePage = new RecipePage(baseFunc);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getText().contains(recipePage.getRecipeNameOnRecipePage())) {
                System.out.println("РЕЦЕПТ НАШЕЛ!" + names.get(i).getText().contains(recipePage.getRecipeNameOnRecipePage()));
                return true;
            }
        }
        return false;
    }

//    //проверить есть ли название выбранного рецепта на странице с ингредиентом
//    public void checkRecipeOnIngredientPage() {
//        RecipePage recipePage = new RecipePage(baseFunc);
//        recipePage.goThroughIngredientList();
//
//    }

    }

