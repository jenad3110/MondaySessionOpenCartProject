package com.opencart.qa.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    int count = 0;
    int retryCount =1; // number of retry of failed test case
    @Override
    public boolean retry(ITestResult iTestResult) {
        while(count<retryCount){
            count ++;
            return true;
        }
        return false;
    }


}
