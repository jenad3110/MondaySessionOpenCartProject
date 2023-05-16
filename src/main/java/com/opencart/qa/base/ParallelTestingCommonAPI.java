package com.opencart.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class ParallelTestingCommonAPI {

    private  WebDriver driver;


    private  ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public  WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    @Parameters({"browser"})
    @BeforeMethod
    public void setupBrowser(String browserName) {
        driver = initializeBrowser(browserName);
        driverThreadLocal.set(driver);


        driver.get("https://www.saucedemo.com/");
        //driver.get("https://tutorialsninja.com/demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        //takeSCForFailedTest(result);

        // Quit the driver for the current thread
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }

    public WebDriver initializeBrowser(String browserName) {
        WebDriver driver;
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.verboseLogging", "false");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("clear-data");
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        return driver;
    }





}




