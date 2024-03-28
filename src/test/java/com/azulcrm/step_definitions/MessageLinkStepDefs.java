package com.azulcrm.step_definitions;

import com.azulcrm.pages.MessagePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessageLinkStepDefs {

    MessagePage messagePage = new MessagePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
    String currentWindow = Driver.getDriver().getWindowHandle();

    @Then("user clicks on message header")
    public void user_clicks_on_message_header() {
        messagePage.messageHeader.click();
    }

    @When("user clicks on link icon")
    public void user_clicks_on_link_icon() {
        messagePage.linkIcon.click();
    }

    @Then("user enters {string} in text input box")
    public void user_enters_in_text_input_box(String text) {
        messagePage.textInput.sendKeys(text);
    }

    @Then("user enters {string} in link input box")
    public void user_enters(String linkText) {
        messagePage.linkURLInput.sendKeys(linkText);
    }

    @And("user clicks save button")
    public void user_clicks_save_button() {
        messagePage.saveButton.click();
    }

    @Then("user clicks send button")
    public void user_clicks_send_button(){
        messagePage.sendButton.click();
    }

    @Then("user should see link on Activity Stream page")
    public void user_should_see_link_on_activity_stream_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='pagetitle']")));
        String actualText = messagePage.firstBlogPost.getText();
        Assert.assertEquals("google", actualText);

    }

    @When("user clicks on the link")
    public void user_clicks_on_the_link(){
        messagePage.firstLink.click();
    }

    @Then ("user should be directed to correct {string}")
    public void user_should_be_directed_to_correct(String url){
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
        }
        wait.withTimeout(Duration.ofSeconds(2));
        BrowserUtils.verifyURLContains("google");
    }

    @And("user should see link opened in a new tab")
    public void user_should_see_link_opened_in_a_new_tab(){
        Assert.assertNotEquals(Driver.getDriver().getWindowHandle(), currentWindow);
    }


}
