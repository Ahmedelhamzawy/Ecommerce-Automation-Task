package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ElementHelper;
import java.util.List;
import java.util.Map;

public class CartPage {
    private ElementHelper elHelp;
    public CartPage(WebDriver driver){
        this.elHelp = new ElementHelper(driver);
    }
    public Map<String, String> getCartDetails(){
        String productName = elHelp.getElementText(By.cssSelector(".cart.item .product-item-name a"));
        List<WebElement> optionElements = elHelp.findElements(By.cssSelector(".cart.item .item-options dd"));

        String size = getOptionText(optionElements, 0);
        String color = getOptionText(optionElements, 1);
        return Map.of(
                "name", productName,
                "size", size,
                "color", color
        );
    }
    private String getOptionText(List<WebElement> elements, int index) {
        return (elements.size() > index) ? elements.get(index).getText() : "";
    }
}
