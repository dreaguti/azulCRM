package com.azulcrm.pages;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "#user-block")
    public WebElement userProfileDropdown;

    @FindBy(css = "#pagetitle")
    public WebElement pageTitle;


    @FindBy(xpath = "//span[contains(@class,'menu-popup-item-text')]")
    public List<WebElement> userProfileDropdownOptions;


    public void clickProfileOptionWithText(String text){
        BrowserUtils.clickWithText(userProfileDropdownOptions,text);

    }

    public void selectOption(String option){

        String locator=  "(//td[@class='bx-layout-inner-left'])[1]//li//a[contains(.,'"+option+"')]";

        WebElement optionEl = Driver.getDriver().findElement(By.xpath(locator));
        optionEl.click();

    }


}
