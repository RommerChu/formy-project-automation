import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Project/Selenium/Ex_Files_Selenium_EssT/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("2 Goldgate Cres., Orangeville, Ontario, Canada");
        Thread.sleep(1000);

        WebElement autocompleteResult =  driver.findElement(By.className("pac-container"));
        autocompleteResult.click();




        driver.quit();
    }

}
