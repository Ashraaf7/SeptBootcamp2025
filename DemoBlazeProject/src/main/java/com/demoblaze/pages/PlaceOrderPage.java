package com.demoblaze.pages;

import com.demoblaze.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PlaceOrderPage {
    //Locators for place order page
    private final By name = By.id("name");
    private final By country = By.id("country");
    private final By city = By.id("city");
    private final By creditCard = By.id("card");
    private final By month = By.id("month");
    private final By year = By.id("year");
    private final By purchaseButton = By.xpath("//button[text()='Purchase']");

    private final By orderConfirmationMessage = By.cssSelector("[data-has-done-function=\"true\"] > h2");

    //WebDriver instance
    private WebDriver driver;

    //ElementActions for place order page
    ElementActions elementActions;


    //Constructor to initialize WebDriver and ElementActions
    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Actions

    public void submitPlaceOrderForm(String name, String country, String city, String creditCard, String month, String year) {
        elementActions.type(this.name, name);
        elementActions.type(this.country, country);
        elementActions.type(this.city, city);
        elementActions.type(this.creditCard, creditCard);
        elementActions.type(this.month, month);
        elementActions.type(this.year, year);
        elementActions.click(purchaseButton);
    }


    //Assertions
    public void verifyOrderConfirmationMessage( ) {
        Assert.assertEquals(elementActions.getText(orderConfirmationMessage), "Thank you for your purchase!");
    }

}
