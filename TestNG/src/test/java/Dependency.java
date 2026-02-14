import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dependency {

    WebDriver driver;
    String username = "automationBot_" + System.currentTimeMillis();  //AutomationBot_1687876543213
    String password = "Automation123";

    //Configuration methods
    @BeforeMethod(alwaysRun = true)
    public void setup() {
        // Initialize WebDriver and other setup tasks
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        // Quit WebDriver and other cleanup tasks
        driver.quit();
    }


    //Test methods
    @Test(groups = "regression")
    public void registerTC() {
        waitForElementBeClickable(By.id("signin2")).click();
        waitForElementBeVisible(By.id("sign-username")).sendKeys(username);
        waitForElementBeVisible(By.id("sign-password")).sendKeys(password);
        waitForElementBeClickable(By.cssSelector("[onclick=\"register()\"]")).click();
        String actualAlertText =waitForAlertBePresent().getText();
        Assert.assertEquals(actualAlertText,"Sign up successful.");
    }

    @Test(dependsOnMethods = "registerTC" , groups = "regression")
    public void loginTC() {
        waitForElementBeClickable(By.id("login2")).click();
        waitForElementBeVisible(By.id("loginusername")).sendKeys(username);
        waitForElementBeVisible(By.id("loginpassword")).sendKeys(password);
        waitForElementBeClickable(By.cssSelector("[onclick=\"logIn()\"]")).click();
        String actualText = waitForElementBeVisible(By.id("nameofuser")).getText();
        Assert.assertEquals(actualText,"Welcome " +username );
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

    public Alert waitForAlertBePresent() {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(ExpectedConditions.alertIsPresent());
    }

}
