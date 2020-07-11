package com.checkout_flow.tests;

import com.activities.page_action.*;
import com.activities.page_verifications.*;
import com.core.base_step.TestBase;
import com.core.utility.CommonActionUtils;
import com.core.propert_reader.PropertyReader;
import com.extent_test.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

public class CheckoutFlowPageVerificationTests extends TestBase {

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

    @BeforeMethod
    public void verifyNavigateUrl() throws InterruptedException, IOException {
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        actionUtils = new CommonActionUtils();
        actionUtils.navigatetoUrl(driver, prop.getProperty("midtrans_url"));
        actionUtils.implicitlyWait(driver,10);
    }

    @Test(description = "Verifying Midtrans Home Page parameters : ",
            priority = 03,
            enabled = true,
            alwaysRun = true)
    public void page_verification_03_VerifyContentsOfMidtransHomePageTest() throws IOException, InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "verify content of MidtransHomepage");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);

        logger.info("Navigated to \"Coco\" page");
        midtransHomePageVerifications.verifyCocoPageIsDisplayed();

        logger.info("Verifying \"Midtrans Pillow\" title text is displaying.");
        midtransHomePageVerifications.verifyMidtransPillowIsDisplayed();

        logger.info("Verifying \"Amount\" text is displaying.");
        midtransHomePageVerifications.verifyAmountTextBarIsDisplayed();

        logger.info("Verifying \"Product Message\" text is displaying.");
        midtransHomePageVerifications.verifyProductMessageTextIsDisplayed();

        logger.info("Verifying \"Disclaimer Message\" text is displaying.");
        midtransHomePageVerifications.verifyDisclaimerMessageTextIsDisplayed();

        logger.info("Verifying \"Buy Now\" button is displaying.");
        midtransHomePageVerifications.verifyBuyNowButtonIsDisplayed();

        logger.info("Clicking on \"Buy Now\" button");
        midtransHomePageActions.tapOnBuyNowButton("Action Step");

        actionUtils.implicitlyWait(driver, 5);

        logger.info("Verify navigated to \"Shipping Cart\" page successfully");
        shippingCartPageVerifications.verifyShippingPageIsDisplayed();
    }

    @Test(description = "Verifying Shipping Cart Page parameters : ",
            priority = 04,
            enabled = true,
            alwaysRun = true)
    public void page_verification_04_VerifyContentsOfShippingCartPageTest() throws IOException, InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifyContentsOfShippingCart");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);

        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 10);

        logger.info("Verify navigated to \"Shipping Cart\" page");
        shippingCartPageVerifications.verifyShippingPageIsDisplayed();

        logger.info("Verifying product quantity is displaying");
        shippingCartPageVerifications.verifyTotalQuantityTextIsDisplayed();

        logger.info("Verifying Order quantities header is displaying");
        shippingCartPageVerifications.verifyOrderQuantitiesTableIsDisplayed();

        logger.info("Verifying product \"Name\" text is displayed");
        shippingCartPageVerifications.verifyOrderedItemNameIsTextDisplayed();

        logger.info("Verifying product \"Quantities\" text is displayed");
        shippingCartPageVerifications.verifyOrderedItemQuantityTextIsDisplayed();

        logger.info("Verifying product \"Price\" text box is displayed");
        shippingCartPageVerifications.verifyPriceTextBoxIsDisplayed();

        logger.info("Verifying \"Total\" text is displayed");
        shippingCartPageVerifications.verifyTotalTextIsDisplayed();

        logger.info("Verifying product \"Total Prize\" text is displayed");
        shippingCartPageVerifications.verifyTotalAmountTextIsDisplayed();

        logger.info("Verifying \"Customer Details\" text is displayed");
        shippingCartPageVerifications.verifyCustomerDetailsTextIsDisplayed();

        logger.info("Verifying \"Name\" text is displayed");
        shippingCartPageVerifications.verifyNameTextIsDisplayed();

        logger.info("Verifying \"Email\" text is displayed");
        shippingCartPageVerifications.verifyEmailTextIsDisplayed();

        logger.info("Verifying \"Email\" text box is displayed");
        shippingCartPageVerifications.verifyEmailTextBoxIsDisplayed();

        logger.info("Verifying \"Phone No\" text is displayed");
        shippingCartPageVerifications.verifyPhoneNumberTextIsDisplayed();

        logger.info("Verifying \"City\" text is displayed");
        shippingCartPageVerifications.verifyCityTextIsDisplayed();

        logger.info("Verifying \"Address\" text is displayed");
        shippingCartPageVerifications.verifyAddressTextIsDisplayed();

        logger.info("Verifying \"Address\" text box is displayed");
        shippingCartPageVerifications.verifyAddressTextBoxIsDisplayed();

        logger.info("Verifying \"Postal Code\" text is displayed");
        shippingCartPageVerifications.verifyPostalCodeTextIsDisplayed();

        logger.info("Verifying \"Name, City, Phone No & Postal Code\" text box is displayed");
        shippingCartPageVerifications.verifyCustomerDetailInputTextBoxIsDisplayed();

        logger.info("Verifying \"Checkout\" button is displaying");
        shippingCartPageVerifications.verifyCheckoutButtontIsDisplayed();

        logger.info("Verifying \"Setting\" button is displaying");
        shippingCartPageVerifications.verifySettingButtonIsDisplayed();

        logger.info("Verifying \"Cancel\" button is displaying");
        shippingCartPageVerifications.verifyCancelButtonIsDisplayed();

        logger.info("Clicking on \"Checkout\" button");
        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.normailWait(3000);

        logger.info("Verifying navigated to \"Order Summary\" page successfully");
        orderSummaryPageVerifications.verifyOrderSummaryPageIsDisplayed();
    }

    @Test(description = "Verifying Shipping Cart Page parameters : ",
            priority = 05,
            enabled = true,
            alwaysRun = false)
    public void page_verification_05_VerifyContentsOfOrderSummaryPageTest() throws IOException, InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifyContentsOfOrderSummaryPage");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);

        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Verifying navigated to \"Order Summary\" page");
        orderSummaryPageVerifications.verifyOrderSummaryPageIsDisplayed();

        logger.info("Verifying \"Close\" button is displaying");
        orderSummaryPageVerifications.verifyCloseButtonIsDisplayed();

        logger.info("Verifying \"Coco Store\" text is displaying");
        orderSummaryPageVerifications.verifyCocoStoreTextIsDisplayed();

        logger.info("Verifying \"Amount\" text is displaying");
        orderSummaryPageVerifications.verifyAmountTextIsDisplayed();

        logger.info("Verifying \"Amount price\" text is displaying");
        orderSummaryPageVerifications.verifyAmountPriceTextIsDisplayed();

        logger.info("Verifying \"Order Id\" is displaying");
        orderSummaryPageVerifications.verifyOrderIdTextIsDisplayed();

        logger.info("Verifying \"Sample Store\" Id is displaying");
        orderSummaryPageVerifications.verifySampleOrderIdTextIsDisplayed();

        logger.info("Verifying \"Order Details\" text is displaying");
        orderSummaryPageVerifications.verifyOrderDetailsTextIsDisplayed();

        logger.info("Verifying in Order Detail section \"Item\" text is displaying");
        orderSummaryPageVerifications.verifyOrderDetailItemsTextIsDisplayed();

        logger.info("Verifying in Order Detail section \"Amount\" text is displaying");
        orderSummaryPageVerifications.verifyOrderDetailAmountTextIsDisplayed();

        logger.info("Verifying in Order Detail section \"Item\" info is displaying");
        orderSummaryPageVerifications.verifyOrderDetailItemsInformationTextIsDisplayed();

        logger.info("Verifying in Order Detail section \"Item\" info is displaying");
        orderSummaryPageVerifications.verifyOrderDetailAmountInformationTextIsDisplayed();

        logger.info("Verifying \"Shipping Details\" text is displaying");
        orderSummaryPageVerifications.verifyShippingDetailTextIsDisplayed();

        logger.info("Clicking on \"Shipping Details\" tab");
        orderSummaryPageActions.tapOnShippingDetailsButton("Action Step");

        logger.info("Verifying customer \"Name\" title text is displaying");
        orderSummaryPageVerifications.verifyCustomerNameTitleTextIsDisplayed();

        logger.info("Verifying customer \"Phone Number\" title text is displaying");
        orderSummaryPageVerifications.verifyCustomerPhoneNumberTitleTextIsDisplayed();

        logger.info("Verifying customer \"Email\" title text is displaying");
        orderSummaryPageVerifications.verifyCustomerEmailTitleTextIsDisplayed();

        logger.info("Verifying customer \"Address\" title text is displaying");
        orderSummaryPageVerifications.verifyCustomerAddressTitleTextIsDisplayed();

        logger.info("Verifying customer details value text is displaying");
        orderSummaryPageVerifications.verifyCustomerInfoDetailsIsDisplayed();

        logger.info("Verifying \"Continue\" button is displaying");
        orderSummaryPageVerifications.verifyContinueButtonIsDisplayed();

        logger.info("Clicking on \"Continue\" button");
        orderSummaryPageActions.tapOnContinueButton("Action Step");

        logger.info("Verifying navigate to \"Select Payment\" page successfully");
        selectPaymentPageVerifications.navToSelectPaymentPageIsDisplayed();
    }

    @Test(description = "Verifying Select Payment Page parameters : ",
            priority = 06,
            enabled = true,
            alwaysRun = true)
    public void page_verification_06_VerifyContentsOfSelectPaymentPageTest() throws IOException, InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifyContentsOfSelectPaymentPage");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        selectPaymentPageVerifications = new SelectPaymentPageVerifications(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);

        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        driver.switchTo().frame("snap-midtrans");
        actionUtils.normailWait(5000);
        orderSummaryPageActions.tapOnContinueButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Verify navigated to \"Select Paymnet\" page");
        selectPaymentPageVerifications.navToSelectPaymentPageIsDisplayed();

        logger.info("Verify \"Credit Card\" text is displaying");
        selectPaymentPageVerifications.verifyCreditCardOptionIsDisplayed();

        logger.info("Verify \"ATM/Bank Transfer\" text is displaying");
        selectPaymentPageVerifications.verifyAtmOrBangTransferOptionIsDisplayed();

        logger.info("Verify \"QR Payment\" text is displaying");
        selectPaymentPageVerifications.verifyQrPaymentOptionIsDisplayed();

        logger.info("Verify \"KlikBCA\" text is displaying");
        selectPaymentPageVerifications.verifyKlikPaymentOptionIsDisplayed();

        logger.info("Verify \"BCA KlikPay\" text is displaying");
        selectPaymentPageVerifications.verifyBCAKlikPayOptionIsDisplayed();

        logger.info("Verify \"Mandiri ClickPay\" text is displaying");
        selectPaymentPageVerifications.verifyMandiriClickPayOptionIsDisplayed();

        actionUtils.scrolltoEnd(driver);
        logger.info("Verify \"CIMB Clicks\" text is displaying");
        selectPaymentPageVerifications.verifyCIMBClicksOptionIsDisplayed();

        logger.info("Verify \"Danamon Online Banking\" text is displaying");
        selectPaymentPageVerifications.verifyDanamonOnlineBankingOptionIsDisplayed();

        logger.info("Verify \"e-Pay BRI\" text is displaying");
        selectPaymentPageVerifications.verifyEPayBRIOptionIsDisplayed();

        logger.info("Verify \"Line Pay e-cash | Mandiri e-cash\" text is displaying");
        selectPaymentPageVerifications.verifyLinePayECashMandiriECashOptionIsDisplayed();

        logger.info("Verify \"Talkomsel Cash\" text is displaying");
        selectPaymentPageVerifications.verifyTalkomselCashOptionIsDisplayed();

        logger.info("Verify \"Indomaret\" text is displaying");
        selectPaymentPageVerifications.verifyIndomaretOptionIsDisplayed();

        logger.info("Verify \"Alfamart\" text is displaying");
        selectPaymentPageVerifications.verifyAlfamartOptionIsDisplayed();

        logger.info("Verify \"Akulaku\" text is displaying");
        selectPaymentPageVerifications.verifyAkulakuOptionIsDisplayed();

        logger.info("Clicking on \"Credit Card\" link");
        selectPaymentPageActions.tapOnCreditCardButton("Action Step");

        logger.info("Verifying navigated to \"Credit Cart\" page");
        creditCardPageVerifications.navToCreditCardPageIsDisplayed();
    }

    @Test(description = "Verifying Select Payment Page parameters : ",
            priority = 07,
            enabled = true,
            alwaysRun = false)
    public void page_verification_07_VerifyContentsOfCreditCardPageTest() throws IOException, InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifyContentsOfCreditCardPage");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        creditCardPageVerifications = new CreditCardPageVerifications(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);

        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        driver.switchTo().frame("snap-midtrans");
        actionUtils.normailWait(5000);
        orderSummaryPageActions.tapOnContinueButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

