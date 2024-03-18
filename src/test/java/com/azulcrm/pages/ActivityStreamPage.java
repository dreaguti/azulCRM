package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "pagetitle")
    public WebElement ActivityStreamHeader;

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-message']//span[text()='Message']")
    public WebElement messageHeader;

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[.='Task']")
    public WebElement taskHeader;

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-calendar']//span[.='Event']")
    public WebElement eventHeader;

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-vote']//span[.='Poll']")
    public WebElement pollHeader;

    @FindBy (id = "feed-add-post-form-link-text")
    public WebElement moreHeader;

    @FindBy (xpath = "//div[@class='menu-popup-items']//span[1]//span[2]")
    public WebElement fileOption;

    @FindBy (xpath = "//div[@class='menu-popup-items']//span[2]//span[2]")
    public WebElement appreciationOption;

    @FindBy (xpath = "//div[@class='menu-popup-items']//span[3]//span[2]")
    public WebElement announcementOption;

    @FindBy (xpath = "//div[@class='menu-popup-items']//span[4]//span[2]")
    public WebElement workflowOption;
}
