package practice.pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IngredientTest {
    BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "www.rus.delfi.lv";

    @Test
    public void ingredientCheck() {
        baseFunc.goToPage(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.getMenuByName("ЕДА");

        FoodPage foodPage = new FoodPage(baseFunc);
        foodPage.getRecipe();
        String selectedRecipeName = foodPage.getRecipeName();

        RecipePage recipePage = new RecipePage(baseFunc);
        IngredientPage ingredientPage = new IngredientPage(baseFunc);
        String openedRecipeName = recipePage.getRecipeNameOnRecipePage();
        Assertions.assertEquals(selectedRecipeName, openedRecipeName, "Oops, wrong recipe!");

        List<String> ingredientList = recipePage.getIngredientList();
        baseFunc.goToPage(ingredientList.get(0));
        Assertions.assertTrue(ingredientPage.getRecipeNameOnIngredientPage(openedRecipeName));

        for (int i = 1; i < ingredientList.size(); i++) {
            baseFunc.goToPage((ingredientList.get(i)));
            Assertions.assertTrue(ingredientPage.getRecipeNameOnIngredientPage(openedRecipeName));
        }
        baseFunc.closeDriver();
    }
}
