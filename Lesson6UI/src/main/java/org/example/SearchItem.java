package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SearchItem {


    public  static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.lamoda.ru/");



        WebElement search = driver.findElement(By.xpath("//div[@class='d-header-top-menu-wrapper']//input"));
        search.click();
        search.sendKeys("Джинсы женские");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

       WebElement searchButton = driver.findElement(By.xpath("//button[@class='x-button x-button_accented x-button_32 _1nlEyvyy1LHvJnhzmHYHEz']"));
       searchButton.click();





        //driver.quit();


    }


}
