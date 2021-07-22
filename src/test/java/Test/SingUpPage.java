package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SingUpPage {
    WebDriver driver;
    WebDriverWait wait;
    public SingUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void  sing(){
        driver.findElement(By.xpath("//a[@href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"id-first\"]")));
    }
    public void coutinuleButtom(){
        driver.findElement(By.id("signin-continue-btn")).click();
    }

}
