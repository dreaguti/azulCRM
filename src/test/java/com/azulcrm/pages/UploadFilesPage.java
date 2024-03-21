package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesPage {


   public UploadFilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
