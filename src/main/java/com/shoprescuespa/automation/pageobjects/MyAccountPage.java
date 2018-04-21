package com.shoprescuespa.automation.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyAccountPage {
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToMyAccountDashbaord() {
        driver.get("https://shoprescuespa.com/customer/account/");
    }

    public String getCurrentLoggedInUserGreetingMessage() {
        WebElement pElement = driver.findElement(By.className("hello"));
        WebElement strongElement = pElement.findElement(By.tagName("strong"));
        String greetingMessage = strongElement.getText();
        return greetingMessage;
    }
}