package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }


    @Test //Steps
    public void openLoginPage()
    {
        //Anonoumous object
        new HomePage(driver).clickOnLoginButton();
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }

}
