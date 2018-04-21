package com.shoprescuespa.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class WishlistPage {
    private WebDriver driver;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWishListMessage(){


        WebElement myWishlistPElement = driver.findElement(By.className("wishlist-empty"));
        String message = myWishlistPElement.getText();
        return message;


    }
    public String getCartItemsCount(){
        WebElement  countOfElement = driver.findElement(By.className("count"));
        String countOfElementText = countOfElement.getText();
        return  countOfElementText;

    }

}
