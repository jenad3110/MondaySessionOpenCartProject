package com.opencart.qa;

import com.opencart.qa.base.ParallelTestingCommonAPI;
import org.testng.annotations.Test;


public class Tests extends ParallelTestingCommonAPI {


    @Test
    public void validateNavigatingToShoppingCartFromTheSuccessMessage2() throws InterruptedException {
        /*
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("imac");
        driver.findElement(By.xpath("//div[@id='search']/span/button/i")).click();
        driver.findElement(By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")).click();
        driver.findElement(By.linkText("shopping cart")).click();

        Thread.sleep(5000);
    */}



        /*
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/success");
        driver.findElement(By.linkText("Continue")).click();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");
        driver.findElement(By.linkText("Phones & PDAs")).click();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=24");
        driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div/div[2]/div[2]/button")).click();
        driver.findElement(By.linkText("shopping cart")).click();
        driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/cart");

         */


/*
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }





    //-----------------------------------------------------


















    @Test
    public void test06ValidateTheWeightOfTheProductInTheShoppingCartPage() throws Exception {

        String ExpectedResult = "Shopping Cart  (5.00kg)";
        // the weight is not mentioned in OpenCart doc

        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("imac");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button")).click();
        driver.findElement(By.linkText("shopping cart")).click();
        driver.findElement(By.xpath("//div[@id='content']/h1")).click();

        String Text = driver.findElement(By.xpath("//*[@id=content]/h1")).getText();
        System.out.println(Text);
        Assert.assertEquals(Text,ExpectedResult);
    }

    @Test
    public void test07ValidateTheheProductInTheShoppingCartPage() throws Exception {

        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("imac");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        /*** STALE ELEMENT EXCEPTION
         WebElement expectedImage = driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div/div[1]/a/img"));
         expectedImage.click();
         Thread.sleep(5000);
         driver.navigate().back();
         String getLinkOfImage = expectedImage.getAttribute("title");
         ***/
    /*
        WebElement expectedImage = driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div/div[1]/a/img"));
        String getLinkOfImage = expectedImage.getAttribute("src");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='content']/div[3]/div/div/div[2]/div[2]/button")).click();
        driver.findElement(By.linkText("shopping cart")).click();
        driver.findElement(By.xpath("//div[@id='content']/h1")).click();


        WebElement image = driver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[1]/a/img"));
        String actualImage = image.getAttribute("src");


        WebElement productName = driver.findElement(By.linkText("iMac"));
        WebElement Model = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[3]"));
        WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
        WebElement UnitPrice = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]"));
        WebElement Total = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]"));

        //Stale findElementBy exception
        // String getLinkOfImage = expectedImage.getAttribute("src");


        Assert.assertEquals(actualImage,expectedImage);

        System.out.println(getLinkOfImage);
    }


     */
}
