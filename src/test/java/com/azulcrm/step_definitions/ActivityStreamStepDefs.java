package com.azulcrm.step_definitions;

import com.azulcrm.pages.ActivityStreamPage;
import com.azulcrm.pages.BasePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.CRMUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.azulcrm.utilities.BrowserUtils.getElementsText;
import static com.azulcrm.utilities.BrowserUtils.sleep;

public class ActivityStreamStepDefs extends BasePage {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user clicks {string}")
    public void user_clicks(String option) {
        activityStreamPage.selectOption(option);
        sleep(2);
    }

    @When("user clicks {string} in Activity Stream")
    public void user_clicks_in_activity_stream(String activity) {
        activityStreamPage.selectActivity(activity);
    }


    @Then("user should see the following options on the Activity Stream page")
    public void user_should_see_the_following_options_on_the_activity_stream_page(List<String> expectedOptions) {
        List<String> actualOptions = getElementsText(activityStreamPage.tabOptions);
        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @When("user clicks {string} under more in activity stream")
    public void user_clicks_under_more_in_activity_stream(String activity) {
        activityStreamPage.selectMoreOption(activity);
    }

    @Then("user should see the following options under more tab on the Activity Stream page")
    public void user_should_see_the_following_options_under_more_tab_on_the_activity_stream_page(List<String> expectedMoreOptions) {
        List<String> actualMoreOptions=  CRMUtils.getElementsAttribute("data-name",activityStreamPage.moreOptions);
        Assert.assertEquals(expectedMoreOptions,actualMoreOptions);
    }
}
