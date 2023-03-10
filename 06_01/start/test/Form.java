import com.gargoylesoftware.htmlunit.javascript.host.svg.AwtMatrixTransformer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Project/Selenium/Ex_Files_Selenium_EssT/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);
        waitForAlertBanner(driver);
        getAlertBanner(driver);
        assertEquals("The form was successfully submitted!", getAlertBanner(driver));

        driver.quit();
    }

    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Rommer");
        driver.findElement(By.id("last-name")).sendKeys("Chu");
        driver.findElement(By.id("job-title")).sendKeys("UI/UX Designer");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("01/01/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertBanner(WebDriver driver){

        return driver.findElement(By.className("alert")).getText();

        //String alertText = alert.getText();
        //if (alertText == "The form was successfully submitted!")
        //;
    }
}
