package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbctractPage {
    private static WebDriver driver;

    public AbctractPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    protected WebDriver getDriver(){
        return this.driver;
    }

}
