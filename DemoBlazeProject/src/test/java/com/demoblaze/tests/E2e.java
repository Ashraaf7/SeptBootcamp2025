package com.demoblaze.tests;

import com.demoblaze.pages.*;
import org.testng.annotations.Test;

public class E2e extends BaseTest{
    String username = "automation_" + System.currentTimeMillis(); //Dynamic test data to ensure uniqueness
    String password = "12345678";
    String productName = "HTC One M9";
    String productPrice = "700";
    @Test
    public void verifyEndToEndFlow() {
        //Regiseration steps
        new HomePage(driver).clickOnRegisterButton();
        new RegisterPage(driver).register(username, password); //Static test data
        new RegisterPage(driver).verifyRegisteration("Sign up successful.");
        new RegisterPage(driver).acceptAlert();
        //Login steps
        new HomePage(driver).clickOnLoginButton();
        new LoginPage(driver).login(username, password);
        new LoginPage(driver).verifySuccessfulLogin(username);
        //Add to cart steps
        new HomePage(driver).clickOnProduct(productName);
        new ProductPage(driver).clickOnAddToCartButton();
        new ProductPage(driver).verifyThatProductIsAddedToCart();
        new ProductPage(driver).acceptAlert();
        //Go to cart and verify product details
        new HomePage(driver).clickOnCartButton();
        new CartPage(driver).verifyProductDetails(productName, productPrice);
        //Place order steps
        new CartPage(driver).clickOnPlaceOrderButton();
        new PlaceOrderPage(driver).submitPlaceOrderForm("Ashraf", "Egypt", "Cairo", "4111111111111111", "12", "2026");
        new PlaceOrderPage(driver).verifyOrderConfirmationMessage();
    }
}
