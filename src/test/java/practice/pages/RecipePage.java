package practice.pages;

import com.google.common.base.Strings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class RecipePage {
    BaseFunc baseFunc;

    //заголовок выбранного рецепта
    private By RECIPE_NAME = By.xpath(".//h1[@itemprop='name']");
    private By RECIPE_HEADLINE = By.xpath(".//h1[contains(@class, 'headline-title')]");


    //ингредиент, список
    private By INGREDIENTS = By.xpath(".//a[@itemprop='recipeIngredient']");

    public RecipePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    //    получить название выбранного рецепта
    public String getRecipeNameOnRecipePage() {
        System.out.println("ЧТО ТЫ ВЫБРАЛ?" + baseFunc.getElementByName(RECIPE_NAME));
        return baseFunc.getElementByName(RECIPE_NAME);
    }
//    public String getRecipeNameOnRecipePage() {
//        return baseFunc.getElement(RECIPE_NAME).getText().trim();
//    }

    //нажать на первый ингредиент из списка
    public IngredientPage getFirstIngredient() {
        getIngredientList().get(0);

        System.out.println("НЕШЕЛ ПЕРВЫЙ ИНГРЕДИЕНТ!" + getIngredientList().get(0));
        return new IngredientPage(baseFunc);
    }

    //список ингредиентов по локатору
    public List<String> getIngredientList() {
        List<WebElement> ingredients = baseFunc.getElements(INGREDIENTS);
        List<String> ingredientLinkList = new ArrayList<String>();

        for (int i = 0; i < ingredients.size(); i++) {
//            if (!Strings.isNullOrEmpty(ingredients.get(i).getAttribute("href"))) {
                    ingredientLinkList.add(ingredients.get(i).getAttribute("href"));
                System.out.println("ССЫЛОНЬКИ НАШЕЛ!" + ingredientLinkList);
            }
            return ingredientLinkList;
        }
//        return null;
//    }

    //цикл для списка ингредиентов
    public IngredientPage getElementByNameOnList() {
    List<String> ingredients = getIngredientList();
    List<String> each = new ArrayList<String>();
    for (int i = 1; i < ingredients.size(); i++) {
        System.out.println("НЕШЕЛ ВСЕ ИНГРЕДИЕНТЫ!" + each.get(i));
        each.get(i);
        return new IngredientPage(baseFunc);
    }
        return null;
    }

}


