package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class ChooseLocation {

    public  static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lamoda.ru/");

        WebElement location = driver.findElement(By.cssSelector(".\\_2f5HAC8BA-n1KuEwYHsF-j > span"));
        location.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement town = driver.findElement(By.xpath("//a[@class='wCjUeog4KtWw64IplV1e6 _3dch7Ytt3ivpea7TIsKVjb _29RJmG5djxTAgADcAjSrHW']"));
        town.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement startToBuy= driver.findElement(By.xpath("//button[@class='x-button x-button_primaryFilled x-button_32 x-button_intrinsic-width']"));
        startToBuy.click();



        //driver.quit();


    }

}
