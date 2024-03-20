package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CRM_EmployeesPage {

    public CRM_EmployeesPage(){

        PageFactory.initElements (Driver.getDriver (), this);

    }
    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement clickEmployeesModule;
    public List<WebElement> allEmployeeModules;


}
