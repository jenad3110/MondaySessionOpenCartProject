package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.Checkout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends CommonAPI {


    @Test
    public void Checkout1() {

        Checkout checkout = new Checkout();
        checkout.CheckoutBtn().click();
        String actualResult = checkout.CheckoutText().getText();
        String expectedResult = "Your shopping cart is empty!";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void Checkout2() {

        Checkout checkout = new Checkout();
        checkout.searchField().sendKeys("Imac");
        checkout.searchBtn().click();
        checkout.addToCart().click();
        checkout.shoppingCart().click();
        checkout.checkOut().click();
        String actualResult = checkout.checkoutTxt().getText();
        String expectedResult = "Checkout";
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void Checkout3() {
        Checkout checkout = new Checkout();
        checkout.searchField().sendKeys("Imac");
        checkout.searchBtn().click();
        checkout.addToCart().click();
        checkout.CheckoutBtn().click();
        String actualResult = checkout.checkoutTxt().getText();
        String expectedResult = "Checkout";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void Checkout4() {
        Checkout checkout = new Checkout();
        checkout.searchField().sendKeys("Imac");
        checkout.searchBtn().click();
        checkout.addToCart().click();
        waitFor(1);
        checkout.cartBtn().click();
        checkout.checkoutSideBtn().click();
        String actualResult = checkout.checkoutTxt().getText();
        String expectedResult = "Checkout";
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void checkoutTest5_Er1_2() {
        Checkout checkout = new Checkout();
        checkout.searchField().sendKeys("Imac");
        checkout.searchBtn().click();
        checkout.addToCart().click();
        checkout.shoppingCart().click();
        checkout.checkOut().click();
        checkout.guestBtn().click();
        checkout.continueBtn().click();

        Assert.assertTrue(checkout.billingOption().isSelected());

        checkout.firstName().sendKeys("Salamo");
        checkout.lastName().sendKeys("Amazigh");
        checkout.email().sendKeys("dz@gmail.com");
        checkout.phone().sendKeys("123456");
        checkout.address().sendKeys("Down_Hell");
        checkout.city().sendKeys("Jersey_city");
        checkout.postCode().sendKeys("07304");
        checkout.selectOptionFromCountry("United States");
        checkout.selectOptionFromState("New Jersey");
        checkout.continueBilling().click();
        checkout.deliveryDetails().click();

        Assert.assertTrue(checkout.deliveryAddress().isEnabled());

    }


    @Test
    public void checkoutTest5_Er3_4_5_6() {
        Checkout checkout = new Checkout();
        checkout.searchField().sendKeys("Imac");
        checkout.searchBtn().click();
        checkout.addToCart().click();
        checkout.shoppingCart().click();
        checkout.checkOut().click();
        checkout.guestBtn().click();
        checkout.continueBtn().click();
        checkout.firstName().sendKeys("Salamo");
        checkout.lastName().sendKeys("Amazigh");
        checkout.email().sendKeys("dz@gmail.com");
        checkout.phone().sendKeys("123456");
        checkout.address().sendKeys("Down_Hell");
        checkout.city().sendKeys("Jersey_city");
        checkout.postCode().sendKeys("07304");
        checkout.selectOptionFromCountry("United States");
        checkout.selectOptionFromState("New Jersey");
        checkout.continueBilling().click();

        Assert.assertTrue(checkout.flatShipping().isSelected());


        checkout.deliveryMethod().click();
        Assert.assertTrue(checkout.paymentMethod().isSelected());


        checkout.terms().click();
        checkout.continuePayment().click();
        Assert.assertTrue(checkout.itemDetails().isDisplayed());


        checkout.confirmOrder().click();
        String actualResult = checkout.confirmation().getText();
        String expectedResult = "Your order has been successfully processed!";
        Assert.assertEquals(actualResult, expectedResult);


    }
}