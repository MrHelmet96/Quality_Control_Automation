package com.egg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    public static void main(String[] args) {
        
    // Configura la propiedad del sistema para el driver de Chrome
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\amcas\\Music\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com");

    driver.manage().window().maximize();
    
    driver.navigate().to("https://openai.com/");
    
    driver.manage().window().minimize();

    driver.manage().window().setSize(new Dimension(800, 600));

    driver.manage().window().setPosition(new Point(800, 400));
    
    driver.navigate().to("https://github.com/");

    driver.close();

    }
}
