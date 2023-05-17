package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonAPI {


    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginBtn = By.xpath("//input[@class='btn btn-primary']");


    public WebElement emailField() {

        return driver.findElement(emailField);
    }

    public WebElement passwordField() {

        return driver.findElement(passwordField);
    }

    public WebElement loginBtn() {

        return driver.findElement(loginBtn);
    }


}
