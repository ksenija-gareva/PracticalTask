package practice.pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        foodPage.acceptCookies();
        foodPage.getRecipe();
        foodPage.getName();
        foodPage.getRecipeName();

        RecipePage recipePage = new RecipePage(baseFunc);
        recipePage.getRecipeNameOnRecipePage();
        Assertions.assertEquals(foodPage.getRecipeName(), recipePage.getRecipeNameOnRecipePage(), "Oops, wrong recipe!");
        recipePage.getIngredientList();
        recipePage.getFirstIngredient();
        recipePage.getElementByNameOnList();
//        recipePage.goThroughIngredientList();

        IngredientPage ingredientPage = new IngredientPage(baseFunc);
        ingredientPage.getRecipeNameOnIngredientPage();
//        ingredientPage.isRecipeNamePresent();
//        Assertions.assertTrue(ingredientPage.isRecipeNamePresent());
      //  ingredientPage.checkRecipeOnIngredientPage();
//        ingredientPage.baseFunc.navigateBack();


    }

}
