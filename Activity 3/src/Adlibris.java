
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Adlibris {
        public static void main(String[] args)  throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jocke\\Downloads\\chromedriver_win32");
            WebDriver driver = new ChromeDriver();
            {
                driver.get("https://Adlibris.Com/se/");
                Thread.sleep(3000);
                WebElement element = driver.findElement(By.name("q"));
                element.sendKeys("Praktisk mjukvarutestning");
                driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath("//*[@id=\"search-hits\"]/div/div/div[2]/div/div/div[2]/div[1]/a/span[1]/div/span/span")).click();
                driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/header/button[2]/span")).click();
                driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/header/div[4]/div/a")).click();

            }
        }
    }

