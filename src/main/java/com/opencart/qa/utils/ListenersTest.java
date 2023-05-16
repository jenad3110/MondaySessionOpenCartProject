package com.opencart.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.testng.*;

import java.util.Arrays;

public class ListenersTest extends AbstractWebDriverEventListener {


    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Clicking on element: " + element.toString());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Clicked on element: " + element.toString());
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        System.out.println("Entering value: " + Arrays.toString(keysToSend) + " in element: " + element.toString());
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        System.out.println("Entered value: " + Arrays.toString(keysToSend) + " in element: " + element.toString());
    }


    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Navigating back to previous page");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Navigated back to previous page");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Navigating forward to next page");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        System.out.println("Navigated forward to next page");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        System.out.println("Refreshing the page");
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        System.out.println("Page refreshed");
    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {
        System.out.println("Accepting the alert");
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {
        System.out.println("Alert accepted");
    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {
        System.out.println("Dismissing the alert");
    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {
        System.out.println("Alert dismissed");
    }

// Add more methods as per your requirements


}
