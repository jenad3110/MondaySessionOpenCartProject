package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.ShoppingCart;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ShoppingCartTest extends CommonAPI {


//    @Test
//    public void TC_SC_001_validateNavigatingToShoppingCartFromSuccessMessage() {
//
//        /***Explicit wait needed***/
//
//
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.typeAndEnterInSearchBar("imac");
//        shoppingCart.addToCartAfterEnter().click();
//        shoppingCart.shoppingCartLinkFromSuccessMessage().click();
//
//
//        Assert.assertEquals(shoppingCart.expectedResult(), "Shopping Cart  (5.00kg)");
//
//
//    }

    @Test
    public void TC_SC_01_validateNavigatingToShoppingCartFromSuccessMessage() {



        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.searchBarField().sendKeys("imac");
        shoppingCart.searchButton().click();
        shoppingCart.addToCartUnderTheProduct().click();
        shoppingCart.shoppingCartLinkFromSuccessMessage().click();


        Assert.assertEquals(shoppingCart.expectedResult(),"Shopping Cart  (5.00kg)" );


    }

    @Test
    public void TC_SC_02_validateNavigatingToShoppingCartFromTheHeaderOption() {



        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.searchBarField().sendKeys("imac");
        shoppingCart.searchButton().click();
        shoppingCart.addToCartUnderTheProduct().click();
        shoppingCart.CartButtonInHeader().click();

        Assert.assertEquals(shoppingCart.expectedResult(),"Shopping Cart  (5.00kg)" );


    }


    @Test
    public void TC_SC_03_validateNavigatingToShoppingCartFromTheFooterOption() {


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.searchBarField().sendKeys("imac");
        shoppingCart.searchButton().click();
        shoppingCart.addToCartUnderTheProduct().click();
        shoppingCart.siteMapField().click();
        shoppingCart.shoppingCartUnderSiteMap().click();

        //Assert.assertEquals(shoppingCart.expectedResult(),"Shopping Cart  (5.00kg)" );


    }


    @Test
    public void TC_SC_04_emptyCart()  {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.CartBlockButton().click();

        Assert.assertEquals(shoppingCart.expectedResultForEmptyCart(),"Your shopping cart is empty!");

    }

    @Test
    public void TC_SC_05_ValidateNavigatingToShoppingCartPageUsingTheViewCartOptionInTheCartBlock(){


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.searchBarField().sendKeys("imac");
        shoppingCart.searchButton().click();
        shoppingCart.addToCartUnderTheProduct().click();
        shoppingCart.CartBlockButton().click();
        shoppingCart.viewCartButton().click();

        Assert.assertEquals(shoppingCart.expectedResult(),"Shopping Cart  (5.00kg)" );


    }



}
