import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2WikipediaTest {
    @Test
    public void wikipediaTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "https://en.wikipedia.org";
        driver.get(URL);
        driver.findElement(By.xpath("//*[@id='mp-itn']/ul/li[1]/a[1]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Dimension dimension = new Dimension(200, 500);
        driver.manage().window().setSize(dimension);
        Point point = new Point(300, 250);
        driver.manage().window().setPosition(point);
        driver.manage().window().maximize();
        driver.quit();
    }
}
