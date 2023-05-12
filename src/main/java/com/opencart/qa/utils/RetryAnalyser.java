package com.opencart.qa.utils;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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
