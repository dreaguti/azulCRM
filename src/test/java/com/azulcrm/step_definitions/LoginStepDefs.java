package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("user is logged in as {string} user")
    public void user_is_logged_in_as_user(String userType) {
        //based on input entered by user
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        }else if(userType.equalsIgnoreCase("helpdesk")){
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        }else if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("user is logged in with username as {string} and password as {string}")
    public void user_is_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }


    @Then("user sees the {string} option is selected by defaul.")
    public void userSeesTheAllEmployeesOptionIsSelectedByDefaul() {
    }


}
