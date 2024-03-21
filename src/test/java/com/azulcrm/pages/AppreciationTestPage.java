package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationTestPage extends LoginPage {


    public AppreciationTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciation;


    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement more;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement defaultAllEmployees;

    @FindBy(xpath = "//a[@class='feed-add-destination-link']")
    public WebElement addMore;
    @FindBy(id = "feed-add-post-destination-input")
    public WebElement emailUser;


    @FindBy(xpath = "(//form[@enctype='multipart/form-data'])[1]")
    public WebElement Iframe;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement specifyMessage;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelBtn;


    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement specifyMessage1;
}