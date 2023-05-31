package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GiftCertificatesPage extends CommonAPI {


    @FindBy(xpath = "//h1[contains(text(), 'Purchase a Gift Certificate')]")
    public WebElement giftCertificatesText;

    @FindBy(xpath = "//input[@id='input-to-name']")
    public WebElement recipientsNameInputField;

    @FindBy(xpath = "//input[@id='input-to-email']")
    public WebElement recipientsEmailInputField;

    @FindBy(xpath = "//input[@id='input-from-name']")
    public WebElement yourNameInputField;

    @FindBy(xpath = "input-from-email")
    public WebElement yourEmailInputField;

    @FindBy(xpath = "//form[@class='form-horizontal']/child::div[5]/child::div[1]/child::div[3]")
    public WebElement generalRadioButton;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement agreeCheckBox;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement continueButton;

    public GiftCertificatesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void inputRecipientName(String name){
        type(recipientsNameInputField, name);
    }
    public void inputRecipientsEmail(String email){
        type(recipientsEmailInputField, email);
    }
    public void inputYourName(String yourName){
        type(yourNameInputField, yourName);
    }
    public void inputYourEmail(String yourEmail){
        type(yourEmailInputField, yourEmail);
    }
    public void selectGeneralRadioButton(){
        click(generalRadioButton);
    }
    public void selectAgreeCheckBox(){
        click(agreeCheckBox);
    }
    public PurchaseAGiftCertificatePage clickContinueButton(){
        click(continueButton);
        return new PurchaseAGiftCertificatePage(driver);
    }







}
