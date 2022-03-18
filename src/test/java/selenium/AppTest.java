package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    private WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Iniciando Pruebas...");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("HandBook Devops");
        searchbox.submit();
        assertEquals("HandBook Devops", driver.getTitle());
    }

    @Test
    public void seleniumTest() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(847, 696));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("nestor.fuenzalida@gmail.com");
        driver.findElement(By.cssSelector("#login_form .submit")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("T7Vd3bAYAenDsp8");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
        driver.findElement(By.cssSelector(".ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".continue > span")).click();
        driver.findElement(By.cssSelector(".ajax_block_product:nth-child(4) .button:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".button-medium:nth-child(2) > span")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".bankwire > span")).click();
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
        driver.findElement(By.linkText("Sign out")).click();
    }
}
