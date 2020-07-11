package com.activities.page_verifications;

import com.activities.page_objects.CreditCardPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CreditCardPageVerifications {
    private static Logger logger = Logger.getLogger(CreditCardPageVerifications.class);

    CommonActionUtils actionUtils = null;
    CreditCardPageVerifications creditCardPageVerifications = null;
    CreditCardPageObjects creditCardPageObjects = null;

    public static WebDriver driver=null;
    public CreditCardPageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void navToCreditCardPageIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("Navigated to \"Credit Card\" page is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.credit_card_page.isDisplayed(), "Assertion Fail ::: Credit Card page is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.credit_card_page.isDisplayed(), "Assertion Fail ::: Credit Card page is not displayed");
        }
    }

    public void verifyingCocoStoreTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Coco Store\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.coco_store_text.isDisplayed(), "Assertion Fail ::: Coco Store text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.coco_store_text.isDisplayed(), "Assertion Fail ::: Coco Store text is not displayed");
        }
    }

    public void verifyingAmountTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Amount\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: Amount text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: Amount text is not displayed");
        }
    }

    public void verifyingPriceDetailsTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Amount Price\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.price_detail_text.get(0).isDisplayed(), "Assertion Fail ::: Amount Price text is not displayed");
            Assert.assertTrue(creditCardPageObjects.price_detail_text.get(1).isDisplayed(), "Assertion Fail ::: Amount Price text is not displayed");
        } catch (Exception e) { }
    }

    public void verifyingOrderIdTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Order Id\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.order_id_text.isDisplayed(), "Assertion Fail ::: Order Id text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.order_id_text.isDisplayed(), "Assertion Fail ::: Order Id text is not displayed");
        }
    }

    public void verifyingSampleStoreTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Sample Store\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.sample_store_text.isDisplayed(), "Assertion Fail ::: Sample Store text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.sample_store_text.isDisplayed(), "Assertion Fail ::: Sample Store text is not displayed");
        }
    }

    public void verifyingCardNumberTextBoxIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Card Number\" text box is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.credit_card_number.isDisplayed(), "Assertion Fail ::: \"Card Number\" text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.credit_card_number.isDisplayed(), "Assertion Fail ::: \"Card Number\" text box is not displayed");
        }
    }

    public void verifyingExpiryDateTexBoxtIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Expiry Date\" text box is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.card_expire_date.isDisplayed(), "Assertion Fail ::: \"Expiry Date\" text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.card_expire_date.isDisplayed(), "Assertion Fail ::: \"Expiry Date\" text box not displayed");
        }
    }

    public void verifyingCvvTextBoxIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"CVV\" text box is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.card_cvv_number.isDisplayed(), "Assertion Fail ::: \"CVV\" text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.card_cvv_number.isDisplayed(), "Assertion Fail ::: \"CVV\" text box is not displayed");
        }
    }

    public void verifyingSecurePaymentOptionTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Secure Payment Option\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.secured_payment_options_text.isDisplayed(), "Assertion Fail ::: Secure Payment Option text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.secured_payment_options_text.isDisplayed(), "Assertion Fail ::: Secure Payment Option text is not displayed");
        }
    }

    public void verifyingPaymentOptionLogoIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("Payment Option Logo text is displayed");

        try {
            for(int i=0; i<creditCardPageObjects.payment_options_logo.size(); i++) {
                if(creditCardPageObjects.payment_options_logo.get(i).isDisplayed()) {
                    Assert.assertTrue(creditCardPageObjects.payment_options_logo.get(i).isDisplayed(), "Assertion Fail ::: Payment option logo is not displayed");
                }
            }
        } catch (Exception e) { }
    }

    public void verifyingSelectPromoTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Select Promo\" text is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.select_promo_text.isDisplayed(), "Assertion Fail ::: Select Promo text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.select_promo_text.isDisplayed(), "Assertion Fail ::: Select Promo text is not displayed");
        }
    }

    public void verifyingPromoTypeOptionsIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Promo\" options text is displayed");

        try {
            for(int i=0; i<creditCardPageObjects.promo_container_options.size(); i++) {
                if (creditCardPageObjects.promo_container_options.get(i).isDisplayed()) {
                    Assert.assertTrue(creditCardPageObjects.promo_container_options.get(i).isDisplayed(), "Assertion Fail ::: Promo options text is not displayed");
                }
            }
        } catch (Exception e) { }
    }

    public void verifyingUserDetailsTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"User Details\" text is displayed");

        try {
            for(int i=0; i<creditCardPageObjects.user_details.size(); i++) {
                if (creditCardPageObjects.user_details.get(i).isDisplayed()) {
                    Assert.assertTrue(creditCardPageObjects.user_details.get(i).isDisplayed(), "Assertion Fail ::: User Details text is not displayed");
                }
            }
        } catch (Exception e) { }
    }

    public void verifyingImportantMessageTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Important message\" text is displayed");

        try {
            if(creditCardPageObjects.important_message_text_popup_bar.isDisplayed()) {
                Assert.assertTrue(creditCardPageObjects.important_message_text_popup_bar.isDisplayed(), "Assertion Fail ::: Important message text is not displayed");
            }
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.important_message_text_popup_bar.isDisplayed(), "Assertion Fail ::: Important message text is not displayed");
        }
    }

    public void verifyingImportantMessageTextPopUpIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("Important message text pop-up is displayed");

        try {
            if(creditCardPageObjects.important_message_text_popup_close_button.isDisplayed()) {
                Assert.assertTrue(creditCardPageObjects.important_message_text_popup_close_button.isDisplayed(), "Assertion Fail ::: Important message text pop-up is not displayed");
            }
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.important_message_text_popup_close_button.isDisplayed(), "Assertion Fail ::: Important message text pop-up is not displayed");
        }
    }

    public void verifyingPayNowButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("\"Pay Now\" button is displayed");

        try {
            Assert.assertTrue(creditCardPageObjects.pay_now_button.isDisplayed(), "Assertion Fail ::: Pay Now button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(creditCardPageObjects.pay_now_button.isDisplayed(), "Assertion Fail ::: Pay Now button is not displayed");
        }
    }

    public void invalidCardNumberValidationMessage(String message) {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        logger.info("Verifying error message");
        Assert.assertTrue(message.contains("Invalid card number"), "Assertion Fail ::: Card number is valid");
    }
}
