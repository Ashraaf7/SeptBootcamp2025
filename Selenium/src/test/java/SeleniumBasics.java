import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics {


    @Test
    public void openUrl() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String linkedinTab = driver.getWindowHandle();
        System.out.println(linkedinTab);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("instagram.com");
        String instaTab = driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getPageSource());
        driver.switchTo().window(instaTab);
        // driver.close(); //current Tab only
        driver.quit(); // close the browser
    }

    //navigations
    @Test
    public void navigateMethods()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com");
        driver.navigate().to( "https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }





}
