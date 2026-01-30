import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Locators {


    @Test
    public void loginTest() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://aa-practice-test-automation.vercel.app/index.html");
        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    public void facebookLoginTC() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("ahmed@test.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
        driver.findElement(By.cssSelector("[data-testid='royal-login-button']")).click();
    }

    @Test
    public void openLinkedin() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://aa-practice-test-automation.vercel.app/Pages/about.html");
        driver.findElement(By.partialLinkText("Ashraf")).click();
    }
    @Test
    public void getTextFromFacebook()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       String text= driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
    }
}
