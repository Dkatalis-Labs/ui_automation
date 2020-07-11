package com.activities.page_verifications;

import com.activities.page_objects.VerifyPasswordPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerifyPasswordPageVerifications {
    private static Logger logger = Logger.getLogger(VerifyPasswordPageVerifications.class);
    CommonActionUtils actionUtils = null;
    VerifyPasswordPageVerifications verifyPasswordPageVerifications = null;
    VerifyPasswordPageObjects verifyPasswordPageObjects = null;

    public static WebDriver driver=null;
    public VerifyPasswordPageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifyIssuingBankTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Issuing Bank\" text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.issuing_bank_text.isDisplayed(), "Assertion Fail ::: \"Issuing Bank\" text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.issuing_bank_text.isDisplayed(), "Assertion Fail ::: \"Issuing Bank\" text is not displayed");
        }
    }

    public void verifyTransactionMessageIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Transaction complete\" Message is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_complete_message.isDisplayed(), "Assertion Fail ::: \"Transaction complete\" Message is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_complete_message.isDisplayed(), "Assertion Fail ::: \"Transaction complete\" Message is not displayed");
        }
    }

    public void verifyTimeLeftToCompleteTheTransactionTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Transaction Time Left\" Message is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_time_left_text.isDisplayed(), "Assertion Fail ::: \"Transaction Time Left\" Message is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_time_left_text.isDisplayed(), "Assertion Fail ::: \"Transaction Time Left\" Message is not displayed");
        }
    }

    public void verifyMerchantNameTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Merchant Name\" title text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.merchant_name.isDisplayed(), "Assertion Fail ::: \"Merchant Name\" title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.merchant_name.isDisplayed(), "Assertion Fail ::: \"Merchant Name\" title text is not displayed");
        }
    }

    public void verifyMerchantDetailIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Merchant Name\" detail text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.merchant_name_detail.isDisplayed(), "Assertion Fail ::: \"Merchant Name\" detail text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.merchant_name_detail.isDisplayed(), "Assertion Fail ::: \"Merchant Name\" detail text is not displayed");
        }
    }

    public void verifyAmountTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Amount\" title text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: \"Amount\" title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: \"Amount\" title text is not displayed");
        }
    }

    public void verifyTotalAmountDetailIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Amount\" details text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_total_amount.isDisplayed(), "Assertion Fail ::: \"Amount\" details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_total_amount.isDisplayed(), "Assertion Fail ::: \"Amount\" details text is not displayed");
        }
    }

    public void verifyTransactionTimeTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Transaction Time\" title text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_time.isDisplayed(), "Assertion Fail ::: \"Transaction Time\" title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_time.isDisplayed(), "Assertion Fail ::: \"Transaction Time\" title text is not displayed");
        }
    }

    public void verifyTransactionTimeDetailIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Transaction Time\" details text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_time_details.isDisplayed(), "Assertion Fail ::: \"Transaction Time\" details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.transaction_time_details.isDisplayed(), "Assertion Fail ::: \"Transaction Time\" details text is not displayed");
        }
    }

    public void verifyCardNumberTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Card Number\" title text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.card_number_text.isDisplayed(), "Assertion Fail ::: \"Card Number\"title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.card_number_text.isDisplayed(), "Assertion Fail ::: \"Card Number\" title text is not displayed");
        }
    }

    public void verifyCardNumberDetailIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Card Number\" details text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.card_number_detail.isDisplayed(), "Assertion Fail ::: \"Card Number\" details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.card_number_detail.isDisplayed(), "Assertion Fail ::: \"Card Number\" details title text is not displayed");
        }
    }

    public void verifyPasswordTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Password\" title text is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.pasword_text.isDisplayed(), "Assertion Fail ::: \"Password\" title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.pasword_text.isDisplayed(), "Assertion Fail ::: \"Password\" title text is not displayed");
        }
    }

    public void verifyPasswordTextBoxIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Password\" text box is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.password_text_field.isDisplayed(), "Assertion Fail ::: \"Password\" text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.password_text_field.isDisplayed(), "Assertion Fail ::: \"Password\" text box is not displayed");
        }
    }

    public void verifyOkButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Ok\" button is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.ok_button.isDisplayed(), "Assertion Fail ::: \"Ok\" button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.ok_button.isDisplayed(), "Assertion Fail ::: \"Ok\" button is not displayed");
        }
    }

    public void verifyCancelButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Cancel\" button is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.cancel_button.isDisplayed(), "Assertion Fail ::: \"Cancel\" button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.cancel_button.isDisplayed(), "Assertion Fail ::: \"Cancel\" button is not displayed");
        }
    }

    public void verifyResentButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);
        logger.info("\"Resent\" button is displayed");
        try {
            Assert.assertTrue(verifyPasswordPageObjects.resend_button.isDisplayed(), "Assertion Fail ::: \"Resent\" button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(verifyPasswordPageObjects.resend_button.isDisplayed(), "Assertion Fail ::: \"Resent\" button is not displayed");
        }
    }
}
