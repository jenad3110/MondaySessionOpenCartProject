package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.LoginPage;
import com.opencart.qa.pagesObjects.ReturnRequestPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnRequestPageTest extends CommonAPI {

    ReturnRequestPage returnRequestPage;
    LoginPage loginPage;
    @Test
    public void ReturningFromLogin() {

        returnRequestPage = new ReturnRequestPage();
        returnRequestPage.AccountField().click();
        returnRequestPage.LoginField().click();
        returnRequestPage.ClickReturn().click();
        returnRequestPage.EmailId().sendKeys("onihus@gmail.com");
        returnRequestPage.Password().sendKeys("onihus");
        returnRequestPage.LoginButton().click();
        Assert.assertTrue(returnRequestPage.ProductReturnValidation().isDisplayed());
        returnRequestPage.ContinueButton().click();
    }

    @Test
    public void ReturningFromRegister() {

        loginPage = new LoginPage();
        returnRequestPage = new ReturnRequestPage();
        returnRequestPage.AccountField().click();
        returnRequestPage.Register().click();
        returnRequestPage.ClickReturn().click();
        Assert.assertTrue(loginPage.loginOnTheRightMenuField().isDisplayed());
        returnRequestPage.EmailId().sendKeys("onihus@gmail.com");
        returnRequestPage.Password().sendKeys("onihus");
        returnRequestPage.LoginButton().click();
        Assert.assertTrue(returnRequestPage.ProductReturnValidation().isDisplayed());
        returnRequestPage.ContinueButton().click();
    }

    @Test
    public void ViewYourReturnRequest() {

        returnRequestPage = new ReturnRequestPage();
        returnRequestPage.AccountField().click();
        returnRequestPage.LoginField().click();
        returnRequestPage.EmailId().sendKeys("onihus@gmail.com");
        returnRequestPage.Password().sendKeys("onihus");
        returnRequestPage.LoginButton().click();
        returnRequestPage.ViewYourReturnRequest().click();
        returnRequestPage.ContinueButton().click();
        Assert.assertTrue(returnRequestPage.MyAccountValidation().isDisplayed());
    }

    @Test
    public void DesktopPC() {

        returnRequestPage = new ReturnRequestPage();
        returnRequestPage.AccountField().click();
        returnRequestPage.LoginField().click();
        returnRequestPage.EmailId().sendKeys("onihus@gmail.com");
        returnRequestPage.Password().sendKeys("onihus");
        returnRequestPage.LoginButton().click();
        returnRequestPage.Desktop().click();
        returnRequestPage.Pc0().click();
        Assert.assertTrue(returnRequestPage.PCValidation().isDisplayed());
        returnRequestPage.ContinueButton().click();
    }

    @Test
    public void DesktopMac() {

        returnRequestPage = new ReturnRequestPage();
        returnRequestPage.AccountField().click();
        returnRequestPage.LoginField().click();
        returnRequestPage.EmailId().sendKeys("onihus@gmail.com");
        returnRequestPage.Password().sendKeys("onihus");
        returnRequestPage.LoginButton().click();
        returnRequestPage.Desktop().click();
        returnRequestPage.Mac1().click();
        returnRequestPage.AddToCartMac().click();
        Assert.assertTrue(returnRequestPage.ValidationForAddingMac().isDisplayed());
    }
}
