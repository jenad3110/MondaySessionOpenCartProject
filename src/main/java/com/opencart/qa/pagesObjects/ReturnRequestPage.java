package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReturnRequestPage extends CommonAPI {

    By MyAccount = By.xpath("//span[text()='My Account']");

    By MyClickReturn = By.linkText("Returns");

    By MyLogin = By.linkText("Login");

    By MyEmailId = By.id("input-email");

    By MyPassword = By.id("input-password");

    By loginButton = By.xpath("//input[@value='Login']");

    By MyRegister = By.linkText("Register");

    By Continue = By.linkText("Continue");
    By ProductReturn = By.linkText("Product Returns");
    By ViewYourReturnRequest = By.linkText("View your return requests");
    By MyAccountValidation = By.linkText("My Account");
    By Desktop = By.linkText("Desktops");
    By Mac1 = By.linkText("Mac (1)");
    By Pc0 = By.linkText("PC (0)");
    By PCValidation = By.linkText("PC");
    By AddToCartMac = By.xpath("//span[text()='Add to Cart']");
    By ValidationForAddingMac = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public WebElement ValidationForAddingMac() {
        return driver.findElement(ValidationForAddingMac);
    }

    public WebElement AddToCartMac() {
        return driver.findElement(AddToCartMac);
    }
    public WebElement PCValidation() {
        return driver.findElement(PCValidation);
    }

    public WebElement Pc0() {
        return driver.findElement(Pc0);
    }
    public WebElement Mac1() {
        return driver.findElement(Mac1);
    }
    public WebElement Desktop() {
        return driver.findElement(Desktop);
    }

    public WebElement MyAccountValidation() {
        return driver.findElement(MyAccountValidation);
    }
    public WebElement ViewYourReturnRequest() {
        return driver.findElement(ViewYourReturnRequest);
    }
    public WebElement ProductReturnValidation() {
        return driver.findElement(ProductReturn);
    }

    public WebElement ContinueButton() {
        return driver.findElement(Continue);
    }
    public WebElement Register() {
        return driver.findElement(MyRegister);
    }
    public WebElement LoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement Password() {
        return driver.findElement(MyPassword);
    }
    public WebElement EmailId() {
        return driver.findElement(MyEmailId);
    }
    public WebElement LoginField() {
        return driver.findElement(MyLogin);
    }
    public WebElement AccountField() {
        return driver.findElement(MyAccount);
    }
    public WebElement ClickReturn() {
        return driver.findElement(MyClickReturn);
    }







}
