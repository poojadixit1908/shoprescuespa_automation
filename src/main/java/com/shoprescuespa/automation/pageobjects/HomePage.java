package com.shoprescuespa.automation.pageobjects;


import org.openqa.selenium.WebDriver;

/**
 * This class represents home page on shoprescue spa website.
 * PageOjbect class for Home Page
 */
public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("http://shoprescuespa.com/");
    }


}
