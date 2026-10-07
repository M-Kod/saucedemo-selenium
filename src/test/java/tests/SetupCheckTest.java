package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetupCheckTest {

    @Test
    public void successfulLogin() {


        ChromeOptions options = new ChromeOptions();
        if (System.getenv("CI") != null) {
            options.addArguments("--headless=new", "--window-size=1920,1080");
        }
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement inputUsername = driver.findElement(By.id("user-name"));
        inputUsername.sendKeys("standard_user");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("secret_sauce");

         WebElement buttonLogin = driver.findElement(By.id("login-button"));
        buttonLogin.click();

        WebElement element = driver.findElement(By.cssSelector("[data-test='title']"));

        Assert.assertEquals(element.getText(), "Products");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        driver.quit();

    }
}




