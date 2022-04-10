package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AddItem {


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

        search.sendKeys("Кроссовки женские adidas");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickAccept= driver.findElement(By.xpath("//button[@class='x-button x-button_badgeForegroundColor x-button_32 x-button_intrinsic-width']"));
        clickAccept.click();

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='x-button x-button_accented x-button_32 _1nlEyvyy1LHvJnhzmHYHEz']"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement title= driver.findElement(By.xpath("//div[@class='sub-popup-feb18__close']"));
        title.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement item  = driver.findElement(By.xpath("//a[@href=\"/p/rtlaav584701/shoes-adidasoriginals-krossovki/\"]"));
       item.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      WebElement addButton= driver.findElement(By.xpath("//button[@class='x-button x-button_primaryFilled x-button_48 _13UOn2F1A_KnQ1IvIHusVP']"));
     addButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement chooseSize= driver.findElement(By.xpath("//div[@class='O7KAVeyES2Dm7FutyoPSf ui-product-page-sizes-chooser-item_enabled ui-product-page-sizes-chooser-item']"));
        chooseSize.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement goToTheBasket= driver.findElement(By.xpath("//div[@class='d-modal__bottom']//a"));
        goToTheBasket.click();



        //driver.quit();


    }

}
