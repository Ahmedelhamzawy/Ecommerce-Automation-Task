package assertions;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class PurchaseAssertions {
    private static SoftAssert softAssert = new SoftAssert();

    public static void assertOrderPlacedThankMessage(WebElement message) {
        softAssert.assertTrue(message.isDisplayed(), "order placed thank message not displayed");
    }
    public static void assertCustomerPurchaseInfoPresent(String confirmationText, Map<String, String> purchaseInfo) {
        softAssert.assertTrue(
                confirmationText.contains(purchaseInfo.get("first_name") + " " + purchaseInfo.get("last_name")),
                "Full name not found in confirmation text"
        );

        softAssert.assertTrue(
                confirmationText.contains(purchaseInfo.get("street")),
                "Street not found in confirmation text"
        );

        softAssert.assertTrue(
                confirmationText.contains(purchaseInfo.get("country")),
                "Country not found in confirmation text"
        );
        softAssert.assertAll();
    }
}
