package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

        search.sendKeys("Свитер женский ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickAccept= driver.findElement(By.xpath("//button[@class='x-button x-button_badgeForegroundColor x-button_32 x-button_intrinsic-width']"));
        clickAccept.click();

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='x-button x-button_accented x-button_32 _1nlEyvyy1LHvJnhzmHYHEz']"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement title= driver.findElement(By.xpath("//div[@class='sub-popup-feb18__close']"));
        title.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element= driver.findElement(By.xpath("//a[@href=\"/p/mp002xw0aoqy/clothes-sela-sviter/\"]"));
        element.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clickElementButton= driver.findElement(By.xpath("//div[@class='icon icon__backward-thin icon_direction-up icon_40 DbimcGhzTHVulqmddD9bP']"));
        clickElementButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElementButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElementButton.click();


        //driver.quit();








    }
}
