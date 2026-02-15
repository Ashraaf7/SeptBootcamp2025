package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.ProductPage;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{

    String productName = "Iphone 6 32gb";
    String productPrice = "$790 *includes tax";

    @Test
    public void verifyProductDetails()
    {
        new HomePage(driver).clickOnProduct(productName);
        new ProductPage(driver).verifyProductName(productName);
        new ProductPage(driver).verifyProductPrice(productPrice);
    }

    @Test
    public void verifyAddToCartFunctionality() {
        new HomePage(driver).clickOnProduct(productName);
        new ProductPage(driver).clickOnAddToCartButton();
        new ProductPage(driver).verifyThatProductIsAddedToCart();
    }
}
