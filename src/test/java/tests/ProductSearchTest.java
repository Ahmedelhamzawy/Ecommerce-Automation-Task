package tests;

import actions.ProductSearchActions;
import assertions.ProductAssertions;
import dataproviders.ProductSearchData;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;

public class ProductSearchTest  extends BaseTests{
    @Test(dataProvider = "productSearchData", dataProviderClass = ProductSearchData.class)
     public void testSearchResults(String searchKeyword, String expectedSearchResult){

        ProductSearchActions searchActions = new ProductSearchActions(driver);
        //search for a product then navigating to its details page
        ProductDetailsPage pdp = searchActions.searchAndSelectProduct(searchKeyword, expectedSearchResult);
        //assert product title in details page same as we search for
        ProductAssertions.assertProductTitle(pdp.getProductTitle(), expectedSearchResult);
    }
}
