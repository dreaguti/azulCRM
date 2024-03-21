package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesPage {


   public UploadFilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   @FindBy(xpath = "//input[@id='bxed_idPostFormLHE_blogPostForm']")
    public WebElement messageBox;

   @FindBy(id = "bx-b-uploadfile-blogPostForm")
   public WebElement upLoadFilesButton;

   public String docxPath = "C:\\Users\\dilme\\OneDrive\\Documentos\\Sellenium File and Picture verification\\Challenges1.docx";

   public String txtPath = "C:\\Users\\dilme\\OneDrive\\Documentos\\Sellenium File and Picture verification\\Day 11 Class Notes.txt";

   public String pdfPath = "C:\\Users\\dilme\\OneDrive\\Documentos\\Sellenium File and Picture verification\\HTML_Day_1_Vocabulary (1).pdf";

   public String jpegPath = "C:\\Users\\dilme\\OneDrive\\Documentos\\Sellenium File and Picture verification\\Screenshot 2023-12-19 120906.jpeg";

   public String pngPath = "C:\\Users\\dilme\\OneDrive\\Documentos\\Sellenium File and Picture verification\\TEST_PLAN_TEST_STRATEGY.png";

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//table/tbody[@class='diskuf-placeholder-tbody']")
    public WebElement cancelFileOrImageButton;



}
