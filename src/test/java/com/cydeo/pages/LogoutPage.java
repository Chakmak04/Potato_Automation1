package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public void HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[contains(text(),'SalesManager')]")
    public WebElement accNameDropdown;

    @FindBy(linkText = "Log out")
    public WebElement logOutBtn;

    @FindBy(css = "div.o_dialog_warning.modal-body")
    public WebElement sessionExpiredMsg;

}
