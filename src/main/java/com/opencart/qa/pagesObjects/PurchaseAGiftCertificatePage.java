package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseAGiftCertificatePage extends CommonAPI {

    @FindBy(xpath = "//p[contains(text(), 'Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.')]")
    public WebElement purchaseAGiftCertificateMessage;

    @FindBy(xpath = "//a[contains(text(), 'Continue')]")
    public WebElement continueButton;

    public PurchaseAGiftCertificatePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public ShoppingCart clickContinue(){
        click(continueButton);
        return new ShoppingCart();
    }
}
