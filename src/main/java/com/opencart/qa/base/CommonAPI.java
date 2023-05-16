package com.opencart.qa.base;

import com.opencart.qa.locators.Locator;
import com.opencart.qa.utils.WebListener;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonAPI {


    private static final Logger log = LogManager.getLogger(CommonAPI.class);


    public static WebListener webListener;
    EventFiringWebDriver e_driver;

    public static WebDriver driver;

    private void setWebListener() {

        e_driver = new EventFiringWebDriver(driver);
        webListener = new WebListener();
        e_driver.register(webListener);
        driver = e_driver;
    }

    @BeforeClass
    public void test(){


    }



    @Parameters({"browser"})
    @BeforeMethod
    public void setupBrowser(String browserName) {

        initializeBrowser(browserName);
        setWebListener();
        log.info("Class "+getClass().getSimpleName()+" is selected");
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        takeSCForFailedTest(result);
        driver.quit();
        if (driver ==null){
            log.info("Driver Closed");
        }
        log.info("AfterMethod executed");

    }


    public void initializeBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            log.info("Browser used is Chrome");
        }

        else if (browserName.equalsIgnoreCase("firefox")){

            driver = new FirefoxDriver();
        log.info("Browser used is FireFox");}

        else if (browserName.equalsIgnoreCase("edge")){

            driver = new EdgeDriver();
        log.info("Browser used is Edge");}

        else {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            log.warn("Check the syntax of the browser");
            log.info("Default browser is selected");
        }


    }


    public void click(WebElement element) {

        element.click();
    }


    public void type(WebElement element, String text) {

        element.sendKeys(text);
    }

    public void typeAndEnter(WebElement element, String text) {
        element.sendKeys(text + Keys.ENTER);

    }

    public void dropDown(WebElement element, String option) {

        Select select = new Select(element);
        select.selectByVisibleText(option);

    }

    public void hoverOver(WebElement element) {

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

    public void waitFor(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }

    public void scrollInToView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void takeScreenShot(ITestResult result) {

        DateFormat df = new SimpleDateFormat("MMddyyyy");
        Date date = new Date();

        File file;
        String name = result.getName();
        file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshots\\screenshotsFailedTest\\" + name + " " + df.format(date) + ".jpeg"));
        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        log.info("Screenshot taken");
    }

    public void takeSCForFailedTest(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE)
            takeScreenShot(result);
    }





    private By ByLocatorType(Locator locatorType, String value) {

        switch (locatorType) {

            case ID:
                return By.id(value);
            case NAME:
                return By.name(value);
            case PARTIALLINKTEXT:
                return By.partialLinkText(value);
            case LINKEDTEXT:
                return By.linkText(value);
            case CSS:
                return By.cssSelector(value);
            case XPATH:
                return By.xpath(value);
            case CLASSNAME:
                return By.className(value);
            case TAGNAME:
                return By.tagName(value);

        }return null;


    }




}
