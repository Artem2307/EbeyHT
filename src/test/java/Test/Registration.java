package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Registration {

    WebDriver driver;
    WebDriverWait wait;
    public Registration(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void email(){
        Random random =new Random();
        int n = random.nextInt(100)+1;
        String email="Artem"+n+"@gmail.com";
        System.out.print(email);
        driver.findElement(By.id("Email")).sendKeys(email);
    }
    public void name(){
        driver.findElement(By.id("firstname")).sendKeys("Artem");
        driver.findElement(By.id("lastname")).sendKeys("Safafa");
    }
    public void register(){
        driver.findElement(By.xpath("//a[@href=\"https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[@class=\"field__label field__label--end switch-account-type-reg__label\"]")));
    }
    public void password() {
        driver.findElement(By.id("password")).sendKeys("1234567");
    }

}
