package com.demoblaze.pages;

import com.demoblaze.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    //Locators
    private final By loginButton = By.id("login2");
    private By registerButton = By.id("signin2");
    private By cartButton = By.id("cartur");
    private WebDriver driver;
    private ElementActions elementActions;

    //Dynamic locator
    private By product(String productName) {
        return By.xpath("//a[.='" + productName + "']");
    }



    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }


    //Actions
    public void clickOnLoginButton() {
        elementActions.click(loginButton);
    }

    public void clickOnRegisterButton() {
        elementActions.click(registerButton);
    }
    public void clickOnCartButton() {
        elementActions.click(cartButton);
    }

    public void clickOnProduct(String productName)
    {
        elementActions.click(product(productName));
    }


    //Assertions
}
