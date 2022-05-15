package org.example;

import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

public class MainPageTest extends AbstractTest {

    @Test
   public void AddItemTest (){
        setDriver();
        initMainPage();

        ElementsMenu elementsMenu=new ElementsMenu(getWebDriver());
        elementsMenu
                .clickSearch();
        SearchPage searchPage=new SearchPage(getWebDriver());
        searchPage.toSearch("кроссовки женские adidas originals");
        elementsMenu
                .clickItem()
                .clickAddButton()
                .clickChooseSize()
                .clickGoToTheBasket();
        Assertions.assertEquals("https://www.lamoda.ru/checkout/cart/",getWebDriver().getCurrentUrl());
    }

    @Test
    public void DetailDescription(){
        setDriver();
        initMainPage();
        ElementsMenu elementsMenu=new ElementsMenu(getWebDriver());
        elementsMenu
                .clickSearch();
        SearchPage searchPage=new SearchPage(getWebDriver());
        searchPage.toSearch("свитер женский теплый");
        elementsMenu
                .clickItemSweater()
                .clickElementDescription();
        //Assertions.assertEquals("https://www.lamoda.ru/p/mp002xw0a0xt/clothes-finnflare-sviter/",getWebDriver().getCurrentUrl());
    }
    @Test
    public void ChooseLocation(){
        setDriver();
        initMainPage();
        ElementsMenu elementsMenu=new ElementsMenu(getWebDriver());
        elementsMenu
                .clicLocation()
                .clickTown();
        Assertions.assertEquals("https://www.lamoda.ru/",getWebDriver().getCurrentUrl());
    }

    @Test
    public void SearchItem (){
        setDriver();
        initMainPage();
        ElementsMenu elementsMenu=new ElementsMenu(getWebDriver());
        elementsMenu
                .clickSearch();
        SearchPage searchPage=new SearchPage(getWebDriver());
        searchPage.toSearch("Джинсы женские");
       // Assertions.assertEquals("https://www.lamoda.ru/catalogsearch/result/?q=%D0%B4%D0%B6%D0%B8%D0%BD%D1%81%D1%8B%20%D0%B6%D0%B5%D0%BD%D1%81%D0%BA%D0%B8%D0%B5&submit=y&gender_section=women",getWebDriver().getCurrentUrl());


    }

    @Test

    public void SearchOnEnglishKeyboard(){
        setDriver();
        initMainPage();
        ElementsMenu elementsMenu=new ElementsMenu(getWebDriver());
        elementsMenu
                .clickSearch();
        SearchPage searchPage=new SearchPage(getWebDriver());
        searchPage.toSearch("L;bycs ve;crbt");
        //Assertions.assertEquals("https://www.lamoda.ru/catalogsearch/result/?q=neakb%20%3Btycrbt&submit=y&gender_section=women",getWebDriver().getCurrentUrl());

    }

    @Test

    public void SubscriptionTest (){

        setDriver();
        initMainPage();
        ElementsMenu elementsMenu=new ElementsMenu(getWebDriver());
        elementsMenu
                .clickSubscription();
        Assertions.assertEquals("https://www.lamoda.ru/",getWebDriver().getCurrentUrl());

    }




}
