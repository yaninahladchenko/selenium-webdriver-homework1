import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task4SwitchingBetweenWindowsTest {
    @Test
    public void switchingBetweenWindowsTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "http://demo.guru99.com/popup.php";
        driver.get(URL);
        driver.findElement(By.xpath("//body/p/a")).click();
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("yanina.hladchenko@gmail.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        driver.quit();
    }
}
