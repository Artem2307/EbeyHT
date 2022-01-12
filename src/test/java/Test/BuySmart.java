package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuySmart {
    WebDriver driver;
    WebDriverWait wait;
    public BuySmart(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public  void buySmartphone(){
        driver.findElement(By.xpath("//h3[text()='Smartphones']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"b-visualnav__heading\"]")));
        driver.findElement(By.xpath("//div[text()='Cell Phones & Smartphones']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[@class=\"b-pageheader b-pageheader--colored\"]")));
        driver.findElement(By.xpath("//img[@alt=\"UNLOCKED Samsung Galaxy Note 9 SM-N960U 128GB BLACK N960U Smartphone Black Color\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@href=\"https://www.ebay.com/atc/binctr?item=174673681209&rev=11&fromPage=2047675&fb=1&gch=1\"]")));
    }
    public void buySmartphoneCard(){
        driver.findElement(By.id("isCartBtn_btn")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class=\"call-to-action btn btn--large btn--primary\"]")));
    }

}
