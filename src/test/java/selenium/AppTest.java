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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    private WebDriver driver;
    private String randMail;


    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }


    @Before
    public void setUp(){
        System.out.println("Iniciando configuración...");
//        ChromeDriver por defecto
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
//        ChromeDriver V99 para Windows
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win.exe");
        driver = new ChromeDriver();
        randMail = getSaltString()+"@diplousach.com";
//        driver.get("https://www.amazon.com");
//        driver.manage().window().maximize();
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.navigate().to("https://www.google.com");
    }

//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        System.out.println("Iniciando Pruebas...");
//        WebElement searchbox = driver.findElement(By.name("q"));
//        searchbox.sendKeys("HandBook Devops");
//        searchbox.submit();
//        assertEquals("HandBook Devops", driver.getTitle());
//    }

    @Test
    public void registerAndBuy() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(847, 697));
        driver.findElement(By.linkText("Sign in")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email_create")));
        }
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys(randMail);
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender1")));
        }
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Fname");
        driver.findElement(By.id("customer_lastname")).sendKeys("Lname");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("la calle 13");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Santiago");
        driver.findElement(By.id("id_state")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_state")));
            WebElement dropdown = driver.findElement(By.id("id_state"));
            dropdown.findElement(By.xpath("//option[. = 'California']")).click();
        }
        driver.findElement(By.cssSelector("#id_state > option:nth-child(6)")).click();
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("00000");
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_country")));
            WebElement element = driver.findElement(By.id("id_country"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("id_country"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("id_country"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("id_country")).click();
        driver.findElement(By.cssSelector("#id_country > option:nth-child(2)")).click();
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("9123123123");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        driver.findElement(By.linkText("Sign out")).click();
        //driver.close();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(randMail);
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        driver.findElement(By.cssSelector(".logo")).click();
        driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".continue > span")));
        }
        driver.findElement(By.cssSelector(".continue > span")).click();
        driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(5) .button:nth-child(1) > span")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".continue > span")));
        }
        driver.findElement(By.cssSelector(".continue > span")).click();
        driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(7) .button:nth-child(1) > span")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-medium > span")));
        }
        driver.findElement(By.cssSelector(".button-medium > span")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".standard-checkout > span")));
        }
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
        driver.findElement(By.cssSelector(".order_carrier_content")).click();
        driver.findElement(By.id("cgv")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".standard-checkout > span")));
        }
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".bankwire > span")).click();
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
        driver.findElement(By.linkText("Sign out")).click();
        driver.close();
    }
}
