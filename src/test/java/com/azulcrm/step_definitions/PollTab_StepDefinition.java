package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.pages.PollTabPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PollTab_StepDefinition {

    PollTabPage pollTabPage = new PollTabPage();


    @When("user sees  {string} is displayed under  Active Stream")
    public void user_sees_is_displayed_under_active_stream(String expected) {




       Assert.assertEquals(expected, pollTabPage.pollHeader.getText());



    }
    @When("user click on {string} under  Active Stream")
    public void user_click_on_under_active_stream(String string) {


        pollTabPage.pollHeader.click();

    }
    @Then("user sees {string} is displayed")
    public void user_sees_is_displayed(String expected) {

        pollTabPage.allEmployees.isDisplayed();
    }

    @When("user sees {string} button is displayed")
    public void user_sees_button_is_displayed(String expected) {

      pollTabPage.addQuestionHeader.click();
    }



    @And("user types  {string}in Question box")
    public void userTypesInQuestionBox(String Question) {
        pollTabPage.questionBox1.sendKeys(Question);
    }



    @When("user types {string} in the textBox")
    public void user_types_in_the_text_box(String textMessage) {


        Driver.getDriver().switchTo().frame(pollTabPage.iframe);
        pollTabPage.textMessage.sendKeys(textMessage);
        BrowserUtils.sleep(2);

    }


    @Then("user click on {string} in sendButton")
    public void userClickOnInSendButton(String sendButton) {

       // Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().parentFrame();
        pollTabPage.sendButton.click();
    }

    @And("user click on {string} under Allow multiple choice")
    public void userClickOnUnderAllowMultipleChoice(String arg0) {
        pollTabPage.addQuestionHeader.click();
    }

    @And("user types  {string} in Question{int} box")
    public void userTypesInQuestionBox(String expected, int arg1) {
        pollTabPage.questionBox2.sendKeys(expected);
    }


    @And("user types {string} in first Answer box")
    public void userTypesInFirstAnswerBox(String Answer1) {
        pollTabPage.firstAnswer.sendKeys(Answer1);
    }



    @And("user types {string} in second Answer box")
    public void userTypesInSecondAnswerBox(String Answer2) {
        pollTabPage.secondAnswer.sendKeys(Answer2);
    }

    @And("user types {string} in third Answer box")
    public void userTypesInThirdAnswerBox(String Answer3) {
        pollTabPage.thirdAnswer.sendKeys(Answer3);
    }

    @And("user types {string} in fourth Answer box")
    public void userTypesInFourthAnswerBox(String Answer4) {
        pollTabPage.fourthAnswer.sendKeys(Answer4);
    }


    @And("user click {string} first checkBox")
    public void userClickFirstCheckBox(String checkbox1) {

        pollTabPage.firstCheckBox.click();
    }

    @And("user click {string} second checkBox")
    public void userClickSecondCheckBox(String checkbox2) {
        pollTabPage.secondCheckBox.click();

    }



    @Then("user sees {string} error message{int} is displayed")
    public void userSeesErrorMessageIsDisplayed(String arg0, int arg1) {

    }

    @Then("user sees {string} first error message is displayed")
    public void userSeesFirstErrorMessageIsDisplayed(String expectedError1) {

        Assert.assertEquals(expectedError1, pollTabPage.errorMessage1.getText());
        pollTabPage.errorMessage1.isDisplayed();
    }

    @And("user click on {string} to delete All employees")
    public void userClickOnToDeleteAllEmployees(String deleteAllEmployees) {
        pollTabPage.removeAllEmployees.click();
    }

    @Then("user sees {string} second error message is displayed")
    public void userSeesSecondErrorMessageIsDisplayed(String expectedError2) {

        Assert.assertEquals(expectedError2, pollTabPage.errorMessage2.getText());
        pollTabPage.errorMessage2.isDisplayed();
        System.out.println("pollTabPage.errorMessage2 = " + pollTabPage.errorMessage2.isDisplayed());
    }


    @Then("user sees {string}Question{int}?{string} Third error message is displayed")
    public void userSeesQuestionThirdErrorMessageIsDisplayed(String expectedError3, int arg1, String arg2) {

        Assert.assertEquals(expectedError3, pollTabPage.errorMessage3.getText());
        System.out.println("pollTabPage.errorMessage3.isDisplayed() = " + pollTabPage.errorMessage3.isDisplayed());
    }

    @Then("user sees Third error message is displayed")
    public void userSeesThirdErrorMessageIsDisplayed() {

        String expectedError3 = "The question \"Question1?\" has no answers.";
        Assert.assertEquals(expectedError3, pollTabPage.errorMessage3.getText());
        System.out.println("pollTabPage.errorMessage3.isDisplayed() = " + pollTabPage.errorMessage3.isDisplayed());
    }

    @Then("user sees {string} fourth error message is displayed")
    public void userSeesFourthErrorMessageIsDisplayed(String expectedError4) {

        Assert.assertEquals(expectedError4, pollTabPage.errorMessage4.getText());
        pollTabPage.errorMessage4.isDisplayed();
    }
}
