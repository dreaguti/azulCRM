package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-message']//span[text()='Message']")
    public WebElement messageHeader;

    @FindBy (xpath = "//span[@id='bx-b-link-blogPostForm']//span[1]")
    public WebElement linkIcon;

//    @FindBy (xpath = "//body[@contenteditable='true']")
//    public WebElement messageTextBox;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement textInput;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURLInput;

    @FindBy (xpath = "//div//input[@id='undefined']")
    public WebElement saveButton;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy (xpath = "//div[@id='blg-post-img-501']//a[.='google']")
    public WebElement firstBlogPost;

    @FindBy (xpath = "//*[@href='https://www.google.com']")
    public WebElement firstLink;

//div[@id='blog_post_body_510']//a"
}
