package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

public class ElementsMenu extends AbctractPage{

@FindBy(xpath = "//div[@class='d-header-top-menu-wrapper']//input")
    private WebElement search;
    @FindBy(xpath = "//div[@class='x-product-card__link x-product-card__hit-area'][1]")
    private WebElement item;
    @FindBy(xpath = "//button[@class='x-button x-button_primaryFilled x-button_48 _13UOn2F1A_KnQ1IvIHusVP']")
    private WebElement addButton;
    @FindBy(xpath = "//div[@class='O7KAVeyES2Dm7FutyoPSf ui-product-page-sizes-chooser-item_enabled ui-product-page-sizes-chooser-item']")
    private WebElement chooseSize;
    @FindBy(xpath = "//div[@class='d-modal__bottom']//a")
    private WebElement goToTheBasket;
    @FindBy(xpath = "//div[@class='x-product-card__link x-product-card__hit-area'][1]")
    private WebElement itemSweater;
    @FindBy (xpath = "//div[@class='icon icon__backward-thin icon_direction-up icon_40 DbimcGhzTHVulqmddD9bP']")
    private WebElement clickElementDescription;
    @FindBy (xpath = "//div[@class='v-popover']")
    private WebElement location;
    @FindBy (xpath = "//a[@role='button'][2]")
    private WebElement town;
    @FindBy (xpath = "//div[@class='input input_default input_size_32']")
    private WebElement subscriptionForm;
    @FindBy(xpath = "//button[@class='x-button x-button_primaryFilled x-button_32 x-button_intrinsic-width _2BNK-sScBReFHwoUOUfk1M'][1]")
    private WebElement subscription;





    public ElementsMenu(WebDriver driver) {super(driver);}




    public ElementsMenu clickTown(){
        town.click();
        return this;
    }


    public ElementsMenu clicLocation(){
        location.click();
        return this;
    }

    public ElementsMenu clickElementDescription(){

        clickElementDescription.click();
        return this;
    }

    public ElementsMenu clickSearch(){

        search.click();
        return this;
    }
    public ElementsMenu clickItemSweater(){
        itemSweater.click();
        return this;
    }
    public ElementsMenu clickItem(){
        item.click();
        return this;
    }
    public ElementsMenu clickAddButton(){
        addButton.click();
        return this;
    }
    public ElementsMenu clickChooseSize(){
        chooseSize.click();
        return this;
    }
    public ElementsMenu clickGoToTheBasket(){
        goToTheBasket.click();
        return this;
    }

    public void clickSubscription(){
        Actions actions=new Actions(getDriver());
        actions.moveToElement(subscriptionForm).sendKeys("rjrr@gmail.com").click(subscription).build().perform();

    }






}
