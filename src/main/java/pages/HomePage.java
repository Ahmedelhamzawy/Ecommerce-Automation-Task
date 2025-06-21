package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {
    private WebDriver driver;
    private ElementHelper elHelp;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.elHelp = new ElementHelper(driver);
    }
    public void searchProduct(String product){
        elHelp.sendKeys(By.id("search"),product);
    }
    public ProductsPage selectProductDropDown(String product){
        By productLocator = By.xpath("//li[span[contains(text(), '"+product+"')]][1]");
        elHelp.clickWhenClickable(productLocator);
        return new ProductsPage(driver);
    }

}
