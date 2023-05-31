package com.opencart.qa.pagesObjects;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class ShoppingCart extends CommonAPI {

    //--------------------------------------------------------------------------------------------------//
    By searchBarField = By.name("search");
    By addToCart = By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span");
    By addToCartAfterEnter = By.xpath("//*[@id=content]/div[3]/div/div/div[2]/div[2]/button[1]");
    By cartInHeader = By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/span");
    By cartBlock = By.id("cart-total");
    By searchButton = By.xpath("//div[@id='search']/span/button");
    By viewCartField = By.xpath("//div[@id='cart']/ul/li[2]/div/p/a/strong");
    By shoppingCartUnderSiteMap = By.xpath("//*[@id='content']/div/div[2]/ul/li[3]/a");
    By shoppingCartText = By.xpath("/html/body/div[2]/div/div/h1");
    By siteMapField = By.xpath("/html/body/footer/div/div/div[2]/ul/li[3]/a");
    By shoppingCartEmptyText = By.xpath("/html/body/header/div/div/div[3]/div/ul/li/p");
    By shoppingCartLinkFromSuccessMessage = By.linkText("shopping cart");



    public WebElement searchBarField() {return driver.findElement(searchBarField);}

    public WebElement addToCartUnderTheProduct() {
        return driver.findElement(addToCart);
    }

    public WebElement CartButtonInHeader() {return driver.findElement(cartInHeader);}

    public WebElement searchButton() {return driver.findElement(searchButton);}

    public WebElement addToCartAfterEnter() {return driver.findElement(addToCartAfterEnter);}

    public WebElement CartBlockButton() {return driver.findElement(cartBlock);}

    public WebElement viewCartButton() {return driver.findElement(viewCartField);}

    public WebElement shoppingCartText() {return driver.findElement(shoppingCartText);}

    public WebElement shoppingCartUnderSiteMap() {return driver.findElement(shoppingCartUnderSiteMap);}


    public WebElement siteMapField() {return driver.findElement(siteMapField);}

    public WebElement shoppingCartLinkFromSuccessMessage() {return driver.findElement(shoppingCartLinkFromSuccessMessage);}

    public WebElement shoppingCartEmptyText() {return driver.findElement(shoppingCartEmptyText);}

    public String expectedResult() {
        return shoppingCartText().getText();}

    public String expectedResultForEmptyCart() {
        return shoppingCartEmptyText().getText();
    }

    //Zohra's Region
    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement shoppingCartMessage;

    @FindBy(xpath = "//div[@class='pull-right']/a")
    public WebElement checkoutLink;

    public CheckoutPage clickCheckout(){
        click(checkoutLink);
        return new CheckoutPage(driver);
    }
    //End Region
}