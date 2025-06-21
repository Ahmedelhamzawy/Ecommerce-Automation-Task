package actions;

import components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.Map;

public class CartActions {
    private WebDriver driver;
    private HeaderComponent headerComponent;
    public CartActions(WebDriver driver) {
        this.driver = driver;
        this.headerComponent = new HeaderComponent(driver);
    }

    public void addProductToCart(Map<String, String> productData) {
        NavigationActions navigation = new NavigationActions(driver);
        ProductDetailsPage pdp = navigation.redirectToProductDetailsPage(productData.get("name"));
        pdp.addProductToCart(productData.get("size"), productData.get("color"));
    }
    public WebElement productAddedSuccessMessage(){
        ProductDetailsPage pdp = new ProductDetailsPage(driver);
        return pdp.getProductAddedSuccessMessage();
    }
    public CartPopUpPage viewCartPopUp(){
        return headerComponent.viewCartPopUp();
    }

    public String getCartCount() {
        return headerComponent.getCartCounter();
    }
}
