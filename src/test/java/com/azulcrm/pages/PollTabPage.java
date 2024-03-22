package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class PollTabPage extends LoginPage{

    public PollTabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollHeader;

    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployees;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionHeader;


    @FindBy(id = "question_0")
    public WebElement questionBox1;
    @FindBy(id = "question_1")
    public WebElement questionBox2;

    @FindBy(id = "answer_0__0_")
    public WebElement firstAnswer;

    @FindBy(id = "answer_0__1_")
    public WebElement secondAnswer;

    @FindBy(id = "answer_1__0_")
    public WebElement thirdAnswer;

    @FindBy(id = "answer_1__1_")
    public WebElement fourthAnswer;

    @FindBy(id = "multi_0")
    public WebElement firstCheckBox;

    @FindBy(id = "multi_1")
    public WebElement secondCheckBox;


    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessage1;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmployees;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorMessage2;

    @FindBy(xpath = "//span[.='The question \"Question1?\" has no answers.']")
    public WebElement errorMessage3;


    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement errorMessage4;









    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;
    @FindBy(xpath ="//body[@contenteditable='true']")
    public WebElement textMessage;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;














}
