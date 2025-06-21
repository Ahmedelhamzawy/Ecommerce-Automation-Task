package actions;


import org.openqa.selenium.WebDriver;
import pages.ProductDetailsPage;
import utils.ConfigReader;

public class NavigationActions {
    private WebDriver driver;

    public NavigationActions(WebDriver driver) {
        this.driver = driver;
    }
    public ProductDetailsPage redirectToProductDetailsPage(String product){
        String productUrl = product.toLowerCase().replace(" ", "-");
        driver.get(ConfigReader.get("baseUrl")+'/'+productUrl+".html");
        return new ProductDetailsPage(driver);
    }
}
