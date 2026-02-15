package com.demoblaze.pages;

import com.demoblaze.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class CartPage {
    //Locators
    private final By productNameInCart = By.xpath("//tr[@class='success'] //td[2]");
    private final By productPriceInCart = By.xpath("//tr[@class='success'] //td[3]");
    private final By placeOrderButton = By.cssSelector("button[data-toggle='modal']");


    //WebDriver and ElementActions
    private WebDriver driver;
    private ElementActions elementActions;

    //Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Actions
    public String getProductNameInCart() {
        return elementActions.getText(productNameInCart);
    }

    public String getProductPriceInCart() {
        return elementActions.getText(productPriceInCart);
    }

    public void clickOnPlaceOrderButton() {
        elementActions.click(placeOrderButton);
    }

    //Assertions
    public void verifyProductDetails(String expectedName, String expectedPrice) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductNameInCart(),expectedName);
        softAssert.assertEquals(getProductPriceInCart(),expectedPrice);
        softAssert.assertAll();
    }
}
