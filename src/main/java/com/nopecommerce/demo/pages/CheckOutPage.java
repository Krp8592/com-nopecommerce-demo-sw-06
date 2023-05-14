package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
            WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
            WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
            WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
            WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
            WebElement shippingContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
            WebElement paymentContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
            WebElement paymentInfoContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
            WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
            WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
            WebElement creditCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
            WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
            WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
            WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
            WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
            WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
            WebElement paymentTypeMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
            WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
         WebElement totalPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, value);
        log.info("Enter first name : " + firstName.toString());
    }

    /**
     * enter Lastname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
        log.info("Enter last name : " + lastName.toString());
    }

    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email, value);
        log.info("Enter email : " + email.toString());
    }

    /**
     * select Country
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(country, value);
        log.info("Enter country : " + country.toString());
    }

    /**
     * enter City
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(city, value);
        log.info("Enter city : " + city.toString());
    }

    /**
     * enter Address1
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(address1, value);
        log.info("Enter address1 : " + address1.toString());
    }

    /**
     * enter ZipCode
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterZipCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(zipCode, value);
        log.info("Enter zipCode : " + zipCode.toString());
    }

    /**
     * enter Phone Number
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(phoneNumber, value);
        log.info("Enter phoneNumber : " + phoneNumber.toString());
    }

    /**
     * click On Continue
     *
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
        log.info("Click on continueButton : " + continueButton.toString());
    }

    /**
     * select Next DayAir
     *
     * @throws InterruptedException
     */
    public void selectNextDayAir() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(nextDayAir);
        log.info("Click on nextDayAir : " + nextDayAir.toString());
    }

    /**
     * click On Shipping Continue
     *
     * @throws InterruptedException
     */
    public void clickOnShippingContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(shippingContinueButton);
        log.info("Click on shippingContinueButton : " + shippingContinueButton.toString());
    }

    /**
     * click On CreditCard
     *
     * @throws InterruptedException
     */
    public void clickOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(creditCard);
        log.info("Click on creditCard : " + creditCard.toString());

    }

    /**
     * click On Payment Continue
     *
     * @throws InterruptedException
     */
    public void clickOnPaymentContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(paymentContinueButton);
        log.info("Click on paymentContinueButton : " + paymentContinueButton.toString());
    }

    /**
     * select CreditCard Type
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCreditCardType(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(creditCardType, value);
        log.info("Click on selectByVisibleTextFromDropDown : " + creditCardType.toString());

    }

    /**
     * enter Card Holder Name
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardHolderName(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardHolderName, value);
        log.info("Enter cardHolderName : " + cardHolderName.toString());

    }

    /**
     * enter CardNumber
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardNumber, value);
        log.info("Enter cardNumber : " + cardNumber.toString());

    }

    /**
     * select Expiration Date
     *
     * @param month
     * @param year
     * @throws InterruptedException
     */
    public void selectExpirationDate(String month, String year) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectMonth, month);
        log.info("Select Month : " + selectMonth.toString());
        selectByVisibleTextFromDropDown(selectYear, year);
        log.info("Select Year : " + selectYear.toString());
    }

    /**
     * enter CardCode
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardCode, value);
        log.info("Enter card code : " + cardCode.toString());
    }

    /**
     * get Payment Type Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getPaymentTypeText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get payment type text : " + paymentTypeMessage.toString());
        return getTextFromElement(paymentTypeMessage);
    }

    /**
     * get Shipping Method Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getShippingMethodText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Shipping method text : " + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }

    /**
     * get Total PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Total price text : " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    /**
     * click On Confirm
     *
     * @throws InterruptedException
     */
    public void clickOnConfirm() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(confirmButton);
        log.info("Click on confirm button : " + confirmButton.toString());
    }

    /**
     * click On Payment Info Continue
     *
     * @throws InterruptedException
     */
    public void clickOnPaymentInfoContinue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on continue button : " + paymentInfoContinueButton.toString());
        clickOnElement(paymentInfoContinueButton);
    }
}
