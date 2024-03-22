package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePageShekiba extends LoginPage{

    public MessagePageShekiba(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "")
    public WebElement text;



    @FindBy(xpath ="//span[@id='feed-add-post-form-tab-message']")
    public WebElement messege;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement send;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errormessage;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;


    @FindBy(id = "blog_post_outer_418")
    public WebElement sentBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement defaultAption;


    @FindBy(xpath= "//span[@class='feed-add-post-destination-text']")
    public WebElement allemployeeBtn;


    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelBtn;
}


