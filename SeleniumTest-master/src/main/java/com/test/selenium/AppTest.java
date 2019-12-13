package com.test.selenium;



import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static WebDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
        driver = new ChromeDriver();
    }

    /**
     * 
     * @throws InterruptedException
     */
    @Test
    public void webSiteTest() throws InterruptedException {

        System.out.println("Inicia Test de boton subir");
        driver.get("https://www.choucairtesting.com/servicio/");
        driver.findElement(By.id("menu-item-1876")).click();
        Thread.sleep(5000);
        System.out.println("Termina Test de boton subir");
    }

    /**
     * Test de redireccion de botón de 'Ver más'.
     */
    @Test
    public void buttonVerMasTest() {

        driver.get("https://www.choucairtesting.com/servicio/");
        WebElement element = driver.findElement(By.xpath("//a[@role = 'button']"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

        Assert.assertEquals("Formacion - Choucair Testing", driver.getTitle());
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
