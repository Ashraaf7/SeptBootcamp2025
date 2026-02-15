package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {


    @Test //Steps
    public void openLoginPage()
    {
        //Anonoumous object
        new HomePage(driver).clickOnLoginButton();
    }



}
