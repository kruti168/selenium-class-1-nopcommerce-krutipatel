package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String baseUrl = "https://demo.nopcommerce.com/login";
    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Titile of page \t\t:"+ title);

        //Get current Url
        System.out.println("Current URL \t\t :" +driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page source :" +driver.getPageSource());

        //Find the email field element
        WebElement emailField = driver.findElement(By.name("Email"));

        //Type the email filed element
        emailField.sendKeys("Kruti111@gmail.com");

        //Find the password filed element and Type the password
        driver.findElement(By.name("Password")).sendKeys("kanan@123");

        //driver close
         driver.close();
    }
}
