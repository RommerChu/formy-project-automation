import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Project/Selenium/Ex_Files_Selenium_EssT/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Rommer Chu");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

		//quits driver
        driver.quit();
    }
}
