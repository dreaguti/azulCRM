package com.azulcrm.step_definitions;

import com.azulcrm.pages.MessagePageShekiba;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MessageStepDefs {
    MessagePageShekiba messagePage=new MessagePageShekiba();

    @Given("user is logged in login page")
    public void userIsLoggedInLoginPage(String username,String password) {


    }

    @When("User clicks message option on the page .")
    public void userClicksMessageOptionOnThePage() {
        messagePage.login("hr1@cydeo.com","UserUser");
        messagePage.messege.click();


    }

    @And("user undefault All employees option")
    public void userUndefaultAllEmployeesOption() {

        messagePage.defaultAption.click();

    }

    @Then("user click on the send button")
    public void userClickOnTheSendButton() {
messagePage.send.click();
    }

    @Then("user sees the error message")
    public void userSeesTheErrorMessage() {

        messagePage.errormessage.isDisplayed();
        String expectedText="Please specify at least one person.";
        String actualText=messagePage.errormessage.getText();
        Assert.assertEquals(expectedText,actualText);
    }


    @And("user write something inside the body of the text box")
    public void userWriteSomethingInsideTheBodyOfTheTextBox() {
        BrowserUtils.switchToFrame(messagePage.iframe);
        messagePage.messageBox.sendKeys("Hello");
        Driver.getDriver().switchTo().defaultContent();
    }




    @Then("user can cancel send message at any time before sending it")
    public void userCanCancelSendMessageAtAnyTimeBeforeSendingIt() {
        messagePage.login("hr1@cydeo.com","UserUser");
        messagePage.messege.click();
        BrowserUtils.sleep(2);
        messagePage.cancelBtn.click();
    }

    @Then("user sees the {string}option by default")
    public void userSeesTheOptionByDefault(String allEmployees) {
        messagePage.login("hr1@cydeo.com","UserUser");
        messagePage.messege.click();
        BrowserUtils.sleep(2);
        BrowserUtils.verifyElementDisplayed(messagePage.allemployeeBtn);
    }
}
