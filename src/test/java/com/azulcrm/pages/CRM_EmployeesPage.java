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
    public WebElement employeeClick;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> listOfWebElements;





    /*
    @FindBy(xpath = "(//a[@href='/company/vis_structure.php'])[4]")
    public List<WebElement> comStructureMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_342409671']//span[text()='Find Employee']")
    public WebElement FindEmployeeMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_2000783151']//span[text()='Telephone Directory']")
    public WebElement TeleDirectoryMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1210526945']//span[text()='Staff Changes']")
    public WebElement StaffChangesMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_3998073650']//span[text()='Efficiency Report']")
    public WebElement EfficiencyReportMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1597013884']//span[text()='Honored Employees']")
    public WebElement HonoredEmployeesMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1125184122']//span[text()='Birthdays']")
    public WebElement BirthdaysMenu;

    @FindBy(xpath = "//div[@id='top_menu_id_company_27577212']//span[text()='New page']")
    public WebElement NewPageMenu;


     */
}
