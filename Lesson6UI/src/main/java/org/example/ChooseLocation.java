package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.openqa.selenium.Keys.ENTER;

public class ChooseLocation {

    public  static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lamoda.ru/");

        WebElement location = driver.findElement(By.xpath("//div[@class='v-popover']"));
        location.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


       WebElement town = driver.findElement(By.xpath("//a[@role='button'][2]"));
      town.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);




        //driver.quit();


    }

}
