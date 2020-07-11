package com.activities.page_verifications;

import com.activities.page_objects.TransactionPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TransactionPageVerifications {
    private static Logger logger = Logger.getLogger(TransactionPageVerifications.class);
    CommonActionUtils actionUtils = null;
    TransactionPageVerifications transactionPageVerifications = null;
    TransactionPageObjects transactionPageObjects = null;

    public static WebDriver driver=null;
    public TransactionPageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifyTransactionFailTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        transactionPageObjects = new TransactionPageObjects(driver);
        transactionPageVerifications = new TransactionPageVerifications(driver);
        logger.info("\"Transaction Fail\" text is displayed");
        try {
            Assert.assertTrue(transactionPageObjects.transaction_fail_text.isDisplayed(), "Assertion Fail ::: \"Transaction Fail\" text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(transactionPageObjects.transaction_fail_text.isDisplayed(), "Assertion Fail ::: \"Transaction Fail\" text is not displayed");
        }
    }

    public void verifyTransactionSuccessTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        transactionPageObjects = new TransactionPageObjects(driver);
        transactionPageVerifications = new TransactionPageVerifications(driver);
        logger.info("\"Transaction Success\" text is displayed");
        try {
            Assert.assertTrue(transactionPageObjects.transaction_success_text.isDisplayed(), "Assertion Fail ::: \"Transaction Success\" text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(transactionPageObjects.transaction_success_text.isDisplayed(), "Assertion Fail ::: \"Transaction Success\" text is not displayed");
        }
    }

    public void verifyTransactionFailReasonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        transactionPageObjects = new TransactionPageObjects(driver);
        transactionPageVerifications = new TransactionPageVerifications(driver);
        logger.info("\"Transaction Fail Reason\" text is displayed");
        try {
            Assert.assertTrue(transactionPageObjects.transaction_fail_reason.isDisplayed(), "Assertion Fail ::: \"Transaction Fail Reason\" text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(transactionPageObjects.transaction_fail_reason.isDisplayed(), "Assertion Fail ::: \"Transaction Fail Reason\" text is not displayed");
        }
    }

    public void verifyRetryTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        transactionPageObjects = new TransactionPageObjects(driver);
        transactionPageVerifications = new TransactionPageVerifications(driver);
        logger.info("\"Retry\" text is displayed");
        try {
            Assert.assertTrue(transactionPageObjects.retry_text.isDisplayed(), "Assertion Fail ::: \"Retry\" text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(transactionPageObjects.retry_text.isDisplayed(), "Assertion Fail ::: \"Retry\" text is not displayed");
        }
    }

    public void verifyRetryButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        transactionPageObjects = new TransactionPageObjects(driver);
        transactionPageVerifications = new TransactionPageVerifications(driver);
        logger.info("\"Retry\" button is displayed");
        try {
            Assert.assertTrue(transactionPageObjects.retry_button.isDisplayed(), "Assertion Fail ::: \"Retry\" button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(transactionPageObjects.retry_button.isDisplayed(), "Assertion Fail ::: \"Retry\" button is not displayed");
        }
    }
}
