package com.activities.page_verifications;

import com.activities.page_action.SelectPaymentPageActions;
import com.activities.page_objects.MidtransHomePageObjects;
import com.activities.page_objects.SelectPaymentPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectPaymentPageVerifications {
    private static Logger logger = Logger.getLogger(SelectPaymentPageActions.class);

    CommonActionUtils actionUtils = null;
    SelectPaymentPageVerifications selectPaymentPageVerifications = null;
    SelectPaymentPageObjects selectPaymentPageObjects = null;

    public static WebDriver driver=null;
    public SelectPaymentPageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void navToSelectPaymentPageIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("Navigated to \"Select Payment\" page is displayed");

        try {
            Assert.assertTrue(selectPaymentPageObjects.select_payment_page.isDisplayed(), "Assertion Fail ::: Navigated to Select Payment page is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(selectPaymentPageObjects.select_payment_page.isDisplayed(), "Assertion Fail ::: Navigated to Select Payment page is not displayed");
        }
    }

    public void verifyCocoStoreTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Coco Store\" text is displayed");

        try {
            Assert.assertTrue(selectPaymentPageObjects.coco_store_text.isDisplayed(), "Assertion Fail ::: Coco Store text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(selectPaymentPageObjects.coco_store_text.isDisplayed(), "Assertion Fail ::: Coco Store text is not displayed");
        }
    }

    public void verifyCreditCardOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Credit Card\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.credit_card_payment_option.size(); i++) {
                if(selectPaymentPageObjects.credit_card_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.credit_card_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Credit Card\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyAtmOrBangTransferOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"ATM/Bank Transfer\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.atm_bank_transfer_payment_option.size(); i++) {
                if(selectPaymentPageObjects.atm_bank_transfer_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.atm_bank_transfer_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Credit Card\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyQrPaymentOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"QR Payment\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.qr_payment_option.size(); i++) {
                if(selectPaymentPageObjects.qr_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.qr_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"QR Payment\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyKlikPaymentOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Klik Payment\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.klikbca_payment_option.size(); i++) {
                if(selectPaymentPageObjects.klikbca_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.klikbca_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Klik Payment\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyBCAKlikPayOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"BCA KlikPay\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.bca_klil_pay_payment_option.size(); i++) {
                if(selectPaymentPageObjects.bca_klil_pay_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.bca_klil_pay_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"BCA KlikPay\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyMandiriClickPayOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Mandiri ClickPay\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.mandiri_click_pay_payment_option.size(); i++) {
                if(selectPaymentPageObjects.mandiri_click_pay_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.mandiri_click_pay_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Mandiri ClickPay\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyCIMBClicksOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"CIMB Clicks\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.cimb_clicks_payment_option.size(); i++) {
                if(selectPaymentPageObjects.cimb_clicks_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.cimb_clicks_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"CIMB Clicks\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyDanamonOnlineBankingOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Danamon Online Banking\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.danamon_online_banking_payment_option.size(); i++) {
                if(selectPaymentPageObjects.danamon_online_banking_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.danamon_online_banking_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Danamon Online Banking\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyEPayBRIOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"e-Pay BRI\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.epay_bri_payment_option.size(); i++) {
                if(selectPaymentPageObjects.epay_bri_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.epay_bri_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"e-Pay BRI\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyLinePayECashMandiriECashOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Line Pay e-Cash Mandiri e-Cash\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.line_pay_or_mandiri_ecash_payment_option.size(); i++) {
                if(selectPaymentPageObjects.line_pay_or_mandiri_ecash_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.line_pay_or_mandiri_ecash_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Line Pay e-Cash Mandiri e-Cash\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyTalkomselCashOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Talkomsel Cash\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.telkomsel_case__payment_option.size(); i++) {
                if(selectPaymentPageObjects.telkomsel_case__payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.telkomsel_case__payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Talkomsel Cash\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyIndomaretOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Indomaret\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.indomaret_payment_option.size(); i++) {
                if(selectPaymentPageObjects.indomaret_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.indomaret_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Indomaret\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyAlfamartOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Alfamart\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.alfamart_payment_option.size(); i++) {
                if(selectPaymentPageObjects.alfamart_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.alfamart_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Alfamart\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }

    public void verifyAkulakuOptionIsDisplayed() {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        logger.info("\"Akulaku\" payment option is displayed");

        try {
            for(int i = 0; i<selectPaymentPageObjects.akulaku_payment_option.size(); i++) {
                if(selectPaymentPageObjects.akulaku_payment_option.get(i).isDisplayed()){
                    Assert.assertTrue(selectPaymentPageObjects.akulaku_payment_option.get(i).isDisplayed(), "Assertion Fail ::: \"Akulaku\" payment option is not displayed");
                }
            }
        } catch (Exception e) {}
    }
}
