package com.activities.page_action;

import com.activities.page_objects.ShippingCartPageObjects;
import com.activities.page_objects.TransactionPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class TransactionPageActions {
    private static Logger logger = Logger.getLogger(TransactionPageActions.class);

    CommonActionUtils actionUtils = null;
    TransactionPageActions transactionPageActions = null;
    TransactionPageObjects transactionPageObjects = null;

    public static WebDriver driver=null;
    public TransactionPageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void tapOnCheckoutButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        transactionPageObjects = new TransactionPageObjects(driver);
        transactionPageActions = new TransactionPageActions(driver);
        logger.info("Clicking on \"Retry\" button");
        transactionPageObjects.retry_button.click();
    }
}
