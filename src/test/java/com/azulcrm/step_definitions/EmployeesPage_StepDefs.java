package com.azulcrm.step_definitions;

import com.azulcrm.pages.CRM_EmployeesPage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class EmployeesPage_StepDefs {

    CRM_EmployeesPage employeesPage = new CRM_EmployeesPage ();

    @When("user clicks employees pages")
    public void userClicksEmployeesPages() {
        employeesPage.employeeClick.click();
    }

    WebDriverWait webDriverWait = new WebDriverWait (Driver.getDriver (), Duration.ofSeconds (15));
    @Then("user able to see following module")
    public void userAbleToSeeFollowingModule(List<String> expectedEightModules) {

        List<String> actualEightModules = new ArrayList<> ();

        for(WebElement eachTopModel : employeesPage.listOfWebElements){
            actualEightModules.add (eachTopModel.getText ());
        }

        Assert.assertEquals (expectedEightModules, actualEightModules);
    }
    @Then("user sees {string} page title")
    public void userSeesPageTitle(String actualTitle) {
        String expectedTitle = "(1) Company Structure";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
