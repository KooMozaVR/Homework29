// Test locked_out_user login message

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.*;


public class Test_2 {
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
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElements(By.cssSelector("*[data-test=\"error\"]"));
    }
}

