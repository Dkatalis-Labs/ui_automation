package com.activities.page_action;

import com.activities.page_objects.SelectPaymentPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class SelectPaymentPageActions {
    private static Logger logger = Logger.getLogger(SelectPaymentPageActions.class);

    CommonActionUtils actionUtils = null;
    SelectPaymentPageActions selectPaymentPageActions = null;
    SelectPaymentPageObjects selectPaymentPageObjects = null;

    public static WebDriver driver=null;
    public SelectPaymentPageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void tapOnCreditCardButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        logger.info("Clicking on \"Credit Card\" button");
        selectPaymentPageObjects.credit_card_payment_option.get(0).click();
    }

    public void tapOnCloseButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        selectPaymentPageObjects = new SelectPaymentPageObjects(driver);
        selectPaymentPageActions = new SelectPaymentPageActions(driver);
        logger.info("Clicking on \"Close\" button");
        selectPaymentPageObjects.close_page.click();
    }
}