package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractTest {

    static WebDriver webDriver;


@BeforeAll


    static void setDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
      //  options.addArguments("--headless");
        options.addArguments("start-maximized");




  webDriver= new ChromeDriver(options);
    webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @BeforeEach

    void initMainPage(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.lamoda.ru/");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterAll
    static void close() {
    if (webDriver!=null) webDriver.quit();
    }
    public WebDriver getWebDriver(){return this.webDriver;}

    @AfterEach
     public void checkBrowser(){
    List<LogEntry> allLogRow=getWebDriver().manage().logs().get(LogType.BROWSER).getAll();
    if (!allLogRow.isEmpty()){
        if (allLogRow.size()>0) {
            allLogRow.forEach(logEntry ->{
                System.out.println(logEntry.getMessage());
            } );
        }
    }
    }


}
