package com.shoprescuespa.automation.pageobjects;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;


public class SigninPage {
    private WebDriver driver;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInLink() {
        WebElement signInElement = driver.findElement(By.className("login-link"));
        signInElement.click();
    }

    public void login(String userEmailId, String userpassword) throws InterruptedException {
        WebElement emailElement = driver.findElement(By.id("mini-login"));
        emailElement.sendKeys(userEmailId);
        WebElement passwordElement = driver.findElement(By.id("mini-password"));
        passwordElement.sendKeys(userpassword);
        passwordElement.sendKeys(Keys.ENTER);
       /* WebElement actionDivElement = driver.findElement(By.className("actions"));
        WebElement loginButton = actionDivElement.findElement(By.tagName("button"));
        WebElement span1Element = loginButton.findElement(By.tagName("span"));
        WebElement span2Element = span1Element.findElement(By.tagName("span"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", span2Element);
        loginButton.sendKeys(Keys.RETURN);
        System.out.println("Login button clicked");
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);*/
    }

    public void clickMyAccountLink() {
        WebElement accountlinkElement = driver.findElement(By.className("register-link"));
        accountlinkElement.click();
    }


    public void clickLogoutLink(){
        WebElement logoutElement = driver.findElement(By.className("login-link"));
        logoutElement.click();
    }


    public void  clickWishlistLink(){
        WebElement wishlistElement  = driver.findElement(By.className("wishlist-link"));
        wishlistElement.click();
    }
    public String getWishListMessage(){
        WebElement myWishlistPElement = driver.findElement(By.className("wishlist-empty"));
        String message = myWishlistPElement.getText();
        return message;

    }



}
