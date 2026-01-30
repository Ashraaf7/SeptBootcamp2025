import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RealAnnontations {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Code to set up WebDriver before each test method
         driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Test
    public void explicitWaitExample() {
        // Code for explicit wait example

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();

        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4"))).getText();

        System.out.println("text:" + text);
    }

    @Test
    public void fluentWaitExample() {
        // Code for fluent wait example
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(10))
                .ignoring(NoSuchElementException.class)
                .withTimeout(Duration.ofSeconds(10))
                .withMessage("Element not found within the specified time");

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();

        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4"))).getText();

        System.out.println("text:" + text);
    }
    @AfterMethod
    public void tearDown() {
        // Code to clean up after each test method
            driver.quit();
    }


}
