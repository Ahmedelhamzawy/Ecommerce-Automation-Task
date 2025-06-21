package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CartPopUpPage;
import utils.ElementHelper;

public class HeaderComponent {

    private WebDriver driver;
    private ElementHelper elHelp;

    private By cartIcon = By.cssSelector("a.action.showcart");
    private By cartCounter = By.cssSelector("span.counter-number");

    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
        this.elHelp = new ElementHelper(driver);
    }

    public String getCartCounter(){
        // Wait until the count appears in the element
        waitForCartCounterUpdate();
        // Now safely return the count
        return elHelp.getElementText(cartCounter);
    }
    public void waitForCartCounterUpdate(){
        elHelp.waitForTextUpdate(cartCounter);
    }
    public CartPopUpPage viewCartPopUp(){
        waitForCartCounterUpdate();
        clickOnCartIcon();
        return new CartPopUpPage(driver);
    }
    public void clickOnCartIcon(){
        elHelp.clickWhenClickable(cartIcon);
    }
}
