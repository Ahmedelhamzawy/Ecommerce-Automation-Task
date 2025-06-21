package dataproviders;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class ProductDetailsData {
    @DataProvider(name = "productDetails")
    public static Object[][] productDetailsData() {
        Map<String, String> product = new HashMap<>();
        product.put("name", "Hera Pullover Hoodie");
        product.put("size", "S");
        product.put("color", "Blue");

        return new Object[][] {
                { product },
        };
    }
}
