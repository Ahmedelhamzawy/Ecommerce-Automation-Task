package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementHelper;

public class ProductsPage {
    private WebDriver driver;
    private ElementHelper elHelp;
    public ProductsPage(WebDriver driver){
        this.driver = driver;
        this.elHelp = new ElementHelper(driver);
    }

    public ProductDetailsPage viewProductDetailsPage(String text) {
        elHelp.clickWhenClickable(
                By.xpath("//a[@class='product-item-link' and contains(text(),'"+text+"')]")
                );
        return new ProductDetailsPage(driver);
    }

}
