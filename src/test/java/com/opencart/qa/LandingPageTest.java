package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.GiftCertificatesPage;
import com.opencart.qa.pagesObjects.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends CommonAPI {

    @Test(enabled = true)
    public void testGiftCertificatesPage(){
        LandingPage landingPage = new LandingPage();
        GiftCertificatesPage giftCertificatesPage = new GiftCertificatesPage(driver);

        landingPage.clickGiftCertificatesLink();
        String actualText= giftCertificatesPage.giftCertificatesText.getText();
        String expectedText = "Purchase a Gift Certificate";
        Assert.assertEquals(actualText, expectedText);
    }
}
