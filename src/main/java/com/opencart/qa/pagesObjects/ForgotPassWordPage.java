package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassWordPage extends CommonAPI {

//    public static WebDriver driver;

    public ForgotPassWordPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/a/span")
    WebElement MyAccount;
    @FindBy(linkText = "Login")
    WebElement Login;


    public void ClickOnMyAccount() {
        MyAccount.click();
    }

    public void ClickOnLogin() {
        Login.click();


    }

}


