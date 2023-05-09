package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAccount extends CommonAPI {




    By firstNameField = By.id("input-firstname");

    By lastNameField = By.id("input-lastname");

    By emailField = By.id("input-email");

    By telephoneField = By.id("input-telephone");

    By passwordField = By.id("input-password");

    By passwordFieldConfirm = By.id("input-confirm");

    By agreeButton = By.name("agree");

    By continueButton = By.xpath("//input[@value='Continue']");

    By actualResult = By.xpath("//div[@id='content']/h1");


    //----------------------------------------------------------------------------------//




    public WebElement firstNameField() {

        return driver.findElement(firstNameField);
    }

    public WebElement lastNameField() {

        return driver.findElement(lastNameField);
    }


    public WebElement emailField() {

        return driver.findElement(emailField);
    }

    public WebElement telephoneField() {

        return driver.findElement(telephoneField);
    }

    public WebElement passwordField() {

        return driver.findElement(passwordField);
    }


    public WebElement confirmPasswordField() {

        return driver.findElement(passwordFieldConfirm);
    }

    public WebElement agreeButton() {

        return driver.findElement(agreeButton);
    }

    public WebElement continueButton() {

        return driver.findElement(continueButton);
    }

    public WebElement getActualText()
    {

        return driver.findElement(actualResult);
    }
}
