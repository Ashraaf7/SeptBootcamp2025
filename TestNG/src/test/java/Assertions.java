import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Assertions {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters(value = "browser")
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("edge"))
            driver = new EdgeDriver();
        else
            driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void hardValidLogin() {
        waitForElementBeClickable(By.id("login2")).click();
        waitForElementBeVisible(By.id("loginusername")).sendKeys("test740740");
        waitForElementBeVisible(By.id("loginpassword")).sendKeys("ashraf123");
        waitForElementBeClickable(By.cssSelector("[onclick=\"logIn()\"]")).click();
        String actualText = waitForElementBeVisible(By.id("nameofuser")).getText(); //selenium
        Assert.assertEquals(actualText, "Welcome test74074");
        Assert.assertEquals(waitForElementBeVisible(By.id("logout2")).getText(), "Log");
    }

    @Test
    public void softValidLogin() {
        waitForElementBeClickable(By.id("login2")).click();
        waitForElementBeVisible(By.id("loginusername")).sendKeys("test740740");
        waitForElementBeVisible(By.id("loginpassword")).sendKeys("ashraf123");
        waitForElementBeClickable(By.cssSelector("[onclick=\"logIn()\"]")).click();
        String actualText = waitForElementBeVisible(By.id("nameofuser")).getText(); //selenium
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText, "Welcome test74074");
        softAssert.assertEquals(waitForElementBeVisible(By.id("logout2")).getText(), "Log out");
        softAssert.assertAll();
    }

    @Test(groups = {"regression","sanity"})
    public void validLogin() {
        waitForElementBeClickable(By.id("login2")).click();
        waitForElementBeVisible(By.id("loginusername")).sendKeys("test740740");
        waitForElementBeVisible(By.id("loginpassword")).sendKeys("ashraf123");
        waitForElementBeClickable(By.cssSelector("[onclick=\"logIn()\"]")).click();
        boolean displayed = waitForElementBeVisible(By.id("nameofuser")).isDisplayed(); //true
        Assert.assertTrue(displayed);
    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        driver.quit();
    }


    public WebElement waitForElementBeClickable(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // element to be visible
    public WebElement waitForElementBeVisible(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
