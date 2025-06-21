package dataproviders;

import org.testng.annotations.DataProvider;

public class ProductSearchData {
    @DataProvider(name = "productSearchData")
    public static Object[][] productSearchData() {
        return new Object[][] {
                // { searchKeyword,               expectedProductTitle }
                { "Hera",                       "Hera Pullover Hoodie" }
                // add more rows as needed
        };
    }
}
