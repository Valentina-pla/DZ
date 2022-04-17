package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.*;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;

public class LamodaTests {

   /*  private static WebDriver driver;

    @BeforeAll

    static void init() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @BeforeEach

    void getPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lamoda.ru/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @AfterAll
    static void close(){driver.quit();}

   public static WebDriver getDriver() { return driver;}

    @Test

    public void AddItemTest ()  {
        init();
        getPage();
       WebElement search = driver.findElement(By.xpath("//div[@class='d-header-top-menu-wrapper']//input"));
        search.click();
        search.sendKeys("кроссовки женские adidas originals");
        search.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement item  = driver.findElement(By.xpath("//div[@class='x-product-card__link x-product-card__hit-area'][1]"));
        item.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement addButton= driver.findElement(By.xpath("//button[@class='x-button x-button_primaryFilled x-button_48 _13UOn2F1A_KnQ1IvIHusVP']"));
        addButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement chooseSize= driver.findElement(By.xpath("//div[@class='O7KAVeyES2Dm7FutyoPSf ui-product-page-sizes-chooser-item_enabled ui-product-page-sizes-chooser-item']"));
        chooseSize.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement goToTheBasket= driver.findElement(By.xpath("//div[@class='d-modal__bottom']//a"));
        goToTheBasket.click();
        Assertions.assertEquals("https://www.lamoda.ru/checkout/cart/",getDriver().getCurrentUrl());


    }*/

  /*  @Test
    public void DetailDescription (){
        init();
        getPage();
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
        Assertions.assertEquals("https://www.lamoda.ru/p/mp002xw09rjh/clothes-stim-sviter/",getDriver().getCurrentUrl());

    }

    @Test
    public void ChooseLocation(){
        init();
        getPage();
        WebElement location = driver.findElement(By.xpath("//div[@class='v-popover']"));
        location.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement town = driver.findElement(By.xpath("//a[@role='button'][2]"));
        town.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assertions.assertEquals("https://www.lamoda.ru/",getDriver().getCurrentUrl());

    }

    @Test
    public void SearchItem (){
        init();
        getPage();
        WebElement search = driver.findElement(By.xpath("//div[@class='d-header-top-menu-wrapper']//input"));
        search.click();
        search.sendKeys("Джинсы женские");
        search.sendKeys(Keys.ENTER);
        Assertions.assertEquals("https://www.lamoda.ru/catalogsearch/result/?q=%D0%B4%D0%B6%D0%B8%D0%BD%D1%81%D1%8B%20%D0%B6%D0%B5%D0%BD%D1%81%D0%BA%D0%B8%D0%B5&submit=y&gender_section=women",getDriver().getCurrentUrl());


    }



    @Test

    public void SearchOnEnglishKeyboard() throws InterruptedException {

        init();
        getPage();
        WebElement search = driver.findElement(By.xpath("//div[@class='d-header-top-menu-wrapper']//input"));
        search.click();
        search.sendKeys("neakb ;tycrbt");
        search.sendKeys(Keys.ENTER);
        Assertions.assertEquals("https://www.lamoda.ru/catalogsearch/result/?q=neakb%20%3Btycrbt&submit=y&gender_section=women",getDriver().getCurrentUrl());

    }

   @Test

    public void SubscriptionTest () throws InterruptedException {

        init();
        getPage();


        Actions podpiska = new Actions(getDriver());
       podpiska.click(getDriver().findElement(By.xpath("//form[@class='ii-subscription__form ii-subscription__form_mainpage ii-subscription__form_inline']")))
               .pause(1000l)
                .sendKeys(getDriver().findElement(By.xpath("//input[@class='ii-subscription__form-item ii-subscription__form-email text-field text-field_large']")),"fff@inbox.ru")
               .pause(1000l)
               .click(getDriver().findElement(By.xpath("//span[@class='ii-subscription__form-item ii-subscription__form-button button button_blue']")))
               .build()
                .perform();

       Assertions.assertEquals("https://www.lamoda.ru/",getDriver().getCurrentUrl());




    }*/







}
