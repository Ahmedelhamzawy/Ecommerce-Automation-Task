package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;
import utils.DriverFactory;

import java.time.Duration;

public class BaseTests {
    protected WebDriver driver;
    @BeforeClass
    public void setUp(){
        String browser = ConfigReader.get("browser");                     //if you want to change browser hit config.properties
        driver = DriverFactory.createDriver(browser);                     //driver factory is used for dynamic browser choice
        driver.manage().window().maximize();                              //maximizing window so that all web elements appear and be accessible
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//adding a wait if needed
        driver.get(ConfigReader.get("baseUrl"));
    }
    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
