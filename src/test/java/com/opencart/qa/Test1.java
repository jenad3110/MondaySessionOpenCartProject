package com.opencart.qa;

import com.opencart.qa.base.ParallelTestingCommonAPI;
import com.opencart.qa.pagesObjects.Checkout;
import com.opencart.qa.pagesObjects.TestPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends ParallelTestingCommonAPI {

    @Test
    public void checkoutTest5_Er3_4_5_6() {
        TestPageObject checkout = new TestPageObject(getDriver());
        checkout.searchField().sendKeys("Imac");
        checkout.searchBtn().click();
        checkout.addToCart().click();
        checkout.shoppingCart().click();
        checkout.checkOut().click();
        waitFor(2);
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
