package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1  {

    WebDriver driver;


    //@Test
//    public void validateNavigatingToShoppingCartFromTheSuccessMessage() throws InterruptedException {
//
//
//        driver.get("https://tutorialsninja.com/demo/");
//        driver.findElement(By.name("search")).click();
//        //driver.findElement(By.name("search")).clear();
//        WebElement element = driver.findElement(By.name("search"));
//        typeAndEnter(element,"imac");
//        Thread.sleep(5000);
//        //driver.findElement(By.name("search")).sendKeys("imac");
//        //driver.findElement(By.xpath("//div[@id='search']/span/button/i")).click();
//        driver.findElement(By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")).click();
//        driver.findElement(By.linkText("shopping cart")).click();
//
//        Thread.sleep(5000);
//
//    }

    //@Test
//    public void hoverOverLaptopsAndNoteBooks() {
//
//        driver.get("https://tutorialsninja.com/demo/");
//        WebElement element = driver.findElement(By.linkText("Laptops & Notebooks"));
//        hoverOver(element);
//        waitFor(3);
//        scrollDown();
//        waitFor(3);
//    }


//    @Test
//    public void scrollIntoViewMacBook() {
//
//        WebElement element = driver.findElement(By.xpath("*[title='MacBook']"));
//        hoverOver(element);
//        scrollInToView(element);
//        waitFor(3);
//    }




    //@Test
    public void validateNavigatingToShoppingCartFromTheSuccessMessage2() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("imac");
        driver.findElement(By.xpath("//div[@id='search']/span/button/i")).click();
        driver.findElement(By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")).click();
        driver.findElement(By.linkText("shopping cart")).click();

        Thread.sleep(5000);
    }


    //@Test
    public void login() throws Exception {
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a/span")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("dfsdfgsd12345@gmail.com");
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys("123456");
        driver.findElement(By.id("input-email")).click();
        driver.findElement(By.id("input-password")).click();
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }


    //@Test
    public void loginandaddtocart() throws Exception {
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a/span")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("dfsdfgsd12345@gmail.com");
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys("123456");
        driver.findElement(By.id("input-email")).click();
        driver.findElement(By.id("input-password")).click();
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("imac");
        driver.findElement(By.xpath("//div[@id='search']/span/button/i")).click();
        driver.findElement(By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")).click();
        driver.findElement(By.linkText("shopping cart")).click();

        Thread.sleep(5000);
    }


    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);//keep the page load slow
        options.addArguments("--incognito");//the browser opens on an incognito mode
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        //to check if the web findElementBy is enabled
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[text() = 'Forgot password?']"));
        System.out.println(forgotPasswordLink.isEnabled());
        System.out.println(forgotPasswordLink.isDisplayed());
        System.out.println(forgotPasswordLink.isSelected());
        //isSelected will be false because it is a link, it is not a radio button nor a checkBox
        //How to validate this:
        if(forgotPasswordLink.isEnabled() && forgotPasswordLink.isEnabled() == true){
            forgotPasswordLink.click();
            System.out.println("Title of the page: " + driver.getTitle()
                    + "CurrentUrl of the page: " + driver.getCurrentUrl());
        }
        else{
            System.out.println("Link is not clickable");
        }
        driver.close();
        driver.quit();
    }
    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    @FindBy(id = "user-name")
    WebElement userNameFIeld;

    By user = By.id("user-name");
    By pass = By.id("password");

    By loginBtn = By.id("login-button");

    @FindBy (id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @Parameters({"browser"})
    @BeforeMethod
    public void setupBrowser(String browserName){

    initializeBrowser(browserName);
    }

    @AfterMethod
    public void teardown(){

        driver.quit();
    }

    public void initializeBrowser(String browserName) {

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

    }




    @Test
    public void test(){

        driver.get("https://www.saucedemo.com/");
        driver.findElement(user).sendKeys("standard_user");
        driver.findElement(pass).sendKeys("secret_sauce");
        driver.findElement(loginBtn).click();
        driver.findElement(addToCart).click();

    }



}
