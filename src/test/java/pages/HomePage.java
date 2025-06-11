package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //locators
    private By popupContainer = By.xpath("//*[@id='popup-widget307423-close-icon']/ancestor::div[2]");
        private By closeButton = By.id("popup-widget307423-close-icon");
    private By mainContent = By.tagName("H1");

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //
    public boolean isPopupDisplayed(){
        return driver.findElement(popupContainer).isDisplayed();
    }

    public void closePopup(){
        driver.findElement(closeButton).click();
    }

    public boolean isMainContentVisible(){
        return driver.findElement(mainContent).isDisplayed();
    }

}
