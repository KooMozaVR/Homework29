// Test Product Description

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.*;


public class Main {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void logintest() {
        driver.get("https://www.saucedemo.com/"); // перейти на сайт
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
        assertEquals("Sauce Labs Backpack",driver.findElement(By.cssSelector("#item_4_title_link > .inventory_item_name")).getText());
        assertEquals("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_desc")).getText());
        driver.findElement(By.cssSelector("#item_4_title_link > .inventory_item_name")).click();
        assertEquals("Sauce Labs Backpack",driver.findElement(By.cssSelector(".inventory_details_name")).getText());
        assertEquals("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",driver.findElement(By.cssSelector(".inventory_details_desc")).getText());



    }
}

