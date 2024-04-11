package com.azulcrm.pages;


import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {




    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//div[@id='user-block']")
    public WebElement ProfileElm;

    @FindBy (xpath= "//span[.='My Profile']")
    public WebElement MyProfile;

    @FindBy(xpath = "//div[@id='profile-menu-filter']")

    public List<WebElement> listOfModules;



    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    private  WebElement emailVerify;
    public ProfilePage(WebElement emailVerify){
        this.emailVerify = emailVerify;
    }

}