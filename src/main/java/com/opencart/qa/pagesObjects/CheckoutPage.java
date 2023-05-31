package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends CommonAPI {

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement checkoutMessage;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
