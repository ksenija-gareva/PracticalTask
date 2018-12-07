package practice.pages;

import org.junit.jupiter.api.Test;

public class IngredientTest {
    BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "www.rus.delfi.lv";

    @Test
    public void ingredientCheck() {
        baseFunc.goToPage(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.getSectionByName("Еда");

        FoodPage foodPage = new FoodPage(baseFunc);
        foodPage.getDaysRecipe(40);

        RecipePage recipePage = new RecipePage(baseFunc);
        recipePage.clickOnIngredient();

        IngredientPage ingredientPage = new IngredientPage(baseFunc);
        ingredientPage.locateRecipe();
    }

}
