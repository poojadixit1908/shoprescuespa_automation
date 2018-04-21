package com.shoprescuespa.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingBagPage {

    private WebDriver driver;

    public ShoppingBagPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickShoppingBag() {
        WebElement shoppingBagElement = driver.findElement(By.cssSelector(".icon.fa-shopping-bag"));
        shoppingBagElement.click();

    }

    public String getShoppingCartMessage() {
        WebElement cartEmptyDivElement = driver.findElement(By.className("cart-empty"));
        List<WebElement> pElements = cartEmptyDivElement.findElements(By.tagName("p"));
        WebElement firstPElement = pElements.get(0);
        return firstPElement.getText();
    }

    //public List<Product> getShoppingCartProducts() {
    //List<Product> productList = new ArrayList<Product>();
    //get the product details from web page using driver
    //String productName
    // }
    //public List<P> getShoppingCartProducts(){

    // }
}










