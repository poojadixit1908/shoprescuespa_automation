package com.shoprescuespa.automation;

import com.shoprescuespa.automation.pageobjects.ShoppingBagPage;
import com.shoprescuespa.automation.pageobjects.SigninPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestShoppingCart {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://shoprescuespa.com/");
    }

    @Test
    public void check_empty_shopping_cart_message() throws InterruptedException {
        SigninPage signinPage = new SigninPage(driver);
        signinPage.clickSignInLink();
        signinPage.login("poojadixit1908@gmail.com","POOJA19081988");

        ShoppingBagPage shoppingBagPage = new ShoppingBagPage(driver);
        shoppingBagPage.clickShoppingBag();
        String cartMessage = shoppingBagPage.getShoppingCartMessage();
        Assert.assertEquals("shopping cart message do not match", "You have no items in your shopping cart.", cartMessage);


    }
}

