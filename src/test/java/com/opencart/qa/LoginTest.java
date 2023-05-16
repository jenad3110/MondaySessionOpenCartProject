package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.LandingPage;
import com.opencart.qa.pagesObjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {

    @Test
    public void Logging() {

        LoginPage loginPage = new LoginPage();
        LandingPage landingPage = new LandingPage();
        landingPage.myAccountField().click();
        landingPage.loginButton().click();
        loginPage.emailField().sendKeys("dz@gmail.com");
        loginPage.passwordField().sendKeys("salamo");
        loginPage.loginBtn().click();
    }
}
