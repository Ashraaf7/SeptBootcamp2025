package com.demoblaze.pages;

import com.demoblaze.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {

    //Locators
    private final By usernameField = By.id("sign-username");
    private final By passwordField = By.id("sign-password");
    private final By registerButton = By.cssSelector("[onclick='register()']");

    //WebDriver
    private WebDriver driver;

    //Variables
    ElementActions elementActions;

    //Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Actions
    public void register (String username, String password)
    {
        System.out.println("Registering with username: " + username + " and password: " + password);
        elementActions.type(usernameField,username);
        elementActions.type(passwordField,password);
        elementActions.click(registerButton);
    }
    public void acceptAlert()
    {
        elementActions.acceptAlert();
    }

    //Assertions

    //Approach 1: General method to verify registration with different expected messages
    public void verifyRegisteration(String expectedMessage)
    {
        String alertText = elementActions.getTextFromAlert();
        Assert.assertEquals(alertText, expectedMessage);
    }

    //Approach 2: Specific methods for each registration scenario
    public void verifyRegistrationSuccess()
    {
       String alertText = elementActions.getTextFromAlert();
        Assert.assertEquals(alertText, "Sign up successful.");
    }
    public void verifyRegistrationUsingExistedCred()
    {
       String alertText = elementActions.getTextFromAlert();
        Assert.assertEquals(alertText, "This user already exist.");
    }
    public void verifyRegistrationUsingEmptyFields()
    {
       String alertText = elementActions.getTextFromAlert();
        Assert.assertEquals(alertText, "Please fill out Username and Password.");
    }

}
