package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.LandingPage;
import com.opencart.qa.pagesObjects.RegisterAccount;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAccountTest extends CommonAPI {


    @Test
    public void registerANewAccount() {


        LandingPage landingPage = new LandingPage();

        landingPage.myAccountField().click();
        landingPage.registerButton().click();


        RegisterAccount registerAccount = new RegisterAccount();

        registerAccount.firstNameField().sendKeys("dfgsdfg");
        registerAccount.lastNameField().sendKeys("sdfgsdfgs");
        registerAccount.emailField().sendKeys("dafsdfasds@gmail.com");
        registerAccount.telephoneField().sendKeys("8564488885");
        registerAccount.passwordField().sendKeys("123456");
        registerAccount.confirmPasswordField().sendKeys("123456");
        registerAccount.agreeButton().click();
        registerAccount.continueButton().click();
        String actualText = registerAccount.getActualText().getText();
        String expectedResult = "Your Account Has Been Created!";

        Assert.assertEquals(actualText, expectedResult);


    }


}
