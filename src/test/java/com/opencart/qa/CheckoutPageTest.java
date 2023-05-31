package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutPageTest extends CommonAPI {

    @Test(enabled = false)
    public void validateCheckoutPage(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        String actualMessage = checkoutPage.checkoutMessage.getText();
        String expectedMessage = "Checkout";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
