import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1FacebookLogin {

    @Test
    public void facebookLoginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "http://facebook.com";
        driver.get(URL);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yanina.hladchenko@gmail.com");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("yanina69");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
        WebElement profileIcon = driver.findElement(By.xpath("//div[@data-click='profile_icon']"));
        Assert.assertTrue(profileIcon.isDisplayed(),"User is not logged in.");
        Assert.assertEquals(driver.getTitle(),"Facebook", "Page title is wrong");
        driver.quit();
    }
}
