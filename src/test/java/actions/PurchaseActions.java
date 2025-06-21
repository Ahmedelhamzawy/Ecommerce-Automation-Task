package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.Map;

public class PurchaseActions {
    private WebDriver driver;
    private PurchaseProductPage purchaseProductPage;
    public PurchaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public String purchaseProduct(Map<String, String> productData, Map<String, String> purchaseInfo) {
        CartActions cartActions = new CartActions(driver);
        cartActions.addProductToCart(productData);

        CartPopUpPage cartPopUpPage = cartActions.viewCartPopUp();
        purchaseProductPage = cartPopUpPage.proceedToCheckout();

        purchaseProductPage.addPurchaseInfo(purchaseInfo);
        purchaseProductPage.clickNext();

        return purchaseProductPage.getPurchaseDetails();
    }
    public void placeOrder(){
        purchaseProductPage.placeOrder();
    }
    public WebElement orderPlacedMessage(){
        return purchaseProductPage.getOrderPlacedThankMessage();
    }

}
