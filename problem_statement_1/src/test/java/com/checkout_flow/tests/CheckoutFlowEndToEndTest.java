package com.checkout_flow.tests;

import com.activities.page_action.*;
import com.activities.page_verifications.*;
import com.checkout_flow.data_helper.CheckoutFlowDataProvider;
import com.core.base_step.TestBase;
import com.core.propert_reader.PropertyReader;
import com.core.utility.CommonActionUtils;
import com.extent_test.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

public class CheckoutFlowEndToEndTest extends TestBase {
    private static Logger logger = Logger.getLogger(CheckoutFlowPageVerificationTests.class);
    Properties prop = null;
    PropertyReader propertyReader = null;
    CommonActionUtils actionUtils;

    MidtransHomePageActions midtransHomePageActions = null;
    MidtransHomePageVerifications midtransHomePageVerifications = null;

    ShippingCartPageActions shippingCartPageActions = null;
    ShippingCartPageVerifications shippingCartPageVerifications = null;

    OrderSummaryPageActions orderSummaryPageActions = null;
    OrderSummaryPageVerifications orderSummaryPageVerifications = null;

    SelectPaymentPageActions selectPaymentPageActions = null;
    SelectPaymentPageVerifications selectPaymentPageVerifications = null;

    CreditCardPageActions creditCardPageActions = null;
    CreditCardPageVerifications creditCardPageVerifications = null;

    VerifyPasswordPageActions verifyPasswordPageActions = null;
    VerifyPasswordPageVerifications verifyPasswordPageVerifications = null;

    TransactionPageVerifications transactionPageVerifications = null;

    @BeforeMethod
    public void verifyNavigateUrl() throws InterruptedException, IOException {
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        actionUtils = new CommonActionUtils();
        actionUtils.navigatetoUrl(driver, prop.getProperty("midtrans_url"));
        actionUtils.implicitlyWait(driver,10);
    }

    @Test(description = "Verifying passing Valid Card details with invalid Password : \", : ",
            dataProvider = "cardDetails",
            dataProviderClass = CheckoutFlowDataProvider.class,
            priority = 01,
            enabled = true,
            alwaysRun = false)
    public void scenario_01_VerifyCardDetailsTest(String runMode, String scenario, String cardNumber, String expireDate, String cvv, String message) throws InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifyCardDetailsTest");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);

