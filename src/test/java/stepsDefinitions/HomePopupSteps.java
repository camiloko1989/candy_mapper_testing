package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.WebDriverFactory;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;


public class HomePopupSteps {

    WebDriver driver = Hooks.getDriver();
    HomePage homePage;

    @Given("the user is on homepage")
    public void openCandyMapperHomepage(){
        driver.get("https://candymapper.com");
        homePage = new HomePage(driver);
    }

    @When("the popup is displayed")
    public void verifyPopupIsDisplayed(){
        assertTrue("Popup is not displayed", homePage.isPopupDisplayed());
    }

    @Then("the user closes the popup")
    public void closeThePopup() {
        homePage.closePopup();
    }

    @Then("the homepage is displayed")
    public void verifyHomePageDisplayed() {
        assertTrue("Main content is not visible", homePage.isMainContentVisible());

    }
}
