package com.demoblaze.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;

public class LoginTest extends  BaseTest {



    @Test
    public void validLoginTest() {
        new HomePage(driver).clickOnLoginButton();
        new LoginPage(driver).login("test740740", "ashraf123");
        new LoginPage(driver).verifySuccessfulLogin("test740740");
    }

    @Test
    public void inValidLoginTestUsingEmptyUsername() {
        new HomePage(driver).clickOnLoginButton();
        new LoginPage(driver).login("", "ashraf123");
        new LoginPage(driver).verifyUnSuccessfulLogin();
    }

    @Test
    public void inValidLoginTestUsingEmptyPassword() {
        new HomePage(driver).clickOnLoginButton();
        new LoginPage(driver).login("test740740", "");
        new LoginPage(driver).verifyUnSuccessfulLogin();
    }


}
