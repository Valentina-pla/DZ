package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends AbctractPage{

    @FindBy(xpath = "//div[@class='d-header-top-menu-wrapper']//input")
    private WebElement search;



    public SearchPage(WebDriver driver) {super(driver);}

    public void toSearch(String value){
        search.click();
        new WebDriverWait(getDriver(),5).until(ExpectedConditions.elementToBeClickable(search));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }






    //public void takeItem(int n){
     //   searchItems.get(n).click();

    //}
}
