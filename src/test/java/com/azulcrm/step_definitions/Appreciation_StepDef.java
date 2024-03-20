package com.azulcrm.step_definitions;

import com.azulcrm.pages.AppreciationTestPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Appreciation_StepDef{


    AppreciationTestPage appreciationTestPage = new AppreciationTestPage();


    @When("user navigate to {string} module")
    public void userNavigateToModule(String more) {

        appreciationTestPage.login("helpdesk1@cydeo.com","UserUser");
        appreciationTestPage.more.click();


        }
    @And("user select {string} from the  more button")
    public void userSelectFromTheMoreButton(String module) {
        appreciationTestPage.appreciation.click();

    }
    @And("user click on the All employees to remove the Default")
    public void userClickOnTheAllEmployeesToRemoveTheDefault() {
        appreciationTestPage.defaultAllEmployees.click();
    }


    @And("user write {string} in the email body")
    public void userWriteInTheEmailBody(String arg0) {
        BrowserUtils.sleep(1);
        BrowserUtils.switchToFrame(appreciationTestPage.iframe);
        appreciationTestPage.messageBox.sendKeys(arg0);
    }


    @And("user click the {string}")
    public void userClickThe(String arg0) {
        Driver.getDriver().switchTo().defaultContent();
        BrowserUtils.waitFor(3);
        appreciationTestPage.sendButton.click();
    }

    @Then("user sees the {string} message")
    public void userSeesTheMessage(String arg0) {
        String actualMessage=appreciationTestPage.specifyMessage.getText();
        String expectedMessage=arg0;
        Assert.assertEquals(expectedMessage, actualMessage);
        BrowserUtils.verifyElementDisplayed(appreciationTestPage.specifyMessage);
    }


    @And("user add at least one more email receiver")
    public void userAddAtLeastOneMoreEmailReceiver() {


    }

    @Then("user see the {string} message")
    public void userSeeTheMessage(String specyMessage) {
        String actualMessage=appreciationTestPage.specifyMessage1.getText();
        String ExpectedMessage=specyMessage;
        Assert.assertEquals(ExpectedMessage, actualMessage);
        BrowserUtils.verifyElementDisplayed(appreciationTestPage.specifyMessage1);
    }


    @Then("user sees {string} is displayed in default")
    public void userSeesIsDisplayedInDefault(String defaultAllEmployees) {
       BrowserUtils.verifyElementDisplayed(appreciationTestPage.defaultAllEmployees);
    }


    @And("user writes {string} in the email body")
    public void userWritesInTheEmailBody(String arg0) {
        BrowserUtils.switchToFrame(appreciationTestPage.iframe);
        appreciationTestPage.messageBox.sendKeys(arg0);
    }

    @And("user add email {string} receiver")
    public void userAddEmailReceiver(String arg0) {
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();
        appreciationTestPage.addMore.click();
        appreciationTestPage.emailUser.sendKeys(arg0+Keys.ENTER);
    }
    @Then("user can cancel email before click on sending button")
    public void userCanCancelEmailBeforeClickOnSendingButton() {

        appreciationTestPage.cancelBtn.click();

    }

}
