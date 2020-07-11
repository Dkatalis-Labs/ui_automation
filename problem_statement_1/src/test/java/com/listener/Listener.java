package com.listener;


import com.core.base_step.TestBase;
import com.extent_test.ExtentManager;
import com.extent_test.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.*;

public class Listener extends TestBase implements ITestListener {
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    public static WebDriver driver;


    public void onTestStart(ITestResult result) {
        System.out.println("I am in onTestStart method " + getTestMethodName(result) + " start");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("I am in onTestSuccess method " + getTestMethodName(result) + " succeed");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
    }

    public void onTestFailure(ITestResult result) {
        WebDriver driver = null;

            try {

                System.out.println("I am in onTestFailure method " + getTestMethodName(result) + " failed");
                ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
            } catch (HeadlessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    public void onTestSkipped(ITestResult result) {
        System.out.println("I am in onTestSkipped method " + getTestMethodName(result) + " skipped");
        //ExtentReports log operation for skipped tests.
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("I am in onTestSkipped method " + getTestMethodName(result) + " skipped");
        //ExtentReports log operation for skipped tests.
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }

    public void onStart(ITestContext context) {
        System.out.println("I am in onStart method " + context.getName());
        context.setAttribute("WebDriver", this.driver);
    }

    public void onFinish(ITestContext context) {
        System.out.println("I am in onFinish method " + context.getName());
        //Do tier down operations for extentreports reporting!
        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
    }
}
