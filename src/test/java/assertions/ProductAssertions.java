package assertions;

import org.testng.Assert;

public class ProductAssertions {
    public static void assertProductTitle(String actual, String expected) {
        Assert.assertEquals(actual, expected, "Product title mismatch");
    }
}
