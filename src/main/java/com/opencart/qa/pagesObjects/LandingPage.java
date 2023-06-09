package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends CommonAPI {

    By registerButton = By.linkText("Register");
    By myAccountButton = By.xpath("//div[@id='top-links']/ul/li[2]/a/span");
    By loginButton = By.linkText("Login");

    public WebElement myAccountField() {return driver.findElement(myAccountButton);}
    public WebElement registerButton() {return driver.findElement(registerButton);}
    public WebElement loginButton() {return driver.findElement(loginButton);}

    //Zohra's Region
    @FindBy(xpath = "//a[contains(text(), 'Gift Certificates')]")
    public WebElement giftCertificatesLink;

    public GiftCertificatesPage clickGiftCertificatesLink(){
        click(giftCertificatesLink);
        return new GiftCertificatesPage(driver);
    }
    //End Region


}
