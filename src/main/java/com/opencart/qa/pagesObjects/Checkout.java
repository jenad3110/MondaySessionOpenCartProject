package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Checkout extends CommonAPI {


    By checkoutButton = By.linkText("Checkout");
    By checkoutText = By.xpath("//*[@id='content']/p");


    By searchField = By.xpath("//*[@id='search']/input");
    By searchBtn = By.xpath("//*[@id='search']/span/button");
    By addToCart = By.xpath("//*[@id='content']/div[3]/div/div/div[2]/div[2]/button[1]/span");
    By shoppingCart = By.xpath("//*[@id='top-links']/ul/li[4]/a");
    By checkOutBtn = By.xpath("//*[@id='content']/div[3]/div[2]/a");
    By checkoutTxt = By.xpath("//*[@id='content']/h1");

    By cartBtn = By.xpath("//*[@id='cart']/button");
    By checkoutSideBtn = By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[2]/strong");

    By guestBtn = By.xpath("//input[@value='guest']");
    By continueBtn = By.xpath("//input[@id='button-account']");
    By billingOption = By.xpath("//input[@name='shipping_address']");
    By continueBilling = By.xpath("//input[@id='button-guest']");
    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By email = By.id("input-payment-email");
    By phone = By.id("input-payment-telephone");
    By address = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postCode = By.id("input-payment-postcode");

    By country = By.id("input-payment-country");
    By state = By.id("input-payment-zone");

    By deliveryAddress = By.xpath("//*[@id='input-shipping-address-1']");
    By deliveryDetails = By.xpath("//*[@id='accordion']/div[3]/div[1]/h4/a");
    By flatShipping = By.name("shipping_method");
    By deliveryMethod = By.id("button-shipping-method");
    By paymentMethod = By.name("payment_method");

    By terms = By.name("agree");
    By continuePayment = By.id("button-payment-method");
    By itemDetails = By.linkText("iMac");
    By confirmOrder = By.id("button-confirm");
    By confirmation = By.xpath("//*[@id='content']/p[1]");

    //----------------------------------------------------------------------------------//


    public WebElement CheckoutBtn() {
        return driver.findElement(checkoutButton);
    }

    public WebElement CheckoutText() {
        return driver.findElement(checkoutText);

    }


    public WebElement searchField() {
        return driver.findElement(searchField);
    }

    public WebElement searchBtn() {
        return driver.findElement(searchBtn);
    }

    public WebElement addToCart() {
        return driver.findElement(addToCart);
    }

    public WebElement shoppingCart() {
        return driver.findElement(shoppingCart);
    }

    public WebElement checkOut() {
        return driver.findElement(checkOutBtn);
    }

    public WebElement checkoutTxt() {
        return driver.findElement(checkoutTxt);

    }

    public WebElement cartBtn() {
        return driver.findElement(cartBtn);
    }

    public WebElement checkoutSideBtn() {
        return driver.findElement(checkoutSideBtn);
    }

    public WebElement guestBtn() {
        return driver.findElement(guestBtn);
    }

    public WebElement continueBtn() {
        return driver.findElement(continueBtn);
    }

    public WebElement billingOption() {
        return driver.findElement(billingOption);
    }

    public WebElement continueBilling() {
        return driver.findElement(continueBilling);
    }

    public WebElement firstName() {
        return driver.findElement(firstName);
    }

    public WebElement lastName() {
        return driver.findElement(lastName);
    }

    public WebElement email() {
        return driver.findElement(email);
    }

    public WebElement phone() {
        return driver.findElement(phone);
    }

    public WebElement address() {
        return driver.findElement(address);
    }

    public WebElement city() {
        return driver.findElement(city);
    }

    public WebElement postCode() {
        return driver.findElement(postCode);


    }

    public WebElement countryDropDown() {
        return driver.findElement(country);
    }

    public WebElement stateDropDown() {
        return driver.findElement(state);
    }


    public void selectOptionFromCountry(String option) {
        dropDown(countryDropDown(), option);

    }

    public void selectOptionFromState(String option) {
        dropDown(stateDropDown(), option);

    }

    public WebElement deliveryAddress() {
        return driver.findElement(deliveryAddress);
    }

    public WebElement deliveryDetails() {
        return driver.findElement(deliveryDetails);
    }

    public WebElement flatShipping() {
        return driver.findElement(flatShipping);
    }

    public WebElement deliveryMethod() {
        return driver.findElement(deliveryMethod);
    }

    public WebElement paymentMethod() {
        return driver.findElement(paymentMethod);
    }

    public WebElement terms() {
        return driver.findElement(terms);
    }

    public WebElement continuePayment() {
        return driver.findElement(continuePayment);
    }

    public WebElement itemDetails() {
        return driver.findElement(itemDetails);
    }

    public WebElement confirmOrder() {
        return driver.findElement(confirmOrder);
    }

    public WebElement confirmation() {
        return driver.findElement(confirmation);
    }

}