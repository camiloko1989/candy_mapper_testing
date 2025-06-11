package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverFactory {

    public static   WebDriver createWebDriver(String browser) {
        WebDriver driver;
        switch (browser.toLowerCase()) {
            case "chrome":
               // System.setProperty("webdriver.chrome.driver", "C://Users//User//Documents//drivers");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "path/to/edgedriver");
                driver = new EdgeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
        return driver;
    }
}
