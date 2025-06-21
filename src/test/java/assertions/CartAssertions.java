package assertions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class CartAssertions {
    private static SoftAssert softAssert = new SoftAssert();

    public static void assertCartCounter(String actualCount,String expectedCount){
        Assert.assertEquals(actualCount,expectedCount,"cart count not as expected");
    }
    public static void assertCartDataMatches(Map<String, String> cartData,Map<String, String> productData){
        softAssert.assertEquals(cartData.get("name"),productData.get("name"),"product name added to cart not as selected");
        softAssert.assertEquals(cartData.get("size"),productData.get("size"),"product size added to cart not as selected");
        softAssert.assertEquals(cartData.get("color"),productData.get("color"),"product color added to cart not as selected");
        softAssert.assertAll();
    }

    public static void assertSuccessMessage(WebElement message) {
        Assert.assertTrue(message.isDisplayed(), "Success message not displayed");
    }
}
