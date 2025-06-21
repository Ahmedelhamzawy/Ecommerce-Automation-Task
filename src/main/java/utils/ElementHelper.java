package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Customize as needed
    }

    // Find element and wait for visibility
    public WebElement findVisibleElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Click element safely
    public void clickWhenClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Send text to field
    public void sendKeys(By locator, String text) {
        WebElement element = findVisibleElement(locator);
        element.sendKeys(text);
    }

    public void waitForTextUpdate(By locator) {
        wait.until(driver -> {
            WebElement element = driver.findElement(locator);
            String text = element.getText().trim();
            return !text.isEmpty();
        });
    }


    // Get text from element
    public String getElementText(By locator) {
        return findVisibleElement(locator).getText();
    }

    // Get multiple elements
    public java.util.List<WebElement> findElements(By locator) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElements(locator);
    }
}
