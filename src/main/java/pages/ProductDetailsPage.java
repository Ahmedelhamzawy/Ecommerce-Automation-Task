package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ElementHelper;


public class ProductDetailsPage {
    private ElementHelper elHelp;
    public ProductDetailsPage(WebDriver driver){
        this.elHelp = new ElementHelper(driver);
    }
    public String getProductTitle() {
        return elHelp.getElementText(
                By.cssSelector("[data-ui-id='page-title-wrapper']")
        );
    }
    public void addProductToCart(String size, String color){
        elHelp.clickWhenClickable(
                By.xpath("//*[@class='swatch-attribute size']//*[normalize-space(text())='"+size+"']")
        );
        elHelp.clickWhenClickable(
                By.cssSelector(".swatch-attribute.color [option-label='"+color+"']")
        );
        elHelp.clickWhenClickable(
                By.id("product-addtocart-button")
        );
    }
    public WebElement getProductAddedSuccessMessage(){
        By successMessage = By.cssSelector("div.page.messages");
        return elHelp.findVisibleElement(successMessage);
    }
}
