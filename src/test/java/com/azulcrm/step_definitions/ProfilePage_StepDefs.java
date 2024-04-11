package com.azulcrm.step_definitions;


import com.azulcrm.pages.ProfilePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class ProfilePage_StepDefs {
    ProfilePage profilePage = new ProfilePage();
    WebDriverWait webDriver = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    private List<String> expectedModules;
    private String expectedEmail;


    @When("user clicks on user block")
    public void userClicksOnUserBlock() {
        profilePage.ProfileElm.click();
    }

    @Then("user click on my profile")
    public void userClickOnMyProfile() {
        profilePage.MyProfile.click();
    }

    @Then("user should see the following options:")
    public void userShouldSeeTheFollowingOptions(List<String> expectedModules) {
        BrowserUtils.sleep(5);
        List<String>actualModules = new ArrayList<> ();



        for (WebElement eachModule : profilePage.listOfModules) {

            String[] moduleNames = eachModule.getText().split("(?=[A-Z])");
            actualModules.addAll(Arrays.asList(moduleNames));
        }

        actualModules.replaceAll(String::trim);
        Assert.assertEquals (expectedModules,actualModules);

    }





    @And("verify {string} address under general tab ")
    public void verifyAddressUnderContactInformation(String expectedEmail) {
        //ProfilePage.emailVerify.getText ();
        String actualEmail = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedEmail, actualEmail);
    }

    @And("verify email address under General tab")
    public void verifyEmailAddressUnderGeneralTab(String expectedEmail) {
        String actualEmail = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedEmail, actualEmail);
    }


    @Given("user click on user block")
    public void userClickOnUserBlock() {
        profilePage.ProfileElm.click();
    }

    @Given("user click on the my profile")
    public void userClickOnTheMyProfile() {
        profilePage.MyProfile.click();
    }

    @And("user should verify {string} address under contact information")
    public void userShouldVerifyAddressUnderContactInformation(String expectedEmail) {
        String actualEmail = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedEmail, actualEmail);
    }



}











      
    
