package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");
    // .//div[@class='list-item-wrapper'] РАЗДЕЛ ДЕСЕРТЫ

    public FoodPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
//    public RecipePage getDaysRecipe(int id) {
//        List<WebElement> recipes = baseFunc.getElements(RECIPE);
//        for (WebElement today : recipes) {
//            if (today.findElements(RECIPE).get(id); {
//                today.click();
//                return new RecipePage(baseFunc);
//            }
//        }
//
//        return null;
//    }
}


