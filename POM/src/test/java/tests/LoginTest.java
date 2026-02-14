package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        //Initialize WebDriver and navigate to the login page
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }


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


    @AfterMethod
    public void tearDown() {
        //Close the browser and clean up resources
        driver.quit();
    }
}
