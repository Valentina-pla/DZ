package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class EventListenerTest extends AbstractTest{

    @Test
   public void test(){
        setDriver();
        initMainPage();
        try {
            getWebDriver().findElement(By.id("not  found"));

        } catch ( NoSuchElementException e) {
            MyUtils.MakeScreenShot(getWebDriver(),
                    "failure-org.example.EventListenerTest.test"+System.currentTimeMillis()+".png");
        }
    }
}
