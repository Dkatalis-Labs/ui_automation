package com.activities.page_action;

import com.activities.page_objects.OrderSummaryPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPageActions {
    private static Logger logger = Logger.getLogger(OrderSummaryPageActions.class);

    CommonActionUtils actionUtils = null;
    OrderSummaryPageActions orderSummaryPageActions = null;
    OrderSummaryPageObjects orderSummaryPageObjects = null;

    public static WebDriver driver=null;
    public OrderSummaryPageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void tapOnShippingDetailsButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        logger.info("Clicking on \"Checkout\" button");
        orderSummaryPageObjects.shipping_details.click();
    }

    public void tapOnContinueButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageActions = new OrderSummaryPageActions(driver);
        logger.info("Clicking on \"Continue\" button");
        orderSummaryPageObjects.continue_button.click();
    }
}