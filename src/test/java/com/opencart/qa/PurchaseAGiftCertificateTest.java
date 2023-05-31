package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.PurchaseAGiftCertificatePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseAGiftCertificateTest extends CommonAPI {

    @Test(enabled = false)
    public void validatePurchaseAGiftCertificateMessage(){
        PurchaseAGiftCertificatePage purchaseAGiftCertificatePage = new PurchaseAGiftCertificatePage(driver);

        String actualMessage = "Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.";
        String expectedMessage = purchaseAGiftCertificatePage.purchaseAGiftCertificateMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
