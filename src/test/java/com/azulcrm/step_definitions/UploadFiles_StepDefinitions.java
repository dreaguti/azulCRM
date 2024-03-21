package com.azulcrm.step_definitions;

import com.azulcrm.pages.UploadFilesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.sql.DriverAction;

public class UploadFiles_StepDefinitions {

    UploadFilesPage upload = new UploadFilesPage();


    @When("User clicks send message box")
    public void user_clicks_send_message_box() {

       upload.messageBox.click();
    }
    @When("User click Upload files button")
    public void user_click_upload_files_button() {
        upload.upLoadFilesButton.click();
    }
    @When("User click Uploads files and images box")
    public void user_click_uploads_files_and_images_box() {
       upload.UploadFilesAndImagesBox.click();
    }
    @Then("User upload files and images")
    public void user_upload_files_and_images() {
    }

    @Then("User insert files and images into the text")
    public void user_insert_files_and_images_into_the_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User remove files and images before sending")
    public void user_remove_files_and_images_before_sending() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
