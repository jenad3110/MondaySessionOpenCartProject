package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.GiftCertificatesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCertificatesTest extends CommonAPI {

    @Test(enabled = true)
    public void enterSenderAndRecipientInfo(){
        GiftCertificatesPage giftCertificatesPage = new GiftCertificatesPage(driver);
        giftCertificatesPage.inputRecipientName("Linda");
        giftCertificatesPage.inputRecipientsEmail("lindalinda@gmail.com");
        giftCertificatesPage.inputYourName("Zohra");
        giftCertificatesPage.inputYourEmail("zohral1@gmail.com");
        giftCertificatesPage.selectGeneralRadioButton();
        giftCertificatesPage.selectAgreeCheckBox();
        giftCertificatesPage.clickContinueButton();

        String actualText= giftCertificatesPage.giftCertificatesText.getText();
        String expectedText = "1";
        Assert.assertEquals(actualText, expectedText);
    }

}
