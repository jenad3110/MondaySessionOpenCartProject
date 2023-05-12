package com.opencart.qa.base;

import com.opencart.qa.locators.Locator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonAPI {

    public static WebDriver driver;




    @Parameters({"browser"})
    @BeforeMethod
    public void setupBrowser(String browserName) {

        initializeBrowser(browserName);
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        takeSCForFailedTest(result);
        driver.quit();

    }


    public void initializeBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
            }

        else if (browserName.equalsIgnoreCase("firefox"))

                driver = new FirefoxDriver();

            else if (browserName.equalsIgnoreCase("edge"))

                driver = new EdgeDriver();

            else {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
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


