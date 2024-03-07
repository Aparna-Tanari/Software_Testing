import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SigninAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/users/sign_in"); //WEBSITE LINK
        //Mazimize current window
        driver.manage().window().maximize();
        driver.findElement(By.id("user_email_login")).sendKeys("2100030031@kluniversity.in"); //CREDENTIALS
        driver.findElement(By.id("user_password")).sendKeys("Raju@1974");
        driver.findElement(By.name("commit")).click();//SIGNIN
        Thread.sleep(11000);
        driver.get("https://www.browserstack.com/users/sign_out");//SIGNOUT
        Thread.sleep(7000);
        driver.quit(); //CLOSES BROWSER
    }
}

