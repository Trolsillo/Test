package com.test.selenium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest {

    private static WebDriver driver;

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
        driver = new ChromeDriver();
    }

    /**
     * Este test es de el titulo.
     */
    @Test
    public void titleWebsiteTest() throws InterruptedException {

        driver.get("https://www.choucairtesting.com/servicio/");
        driver.findElement(By.className("fa fa-angle-up")).click();
        Thread.sleep(6000);
    }
}