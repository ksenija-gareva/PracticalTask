package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By COOKIES = By.xpath(".//a[@class='close cookie']");
    private final By RECIPE_HEADLINE = By.xpath(".//h1[contains(@class, 'text-md')]");
    private final By ALL_HEADLINES = By.xpath(".//div[@class='col-aside pull-right']");

    public FoodPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.waitForElement(COOKIES);
        baseFunc.getElement(COOKIES).click();
    }

    //получить название рецепта, с которым буду работать
    public String getRecipeName() {
        System.out.println("ИМЯ РЕЦЕПТА ДАВАЙ!" + baseFunc.getFirstElementOnList(ALL_HEADLINES, RECIPE_HEADLINE));
        return baseFunc.getFirstElementOnList(ALL_HEADLINES, RECIPE_HEADLINE);
    }
    public String getName() {
        List<WebElement> tabs = baseFunc.getElement(ALL_HEADLINES).findElements(RECIPE_HEADLINE); {
            for (int i = 0; i == 0; i++) {
               System.out.println("ЧТО ЗА ИМЯ?" + tabs.get(i).getText().trim());
               return tabs.get(i).getText().trim();
            }
            return null;
        }
    }

    //нажать на рецепт с которым буду работать (рецепт дня)
    public RecipePage getRecipe() {
        List<WebElement> recipe = baseFunc.getElement(ALL_HEADLINES).findElements(RECIPE_HEADLINE); {
            for (int i = 0; i == 0; i++) {
                System.out.println("НАШЕЛ РЕЦЕПТ!");
                recipe.get(i).click();
            }
            return new RecipePage(baseFunc);
        }
    }

}


