package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DetailDescription {


    public  static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lamoda.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement search = driver.findElement(By.xpath("//div[@class='d-header-top-menu-wrapper']//input"));
        search.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        search.sendKeys("свитер женский теплый");
        search.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




        WebElement element= driver.findElement(By.xpath("//div[@class='x-product-card__link x-product-card__hit-area'][1]"));
        element.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickElementButton= driver.findElement(By.xpath("//div[@class='icon icon__backward-thin icon_direction-up icon_40 DbimcGhzTHVulqmddD9bP']"));
        clickElementButton.click();

        clickElementButton.click();

        clickElementButton.click();
        clickElementButton.click();
        clickElementButton.click();


        //driver.quit();








    }
}
