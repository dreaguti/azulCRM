package com.azulcrm.step_definitions;

import com.azulcrm.pages.ActivityStreamPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityStreamStepDefs{

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
        Assert.assertTrue(activityStreamPage.ActivityStreamHeader.isDisplayed());
    }
    @Then("user should see {string} is displayed")
    public void user_should_see_is_displayed(String headerText) {
        //switch statement?
        BrowserUtils.verifyElementDisplayed(activityStreamPage.messageHeader);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.taskHeader);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.eventHeader);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.pollHeader);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.moreHeader);
    }

    @When("clicks on More dropdown")
    public void clicks_on_more_dropdown() {
        activityStreamPage.moreHeader.click();
    }

    @Then("user should see {string} option is displayed")
    public void user_should_see_option_is_displayed(String optionText) {
        BrowserUtils.verifyElementDisplayed(activityStreamPage.fileOption);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.appreciationOption);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.announcementOption);
        BrowserUtils.verifyElementDisplayed(activityStreamPage.workflowOption);
    }

}
