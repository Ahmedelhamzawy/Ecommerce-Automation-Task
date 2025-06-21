package actions;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductsPage;

public class ProductSearchActions {
    private WebDriver driver;

    public ProductSearchActions(WebDriver driver) {
        this.driver = driver;
    }

    public ProductDetailsPage searchAndSelectProduct(String keyword, String title) {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct(keyword);
        ProductsPage productsPage = homePage.selectProductDropDown(title);
        return productsPage.viewProductDetailsPage(title);
    }
}
