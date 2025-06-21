package tests;

import actions.CartActions;
import assertions.CartAssertions;
import dataproviders.ProductDetailsData;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CartPopUpPage;

import java.util.Map;

public class AddToCartTest extends BaseTests{
    @Test(dataProvider = "productDetails", dataProviderClass = ProductDetailsData.class)
    public void testProductAddToCart(Map<String, String> productData){
        CartActions cartActions = new CartActions(driver);
        cartActions.addProductToCart(productData);
        CartAssertions.assertSuccessMessage(cartActions.productAddedSuccessMessage());

        CartPopUpPage cartPopUpPage = cartActions.viewCartPopUp();
        CartPage cartPage = cartPopUpPage.viewCartPage();

        Map<String, String> cartData = cartPage.getCartDetails();
        CartAssertions.assertCartCounter(cartActions.getCartCount(), "1");
        CartAssertions.assertCartDataMatches(cartData, productData);

    }
}
