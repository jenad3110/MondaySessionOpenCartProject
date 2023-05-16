package com.opencart.qa.utils;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.base.ParallelTestingCommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo extends CommonAPI {

    WebDriver driver;

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartFind;


    public SauceDemo(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "cart-total")
    WebElement cartButton;

    public void clickOnCartButton(){

        cartButton.click();
    }


    @FindBy (id = "user-name")
    WebElement userNameFIeld;

    @FindBy (id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;



    public void login (String User,String Pass){
        driver.get("https://www.saucedemo.com/");

        userNameFIeld.sendKeys(User);
        passwordField.sendKeys(Pass);
        loginButton.click();
    }





    public void addToCartFindBy(){
        addToCartFind.click();

    }

    public WebElement addToCartBy(){

        return driver.findElement(addToCart);
    }


}
