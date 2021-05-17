import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jocke\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        {
            driver.get("http://google.com");
            Thread.sleep(3000);
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("Software Testing");
            element.submit();

        }
    }
    }
