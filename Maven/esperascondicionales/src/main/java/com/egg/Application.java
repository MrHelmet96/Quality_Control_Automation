package com.egg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        final String USER_NAME;
        int intento = 1;
        while (intento < 3) {
            try {

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
                element.sendKeys("standard_user");
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                element.sendKeys("secret_sauce");
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
                element.sendKeys(Keys.ENTER);

                element.findElements(By.id("react-burger-menu-btn"));
                if (element.isDisplayed()) {
                    element.sendKeys(Keys.ENTER);

                } else

                {
                    element.findElement(By.id(""));

                }

                driver.quit();
                break;

            } catch (Exception e) {
                System.out.println("No se encontro el elemento " + intento + " Reintentando...");

                intento++;

            }

        }
    }
}
