package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends CommonAPI {



    By registerButton = By.linkText("Register");
    By myAccountButton = By.xpath("//div[@id='top-links']/ul/li[2]/a/span");

    public WebElement myAccountField() {

        return driver.findElement(myAccountButton);
    }

    public WebElement registerButton() {

        return driver.findElement(registerButton);
    }


}
