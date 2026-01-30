import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Waits {


    @Test
    public void implicitWaitExample() {
        // Code for implicit wait example
      /*  EdgeOptions chromeOptions = new EdgeOptions();
        Duration duration = Duration.of(5, ChronoUnit.SECONDS);
        chromeOptions.setScriptTimeout(duration);
        */
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(5));
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();
        String text = driver.findElement(By.cssSelector("#finish > h4")).getText();
        System.out.println("text:" + text);
    }

    @Test
    public void explicitWaitExample() {
        // Code for explicit wait example
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Wait <WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(100));

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();

        String text =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4"))).getText();

        System.out.println("text:" + text);
    }

    @Test
    public void fluentWaitExample() {
        // Code for fluent wait example
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        Wait <WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(10))
                .ignoring(NoSuchElementException.class)
                .withTimeout(Duration.ofSeconds(10))
                .withMessage("Element not found within the specified time");

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();

        String text =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4"))).getText();

        System.out.println("text:" + text);
    }
}
