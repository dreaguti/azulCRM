package com.azulcrm.pages;


import com.azulcrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement submitButton;

    @FindBy(id = "user-name")
    public WebElement usernameHeaderAtLogin;

    public void login(String userNameStr, String passwordStr) {
        usernameInput.sendKeys(userNameStr);
        passwordInput.sendKeys(passwordStr);
        submitButton.click();
        // verification that we logged in
        Assert.assertEquals(usernameHeaderAtLogin.getText(), userNameStr);
    }

}
