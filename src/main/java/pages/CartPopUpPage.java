package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CartPopUpPage {
    private WebDriver driver;
    private ElementHelper elHelp;
    public CartPopUpPage(WebDriver driver){
        this.driver = driver;
        this.elHelp = new ElementHelper(driver);
    }
    public CartPage viewCartPage(){
        By viewCartLinkLocator = By.xpath("//*[@id='minicart-content-wrapper']//*[contains(text(),'View and Edit Cart')]");
        elHelp.clickWhenClickable(viewCartLinkLocator);
        return new CartPage(driver);
    }
    public PurchaseProductPage proceedToCheckout(){
        elHelp.clickWhenClickable(By.id("top-cart-btn-checkout"));
        return new PurchaseProductPage(driver);
    }
}
