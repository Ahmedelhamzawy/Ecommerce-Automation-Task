package dataproviders;

import org.testng.annotations.DataProvider;

import java.util.Map;

public class PurchaseTestData {
    @DataProvider(name = "purchaseTestData")
    public static Object[][] purchaseTestData() {
        Map<String, String> product = Map.of(
                "name", "Hera Pullover Hoodie",
                "size", "S",
                "color", "Blue"
        );

        Map<String, String> purchaseInfo = Map.of(
                "email","ahmedelhamzawy9@gmail.com",
                "first_name", "Ahmed",
                "last_name", "Elhamzawy",
                "street","Gamal Abdelnasser Street",
                "city","6th October",
                "zip_code","12564",
                "country","Egypt",
                "phone_number","01128679092"
        );

        return new Object[][] {
                { product, purchaseInfo }
        };
    }
}
