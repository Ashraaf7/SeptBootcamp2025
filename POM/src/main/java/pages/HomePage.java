package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;

public class HomePage {
    //Locators
    private final By loginButton = By.id("login2");
    private WebDriver driver;
    private ElementActions elementActions;


    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }


    //Actions
    public void clickOnLoginButton() {
        elementActions.click(loginButton);
    }


    //Assertions
}
