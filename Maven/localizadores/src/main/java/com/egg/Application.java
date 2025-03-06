package com.egg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amcas\\Music\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.wikipedia.org");

            driver.manage().window().maximize();

            Thread.sleep(2000);

            // Actividad 2
            driver.navigate().to("https://www.github.com/");
            Thread.sleep(3000);
            WebElement hacerClick = driver.findElement(By.name("user_email"));
            hacerClick.click();
            Thread.sleep(3000);
            WebElement escribir = driver.findElement(By.name("user_email"));
            escribir.sendKeys("alejandromatias@gmail.com");

            //Actividad 3
            Thread.sleep(3000);
            WebElement tocarBoton = driver.findElement(By.partialLinkText("Sign up"));
            tocarBoton.click();
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println("Error");
        }

        // Actividad 1
        // WebElement hacerClick = driver.findElement(By.id("searchInput"));
        // hacerClick.click();
        // WebElement escribir = driver.findElement(By.id("searchInput"));
        // escribir.sendKeys("Globant");

        // driver.quit();
    }
}
