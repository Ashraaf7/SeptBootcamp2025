package com.demoblaze.pages;

import com.demoblaze.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {
    //Locators
    private final By productName = By.tagName("h2");
    private final By productPrice = By.tagName("h3");
    private final By addToCartButton = By.xpath("//a[contains(@onclick,'addToCart')]");

    //WebDriver and ElementActions
    private WebDriver driver;
    private ElementActions elementActions;

    //Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Actions
    public String getProductName() {
        return elementActions.getText(productName);
    }
    public String getProductPrice() {
        return elementActions.getText(productPrice);
    }
    public void clickOnAddToCartButton() {
        elementActions.click(addToCartButton);
    }
    public void acceptAlert() {
        elementActions.acceptAlert();
    }

    //Assertions
    public void verifyProductName(String expectedName)
    {
        Assert.assertEquals(getProductName(),expectedName);
    }
    public void verifyProductPrice(String expectedPrice)
    {
        Assert.assertEquals(getProductPrice(),expectedPrice);
    }
    public void verifyThatProductIsAddedToCart()
    {
        String alertText = elementActions.getTextFromAlert();
        Assert.assertEquals(alertText, "Product added.");
    }
}
