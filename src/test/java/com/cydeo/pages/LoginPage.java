package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPage {

    public WebElement usernameInput;
    public Alert passwordInput;
    public WebElement signInButton;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement loginUser;

    @FindBy(id = "prependedInput2")
    public WebElement loginPass;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String username,String password){
        loginUser.sendKeys(username);
        loginPass.sendKeys(password);
        loginBtn.click();

    }


}
