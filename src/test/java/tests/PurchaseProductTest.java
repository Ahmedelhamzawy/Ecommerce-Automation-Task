package tests;

import actions.PurchaseActions;
import assertions.PurchaseAssertions;
import dataproviders.PurchaseTestData;
import org.testng.annotations.Test;

import java.util.Map;

public class PurchaseProductTest  extends BaseTests{
    @Test(dataProvider = "purchaseTestData", dataProviderClass = PurchaseTestData.class)
    public void purchaseProductInCartTest(Map<String, String> productData,
                                      Map<String, String> purchaseInfo){

        PurchaseActions purchaseActions = new PurchaseActions(driver);

        String confirmationText = purchaseActions.purchaseProduct(productData, purchaseInfo);
        PurchaseAssertions.assertCustomerPurchaseInfoPresent(confirmationText, purchaseInfo);

        purchaseActions.placeOrder();
        PurchaseAssertions.assertOrderPlacedThankMessage(purchaseActions.orderPlacedMessage());
    }
}
