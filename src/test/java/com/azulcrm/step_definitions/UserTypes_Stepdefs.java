package com.azulcrm.step_definitions;

import com.azulcrm.pages.UsersStructurePage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UserTypes_Stepdefs {

    UsersStructurePage usersStructurePage = new UsersStructurePage ();
    @When("user clicks employees page")
    public void userClicksEmployeesPage() {
        usersStructurePage.employeeClick.click ();

        //Assert.assertTrue (Driver.getDriver ( ).getTitle ( ).contains ("pageTitle"));

        //Driver.getDriver ().getTitle ().contains ("pageTitle");
    }

    @Then("hr can add department")
    public void hrCanAddDepartment() {
        usersStructurePage.addDepartment.click ();
    }

    @Then("user can not add department")
    public void userCanNotAddDepartment() {
        usersStructurePage.addDepartment.isDisplayed ();

    }
}
