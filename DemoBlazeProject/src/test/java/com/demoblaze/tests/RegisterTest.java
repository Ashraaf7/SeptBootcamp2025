package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    String username = "automation_" + System.currentTimeMillis(); //Dynamic test data to ensure uniqueness
    String password = "12345678";

    @Test
    public void verifySuccessfulRegistration() {
        new HomePage(driver).clickOnRegisterButton();
        new RegisterPage(driver).register(username, password); //Static test data
        new RegisterPage(driver).verifyRegisteration("Sign up successful.");
    }

    @Test
    public void verifyUnSuccessfulRegistrationUsingEmptyUsername() {
        new HomePage(driver).clickOnRegisterButton();
        new RegisterPage(driver).register("", password); //Static test data
        new RegisterPage(driver).verifyRegistrationUsingEmptyFields();
    }

    @Test
    public void verifyUnSuccessfulRegistrationUsingEmptyPassword() {
        new HomePage(driver).clickOnRegisterButton();
        new RegisterPage(driver).register(username, ""); //Static test data
        new RegisterPage(driver).verifyRegistrationUsingEmptyFields();
    }

    @Test
    public void verifyUnSuccessfulRegistrationUsingRegisteredAccount() {
        new HomePage(driver).clickOnRegisterButton();
        new RegisterPage(driver).register("test740740", "ashraf123"); //Static test data
        new RegisterPage(driver).verifyRegistrationUsingExistedCred();
    }
}
