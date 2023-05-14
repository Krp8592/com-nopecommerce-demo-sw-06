package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
            WebElement guestCheckout;


    /**
     * get Welcome Text
     * @return
     */
    public String getWelcomeText(){
        log.info("Het welcome text : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout(){
        log.info("Click on guest checkout : " + guestCheckout.toString());
        clickOnElement(guestCheckout);
    }
}