//
        selectPaymentPageActions.tapOnCreditCardButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        logger.info("Verifying navigated to \"Credit Card\" page");
        creditCardPageVerifications.navToCreditCardPageIsDisplayed();

        logger.info("Verifying \"Coco Store\" text is displaying");
        creditCardPageVerifications.verifyingCocoStoreTextIsDisplayed();

        logger.info("Verifying \"Amount\" text is displaying");
        creditCardPageVerifications.verifyingAmountTextIsDisplayed();

        logger.info("Verifying \"Amount price\" text is displaying");
        creditCardPageVerifications.verifyingPriceDetailsTextIsDisplayed();

        logger.info("Verifying \"Order Id\" text is displaying");
        creditCardPageVerifications.verifyingOrderIdTextIsDisplayed();

        logger.info("Verifying \"Sample Store Id\" text is displaying");
        creditCardPageVerifications.verifyingSampleStoreTextIsDisplayed();

        logger.info("Verifying \"Card Number\" text box is displaying");
        creditCardPageVerifications.navToCreditCardPageIsDisplayed();

        logger.info("Verifying \"Expiry Date\" text box is displaying");
        creditCardPageVerifications.verifyingExpiryDateTexBoxtIsDisplayed();

        logger.info("Verifying \"cvv\" text box is displaying");
        creditCardPageVerifications.verifyingCvvTextBoxIsDisplayed();

        logger.info("Verifying \"Midtrans Secured payment\" text is displaying");
        creditCardPageVerifications.verifyingSecurePaymentOptionTextIsDisplayed();

        logger.info("Verifying \"Logo\" of Midtrans Secured payment is displaying");
        creditCardPageVerifications.verifyingPaymentOptionLogoIsDisplayed();

        logger.info("Verifying \"Select Promo\" text is displaying");
        creditCardPageVerifications.verifyingSelectPromoTextIsDisplayed();

        logger.info("Verifying \"Select Promo Type\" text is displaying");
        creditCardPageVerifications.verifyingPromoTypeOptionsIsDisplayed();

        logger.info("Verifying \"User Details\" text is displaying");
        creditCardPageVerifications.verifyingUserDetailsTextIsDisplayed();

        logger.info("Verifying Important Message text is displaying");
        creditCardPageVerifications.verifyingImportantMessageTextIsDisplayed();

        logger.info("Verifying Important Message text pop-up is displaying");
        creditCardPageVerifications.verifyingImportantMessageTextPopUpIsDisplayed();

        logger.info("Verifying \"Pay Now\" button is displaying");
        creditCardPageVerifications.verifyingPayNowButtonIsDisplayed();

        logger.info("Clicking on \"Pay Now\" button");
        creditCardPageActions.tapOnPayNowButton("Action Step");

    }

    @Test(description = "Verifying all parameters from password page : ",
            priority = 8,
            enabled = true,
            alwaysRun = false)
    public void page_verification_08_VerifyContentsOfPasswordPageTest() throws IOException, InterruptedException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        ExtentTestManager.startTest(methodName, "VerifyContentsOfPasswordPage");
        midtransHomePageActions = new MidtransHomePageActions(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        verifyPasswordPageVerifications = new VerifyPasswordPageVerifications(driver);

        midtransHomePageActions.tapOnBuyNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        shippingCartPageActions.tapOnCheckoutButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        driver.switchTo().frame("snap-midtrans");
        actionUtils.normailWait(5000);
        orderSummaryPageActions.tapOnContinueButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);
        selectPaymentPageActions.tapOnCreditCardButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        creditCardPageActions.tapOnPayNowButton("Action Step");
        actionUtils.implicitlyWait(driver, 5);

        creditCardPageActions.enterCredCardNumber("Action Step");
        creditCardPageActions.enterExpiryDateText("Action Step");
        creditCardPageActions.enterCVVText("Action Steps");
        creditCardPageActions.tapOnPayNowButton("Action Step");
        actionUtils.implicitlyWait(driver,10);

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
}