package com.nopecommerce.demo.pages;

import com.nopecommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());

    public ElectronicsPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsTabText;
    public String getElectronicsHeaderText(){
        log.info("Get electronics text : " + electronicsTabText.toString());
        return getTextFromElement(electronicsTabText);
    }

    /**
     * This method select menu on top menu
     * @param menu
     */
    public void selectMenu(String menu) {
        log.info("Select menu : ");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }
}
