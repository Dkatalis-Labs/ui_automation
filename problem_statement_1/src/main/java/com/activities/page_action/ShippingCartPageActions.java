package com.activities.page_action;

import com.activities.page_objects.ShippingCartPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ShippingCartPageActions {
    private static Logger logger = Logger.getLogger(ShippingCartPageActions.class);

    CommonActionUtils actionUtils = null;
    ShippingCartPageActions shippingCartPageActions = null;
    ShippingCartPageObjects shippingCartPageObjects = null;

    public static WebDriver driver=null;
    public ShippingCartPageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void tapOnCheckoutButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        logger.info("Clicking on \"Checkout\" button");
        shippingCartPageObjects.checkout_button.click();
    }

    public void tapOnCancelButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageActions = new ShippingCartPageActions(driver);
        logger.info("Clicking on \"Cancel\" button");
        shippingCartPageObjects.cancel_button.click();
    }
}
