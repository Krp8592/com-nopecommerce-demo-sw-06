package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
            WebElement electronicsTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
            WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
            WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
            WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
            WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
            WebElement successfulText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerTab;


    /**
     * click On Computer Tab
     */
    public void clickOnComputerTab(){
        log.info("Click on computer tab : " + computerTabOnTopMenu.toString());
        clickOnElement(computerTabOnTopMenu);
    }

    /**
     * get Thank You Text
     * @return
     * @throws InterruptedException
     */
    public String getThankYouText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Getting text from : " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    /**
     * get Successful Text
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Getting text from : " + successfulText.toString());
        return getTextFromElement(successfulText);
    }

    /**
     * click On Continue
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
        log.info("Click on continue : " + continueButton.toString());
    }

    /**
     * get Welcome Store Text
     * @return
     * @throws InterruptedException
     */
    public String getWelcomeStoreText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get wel come to store text : " + welcomeStoreText.toString());
        return getTextFromElement(welcomeStoreText);
    }

    /**
     * mouse Hover To Electronic Tab
     */
    public void mouseHoverToElectronicTab() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(electronicsTabOnTopMenu);
        log.info("Mouse hover to electronics tab : " + electronicsTabOnTopMenu.toString());
    }

    /**+
     * mouseHover ToCell Phones AndC lick
     */
    public void mouseHoverToCellPhonesAndClick() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(cellPhone);
        log.info("Mouse hover to Cell phones tab and click  : " + cellPhone.toString());
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab(){
        log.info("Click on register tab  : " + registerTab.toString());
        clickOnElement(registerTab);
    }
}
