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
        driver.manage().window().setSize(new Dimension(1550, 830));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys("nestor.fuenzalida@gmail.com");
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Nestor");
        driver.findElement(By.id("customer_lastname")).sendKeys("Fuenzalida");
        driver.findElement(By.id("passwd")).sendKeys("T7Vd3bAYAenDsp8");
        {
            WebElement element = driver.findElement(By.id("days"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("days"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("days"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("days")).click();
        {
            WebElement dropdown = driver.findElement(By.id("days"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:17\\s+']")).click();
        }
        driver.findElement(By.cssSelector("#days > option:nth-child(18)")).click();
        {
            WebElement element = driver.findElement(By.id("months"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("months"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("months"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("months")).click();
        {
            WebElement dropdown = driver.findElement(By.id("months"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:December\\s']")).click();
        }
        driver.findElement(By.cssSelector("#months > option:nth-child(13)")).click();
        {
            WebElement element = driver.findElement(By.id("years"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("years"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("years"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("years")).click();
        {
            WebElement dropdown = driver.findElement(By.id("years"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:1982\\s+']")).click();
        }
        driver.findElement(By.cssSelector("#years > option:nth-child(42)")).click();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("pasaje 123");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Santiago");
        {
            WebElement element = driver.findElement(By.id("id_state"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("id_state"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("id_state"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("id_state")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_state"));
            dropdown.findElement(By.xpath("//option[. = 'Wyoming']")).click();
        }
        driver.findElement(By.cssSelector("#id_state > option:nth-child(54)")).click();
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("00000000");
        {
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
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("other")).sendKeys("no mas");
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("998989898");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).click();
        {
            WebElement element = driver.findElement(By.id("postcode"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("postcode")).sendKeys("00000");
        driver.findElement(By.cssSelector(".postcode")).click();
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("T7Vd3bAYAenDsp8");
        driver.findElement(By.cssSelector(".form-group > .row")).click();
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        driver.findElement(By.cssSelector(".page-heading")).click();
        driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
        driver.findElement(By.cssSelector(".sfHover > a")).click();
        driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
        driver.findElement(By.cssSelector(".continue > span")).click();
        driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
        driver.findElement(By.cssSelector(".ajax_block_product:nth-child(3) .button:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".button-medium:nth-child(2) > span")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
        driver.findElement(By.cssSelector("label")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".bankwire > span")).click();
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
    }
}
