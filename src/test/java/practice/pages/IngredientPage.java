package practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class IngredientPage {
    BaseFunc baseFunc;
    FoodPage foodPage;
    private final By RECIPE = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public IngredientPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean locateRecipe() {
        try {
            baseFunc.getElements(RECIPE);
        } catch (NoSuchElementException no) {
            return false;
        }
            return true;
    }

//    List<WebElement> orangeCakeDetected = baseFunc.getElements(RECIPE);
//        for (WebElement list : orangeCakeDetected) {
//            if (list.findElement(RECIPE).getText().contains(name)) {
//                return new IngredientPage(baseFunc);
//            }
//        }
//        return null;
//    }
}
