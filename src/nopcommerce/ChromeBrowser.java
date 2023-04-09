package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {


    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URl into Browser
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        // we give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of page \t\t :" + title);

        //current page
        System.out.println("current page \t\t :" + driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page source \t\t:" + driver.getPageSource());

        //Find the email field element
        WebElement emailFiled = driver.findElement(By.id("Email"));

        //Type the email address to email field element
        emailFiled.sendKeys("Kruti111@gmail.com");

        //Find the password field element and Type the password
        driver.findElement(By.name("Password")).sendKeys("Kanan.123");

        //Close the Browser
        driver.close();

    }
}
