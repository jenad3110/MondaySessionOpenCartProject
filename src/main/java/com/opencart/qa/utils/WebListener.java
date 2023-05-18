package com.opencart.qa.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.Arrays;

public class WebListener implements WebDriverEventListener {

    private static final Logger log = LogManager.getLogger(WebListener.class);
    private String currentStepDescription;

    private void logStep(String stepDescription, WebElement element) {
        String elementInfo = getElementInfo(element);
        log.info("{} - Element: {}", stepDescription, elementInfo);
    }

    private String getElementInfo(WebElement element) {
        String text = element.toString();
        String delimiter = "->"; // Multi-character delimiter
        int startIndex = text.indexOf(delimiter) + delimiter.length(); // Adding the length of the delimiter
        String partialString = text.substring(startIndex);

        return partialString;
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        // Set the current step description before clicking on the element
        currentStepDescription = "Clicking on element";
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        logStep(currentStepDescription, element);
    }


    @Override
    public void beforeAlertAccept(WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {
        log.info("Accepted the alert.");
    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {
        log.info("Dismissed the alert.");
    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        log.info("Navigated to: {}", url);
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        log.info("Navigated back.");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        log.info("Navigated forward.");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        log.info("Refreshed the page.");

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        log.info("Found element: {}", by);
    }
/*
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        log.info("Clicked on element: {}", element);

    }
*/

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        // Leave it blank
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        //log.info("Changed value of element: {} to: {}", element, Arrays.toString(keysToSend));
        log.info("Changed value of element: {} to: {}", "[" + getElementInfo(element), Arrays.toString(keysToSend));
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        log.info("Executed script: {}", script);
    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        // Leave it blank
    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        log.info("Switched to window: {}", windowName);
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        log.error("Exception occurred: {}", throwable.getMessage());
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {
        // Leave it blank
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }


}






