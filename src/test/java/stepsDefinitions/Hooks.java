package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class Hooks {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUp() {
        driver = WebDriverFactory.createWebDriver("chrome");
        System.out.println("Browser launched before scenario.");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
