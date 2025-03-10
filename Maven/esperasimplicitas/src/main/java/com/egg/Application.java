package com.egg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Application {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amcas\\Music\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Maximizar la ventana del navegador
        driver.manage().window().maximize();

        /*try {
            // Abrir la página de Google
            driver.get("https://www.google.com.ar");
            // Configurar tiempo de espera implícito
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            // Navegar a LinkedIn
            driver.navigate().to("https://ar.linkedin.com/");
            // Intentar encontrar el botón "Iniciar Sesión"
            WebElement signInButton = driver.findElement(By.cssSelector("a[data-tracking-control-name=guest_homepage-basic_nav-header-signin"));

            signInButton.click();
            // Configurar tiempo de espera implícito NUEVO
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            // Navegar a GitHub
            driver.navigate().to("https://github.com/");
            WebElement emailInput = driver.findElement(By.id("user_email"));
            emailInput.sendKeys("mailPrueba");
            // Navegar a Wikipedia
            driver.navigate().to("https://es.wikipedia.org");
            WebElement buscarInfo = driver.findElement(By.cssSelector("input.cdx-text-input__input"));
            buscarInfo.sendKeys("programar", Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el navegador
            driver.quit();

        }*/

        //Esperas explícitas
        try {
WebDriverWait wait = new WebDriverWait(driver,

Duration.ofSeconds(15));

// Abrir la página de Google y esperar a que aparezca el cuadro de búsqueda

driver.get("https://www.google.com.ar");
WebElement searchBox =

wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
searchBox.sendKeys("Selenium WebDriver", Keys.ENTER);
// Navegar a GitHub y esperar a que el botón "Login" sea clickeable
driver.navigate().to("https://github.com/");
WebElement loginButton =

wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));

loginButton.click();
// Navegar a Amazon y esperar a que se cargue el menú de idiomas
driver.navigate().to("https://www.amazon.com/");
WebElement categoryMenu =

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#icp-nav-flyout")));

categoryMenu.click();

} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
} finally {
// Cerrar el navegador
// driver.quit();
}
    }
}
