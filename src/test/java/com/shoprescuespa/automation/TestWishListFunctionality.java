package com.shoprescuespa.automation;

import com.shoprescuespa.automation.pageobjects.HomePage;
import com.shoprescuespa.automation.pageobjects.SigninPage;
import com.shoprescuespa.automation.pageobjects.WishlistPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWishListFunctionality {

    //call home page page object class
    //click on login button
    //Create another page class for Login - LoginPage.java

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Pooja\\software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://shoprescuespa.com/");
    }

    @Test
    public void check_CurrentUser_WishlistStatus() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();
        SigninPage signinPage = new SigninPage(driver);
        signinPage.clickSignInLink();
        signinPage.login("poojadixit1908@gmail.com", "POOJA19081988");
        signinPage.clickWishlistLink();
        //
        WishlistPage wishlistPage = new WishlistPage(driver);
        //String wishListMessage = wishlistPage.getWishListMessage();
        //what is this? expected is what value you are expecting, actual means what actual value is coming from the webpage
        //Assert.assertEquals("wrong wishlist items shown", "You have no items in your wishlist.", wishListMessage);

        String wishListItemsCount = wishlistPage.getCartItemsCount();
       Assert.assertEquals("wishlist items found do not match" , "2" ,wishListItemsCount);


    }
}