        shippingCartPageActions = new ShippingCartPageActions(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);

        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);

        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);

        creditCardPageActions = new CreditCardPageActions(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);

        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);

        midtransHomePageVerifications.verifyMidtransPillowIsDisplayed();
        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        shippingCartPageVerifications.verifyShippingPageIsDisplayed();
        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.normailWait(5000);

        driver.switchTo().frame("snap-midtrans");
        actionUtils.normailWait(2000);
        orderSummaryPageActions.tapOnContinueButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        selectPaymentPageVerifications.navToSelectPaymentPageIsDisplayed();
        selectPaymentPageActions.tapOnCreditCardButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        if (runMode.equalsIgnoreCase("Y") &&  scenario.toLowerCase().contains("positive")) {
            logger.info("Test scenario : " + scenario);

            logger.info("Entering Card Number from Data Provider");
            creditCardPageActions.enterCredCardNumberInTextBox(cardNumber, "Action Step");
            actionUtils.implicitlyWait(driver, 3);

            logger.info("Entering Expiry date from Data Provider");
            creditCardPageActions.enterExpiryDateTextInTextBox(expireDate, "Action Step");
            actionUtils.implicitlyWait(driver, 3);

            logger.info("Entering CVV from Data Provider");
            creditCardPageActions.enterCVVTextInTextBox(cvv, "Action Step");
            actionUtils.implicitlyWait(driver, 5);

            logger.info("Clicking on Pay Now Button");
            creditCardPageActions.tapOnPayNowButton("Action Step");

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'redirect')]")));
            logger.info("Verifying \"Password\" title text is displaying");
            verifyPasswordPageVerifications.verifyPasswordTitleTextIsDisplayed();

            logger.info("Verifying \"Password\" text box is displaying");
            verifyPasswordPageVerifications.verifyPasswordTextBoxIsDisplayed();

            logger.info("Verifying \"Ok\" button is displaying");
            verifyPasswordPageVerifications.verifyOkButtonIsDisplayed();

            logger.info("Verifying \"Cancel\" button is displaying");
            verifyPasswordPageVerifications.verifyCancelButtonIsDisplayed();

            logger.info("Verifying \"Resent\" button is displaying");
            verifyPasswordPageVerifications.verifyResentButtonIsDisplayed();
        }
        else if(runMode.equalsIgnoreCase("Y") && scenario.toLowerCase().contains("negetive"))
        {
            logger.info("Test scenario : " + scenario);

            logger.info("Entering Card Number from Data Provider");
            creditCardPageActions.enterCredCardNumberInTextBox(cardNumber, "Action Step");
            actionUtils.implicitlyWait(driver, 3);

            logger.info("Entering Expiry date from Data Provider");
            creditCardPageActions.enterExpiryDateTextInTextBox(expireDate, "Action Step");
            actionUtils.implicitlyWait(driver, 3);

            logger.info("Entering CVV from Data Provider");
            creditCardPageActions.enterCVVTextInTextBox(cvv, "Action Step");
            actionUtils.implicitlyWait(driver, 5);

            logger.info("Clicking on Pay Now Button");
            creditCardPageActions.tapOnPayNowButton("Action Step");
            actionUtils.implicitlyWait(driver, 2);
           creditCardPageVerifications.invalidCardNumberValidationMessage(message);
        }
    }

    @Test(description = "Verifying passing with Card Details : ",
            dataProvider = "password",
            dataProviderClass = CheckoutFlowDataProvider.class,
            priority = 02,
            enabled = true,
            alwaysRun = false)
    public void scenario_02_VerifySuccessCheckputFlowTest(String runMode, String scenario, String password) throws InterruptedException, IOException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifySuccessCheckputFlow");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);

        shippingCartPageActions = new ShippingCartPageActions(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);

        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);

        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);

        creditCardPageActions = new CreditCardPageActions(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);

        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);

        transactionPageVerifications = new TransactionPageVerifications(driver);

        midtransHomePageVerifications.verifyMidtransPillowIsDisplayed();
        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        shippingCartPageVerifications.verifyShippingPageIsDisplayed();
        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.normailWait(5000);

        driver.switchTo().frame("snap-midtrans");
        actionUtils.normailWait(2000);
        orderSummaryPageActions.tapOnContinueButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        selectPaymentPageVerifications.navToSelectPaymentPageIsDisplayed();
        selectPaymentPageActions.tapOnCreditCardButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Entering Card number from Config");
        creditCardPageVerifications.navToCreditCardPageIsDisplayed();
        creditCardPageActions.enterCredCardNumber("Action Setp");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Entering Expiry date from Config");
        creditCardPageVerifications.verifyingExpiryDateTexBoxtIsDisplayed();
        creditCardPageActions.enterExpiryDateText("Action Setp");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Entering CVV from Config");
        creditCardPageVerifications.verifyingCvvTextBoxIsDisplayed();
        creditCardPageActions.enterCVVText("Action Setp");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Clicking on Pay Now button");
        creditCardPageVerifications.verifyingPayNowButtonIsDisplayed();
        creditCardPageActions.tapOnPayNowButton("Action Step");
        actionUtils.normailWait(7000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'redirect')]")));

        if(runMode.equalsIgnoreCase("Y") && scenario.toLowerCase().contains("positive")) {
            logger.info("Test scenario : " + scenario);
            logger.info("Verifying Issuing Bank text is Displaying or not after password approved");
            verifyPasswordPageVerifications.verifyIssuingBankTextIsDisplayed();

            logger.info("Verifying Password Title text is displaying");
            verifyPasswordPageVerifications.verifyPasswordTitleTextIsDisplayed();

            logger.info("Verifying Password input text field is displaying");
            verifyPasswordPageVerifications.verifyPasswordTextBoxIsDisplayed();

            logger.info("Entering password from Data provider");
            verifyPasswordPageActions.enterPassword(password);

            logger.info("click on proceed");
             verifyPasswordPageActions.tapOnOkButton("Action Steps");
        }
       else if(runMode.equalsIgnoreCase("Y") && scenario.toLowerCase().contains("negetive")) {
            logger.info("Test scenario : " + scenario);
            logger.info("Verifying Issuing Bank text is Displaying or not after password approved");
            verifyPasswordPageVerifications.verifyIssuingBankTextIsDisplayed();

            logger.info("Verifying Password Title text is displaying");
            verifyPasswordPageVerifications.verifyPasswordTitleTextIsDisplayed();

            logger.info("Verifying Password input text field is displaying");
            verifyPasswordPageVerifications.verifyPasswordTextBoxIsDisplayed();

            logger.info("Entering password from Data provider");
            verifyPasswordPageActions.enterPassword(password);

            logger.info("Verifying transaction got succeed for valid Password details");
            transactionPageVerifications.verifyTransactionFailTextIsDisplayed();
        }
    }
}