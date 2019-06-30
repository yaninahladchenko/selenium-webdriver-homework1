import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3AlertTest {
    @Test
    public void alertTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "http://demo.guru99.com/test/delete_customer.php";
        driver.get(URL);
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath("//td/input[@name='submit']")).click();
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
