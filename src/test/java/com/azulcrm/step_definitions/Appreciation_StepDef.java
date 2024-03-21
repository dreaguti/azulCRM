package com.azulcrm.step_definitions;

import com.azulcrm.pages.AppreciationTestPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Appreciation_StepDef{


    AppreciationTestPage appreciationTestPage = new AppreciationTestPage();


    @When("user navigate to more module")
    public void user_navigate_to_more_module() {

        appreciationTestPage.login("hr1@cydeo.com","UserUser");
        appreciationTestPage.more.click();

    }
    @And("user select Appreciation from the  more button")
    public void user_select_appreciation_from_the_more_button() {
        appreciationTestPage.appreciation.click();

    }
    @And("user click on the All employees to remove the Default")
    public void userClickOnTheAllEmployeesToRemoveTheDefault() {
        appreciationTestPage.undefault.click();
    }

    @And("user writ something in the email body")
    public void userWritSomethingInTheEmailBody() {
        BrowserUtils.sleep(1);
        BrowserUtils.switchToFrame(appreciationTestPage.iframe);
        appreciationTestPage.messageBox.sendKeys("dfdfgg");
    }



    @And("user click the send button")
    public void userClickTheSendButton() {
        appreciationTestPage.sendButton.click();
    }

    @Then("user sees the Please specify at least one person. message")
    public void userSeesThePleaseSpecifyAtLeastOnePersonMessage() {
    }

    @And("user add at least one more email receiver")
    public void userAddAtLeastOneMoreEmailReceiver() {
    }

    @Then("user sees the The message title is not specified")
    public void userSeesTheTheMessageTitleIsNotSpecified() {
        
    }

    @Then("user sees All employees is displayed in default")
    public void userSeesAllEmployeesIsDisplayedInDefault() {
        
    }

    @And("user add any email receiver")
    public void userAddAnyEmailReceiver() {
        
    }

    @Then("user can cancel email before click on sending button")
    public void userCanCancelEmailBeforeClickOnSendingButton() {
    }


}
