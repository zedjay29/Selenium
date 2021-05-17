import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jocke\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        {
            driver.get("https://www.actitime.com/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/a")).click();
            driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("John");
            driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Doe");
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("johndoe@email.com");
            driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("BigCorp");


        }
    }
}