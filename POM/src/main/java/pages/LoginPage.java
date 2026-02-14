package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementActions;
import utils.WaitsUtils;

public class LoginPage {

    //Locators
    private final By usernameField = By.id("loginusername");
    private final By passwordField = By.id("loginpassword");
    private final By loginButton = By.cssSelector("[onclick='logIn()']");

    private final By welcomeMsg = By.id("nameofuser");
    private ElementActions elementActions;
    //WebDriver
    private WebDriver driver;


    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }


    //Actions
    //Approaches: seperate methods for each action, or one method that performs the entire login process
    public void login(String username, String password) {
        elementActions.type(usernameField, username);
        elementActions.type(passwordField, password);
        elementActions.click(loginButton);
    }

    //Assertions
    public void verifySuccessfulLogin(String expectedUsername) {
        String actualText = elementActions.getText(welcomeMsg);
        Assert.assertEquals(actualText, "Welcome " + expectedUsername);
    }

    public void verifyUnSuccessfulLogin() {
        String actualAlertText = elementActions.getTextFromAlert();
        Assert.assertEquals(actualAlertText, "Please fill out Username and Password.");
    }

}
