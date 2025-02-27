package com.egg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    public static void main(String[] args) {
          // Configura la propiedad del sistema para el driver de Chrome
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\amcas\\Music\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com");

    driver.manage().window().maximize();
    
    driver.navigate().to("https://github.com/");

    driver.navigate().back();

    //driver.navigate().to("https://github.com/");

    driver.quit();
    
    }
}
