package com.shoprescuespa.automation;

import com.shoprescuespa.automation.pageobjects.MyAccountPage;
import com.shoprescuespa.automation.pageobjects.SigninPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountTesting {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://shoprescuespa.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void verify_current_user_is_loggedin() throws InterruptedException {
        SigninPage signinPage = new SigninPage(driver);
        signinPage.clickSignInLink();
        signinPage.login("poojadixit1908@gmail.com", "POOJA19081988");
        //MyAccountPage myAccountPage = new MyAccountPage(driver);
        //myAccountPage.goToMyAccountDashbaord();
        //String currentLoggedInUserGreetingMessage = myAccountPage.getCurrentLoggedInUserGreetingMessage();
       // Assert.assertEquals("Should show valid greeting message for current logged in user", "Hello, pooja sharma!", currentLoggedInUserGreetingMessage);
    }

//you need to verify the data on this page: https://shoprescuespa.com/customer/account/

}

