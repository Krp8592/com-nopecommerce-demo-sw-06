package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOfficeSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeNotificationBar;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;

    public String getBuildYourOwnComputerText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get build your own computer text : " + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    /**
     * select Processor
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectProcessor(String name) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectProcessor, name);
        log.info("Select Processor : " + selectProcessor.toString());
    }

    /**
     * select Ram
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectRam(String name) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectRam, name);
        log.info("Select Ram : " + selectRam.toString());
    }

    /**
     * select HDD
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectHDD(String value) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
        log.info("Select Hdd : ");
    }

    /**
     * select Os
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
        log.info("Select Os : ");
    }

    /**
     * select Microsoft Office SoftwareOption
     *
     * @throws InterruptedException
     */
    public void selectMicrosoftOfficeSoftwareOption() {
        selectCheckBox((WebElement) microsoftOfficeSoftwareOption);
        log.info("Select microsoft office software option : " + microsoftOfficeSoftwareOption.toString());
    }

    /**
     * select Total Commander Software Option
     *
     * @throws InterruptedException
     */
    public void selectTotalCommanderSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        selectCheckBox((WebElement) totalCommanderSoftwareOption);
        log.info("Selcet Total commander option: " + totalCommanderSoftwareOption.toString());
    }

    /**
     * get Total Price Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get total price : " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    /**
     * click On Add to Cart
     *
     * @throws InterruptedException
     */
    public void clickOnAddtoCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCart);
        log.info("Click on Add to cart : " + addToCart.toString());
    }

    /**
     * get Successfully Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get success message : " + successfullyText.toString());
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     *
     * @throws InterruptedException
     */
    public void closeNotificationBar() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(closeNotificationBar);
        log.info("Close the notification bar : " + closeNotificationBar.toString());
    }

    /**
     * mouse Hover To ShoppingCart And ClickOnCart
     *
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCartAndClickOnCart() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(shopingCart);
        mouseHoverToElementAndClick(goToCart);
        log.info("Mouse hover to element : " + shopingCart.toString());
        log.info("Mouse hover to element and click : " + goToCart.toString());
    }

}
