package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class EbeyTest extends WebSettings {
    @Test
    public void Test1TrueSing() {
        SingUpPage singUpPage = PageFactory.initElements(driver,SingUpPage.class);
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);

        basePage.open();
        singUpPage.sing();
        driver.findElement(By.id("userid")).sendKeys("pravdyk1@gmail.com");
        singUpPage.coutinuleButtom();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("sgnBt")));
    }
    @Test
    public void  Test2FalseSing(){
        SingUpPage singUpPage = PageFactory.initElements(driver,SingUpPage.class);
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);

        basePage.open();
        singUpPage.sing();
        driver.findElement(By.id("userid")).sendKeys("12154535315");
        singUpPage.coutinuleButtom();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signin-error-msg")));

    }
    @Test
    public void  Test3(){
        BuySmart buySmart =PageFactory.initElements(driver,BuySmart.class);
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);

        basePage.open();
        buySmart.buySmartphone();
        driver.findElement(By.xpath("//a[@href=\"https://www.ebay.com/atc/binctr?item=174673681209&rev=11&fromPage=2047675&fb=1&gch=1\"]")).click();

    }
    @Test
    public void  Test4(){
        BuySmart buySmart =PageFactory.initElements(driver,BuySmart.class);
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);

        basePage.open();
        buySmart.buySmartphone();
    }
    @Test
    public void  Test5(){
        BuySmart buySmart =PageFactory.initElements(driver,BuySmart.class);
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);

        basePage.open();
        buySmart.buySmartphone();
        buySmart.buySmartphoneCard();

    }
    @Test
    public void  Test6registration(){
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);
        Registration registration =PageFactory.initElements(driver,Registration.class);

        basePage.open();
        registration.register();
        registration.name();
        registration.email();
        registration.password();

    }
    @Test
    public void  Test7registrationFalse(){
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);
        Registration registration =PageFactory.initElements(driver,Registration.class);

        basePage.open();
        registration.register();
        registration.email();
        driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();

    }
    @Test
    public void  Test8Search(){
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);
        basePage.open();

        driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]")).sendKeys("Phone",Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Cell Phone & Smartphone Parts']")));

    }
    @Test
    public void  Test9Search(){
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);
        basePage.open();
        driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]")).sendKeys("",Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1")));

    }
    @Test
    public void  Test10Help(){
        BasePage basePage =PageFactory.initElements(driver,BasePage.class);
        basePage.open();
        driver.findElement(By.xpath("//a[@href=\"https://ocsnext.ebay.com/ocs/home\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[@class=\"topics_title\"]")));


    }
}
