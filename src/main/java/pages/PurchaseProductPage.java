package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ElementHelper;
import java.util.Map;


public class PurchaseProductPage {
    private ElementHelper elHelp;
    public PurchaseProductPage(WebDriver driver){
        this.elHelp = new ElementHelper(driver);
    }
    public void addPurchaseInfo(Map<String, String> purchaseInfo){
        elHelp.sendKeys(By.id("customer-email"),purchaseInfo.get("email"));
        elHelp.sendKeys(By.name("firstname"),purchaseInfo.get("first_name"));
        elHelp.sendKeys(By.name("lastname"),purchaseInfo.get("last_name"));
        elHelp.sendKeys(By.name("street[0]"),purchaseInfo.get("street"));
        elHelp.sendKeys(By.name("city"),purchaseInfo.get("city"));
        elHelp.sendKeys(By.name("postcode"),purchaseInfo.get("zip_code"));
        elHelp.sendKeys(By.name("country_id"),purchaseInfo.get("country"));
        elHelp.sendKeys(By.name("telephone"),purchaseInfo.get("phone_number"));
        elHelp.clickWhenClickable(By.name("ko_unique_1"));
    }
    public String getPurchaseDetails(){
         return elHelp.getElementText(By.cssSelector(".billing-address-details"));
    }
    public void clickNext(){
        elHelp.clickWhenClickable(By.cssSelector(".button.action.continue.primary"));
    }
    public void placeOrder(){
       elHelp.clickWhenClickable(By.xpath("//*[contains(text(), 'Place Order')]"));
    }
    public WebElement getOrderPlacedThankMessage(){
        return elHelp.findVisibleElement(By.cssSelector("[data-ui-id='page-title-wrapper']"));
    }
}
