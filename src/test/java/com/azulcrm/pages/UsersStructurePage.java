package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersStructurePage {

   public UsersStructurePage(){

       PageFactory.initElements (Driver.getDriver (),this);
   }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeClick;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageTitle;

    @FindBy(xpath = "//div[@id='pagetitle-menu']")
    public WebElement addDepartment;

    @FindBy(xpath = "//div[@id='bx_visual_structure']")
    public List<WebElement> helpdeskMarketing;

}
