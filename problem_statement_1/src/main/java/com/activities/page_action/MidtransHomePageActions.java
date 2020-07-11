package com.activities.page_action;

import com.activities.page_objects.MidtransHomePageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class MidtransHomePageActions {
    private static Logger logger = Logger.getLogger(MidtransHomePageActions.class);

    CommonActionUtils actionUtils = null;
    MidtransHomePageObjects midtransHomePageObjects = null;
    MidtransHomePageActions midtransHomePageActions = null;

    public static WebDriver driver=null;
    public MidtransHomePageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void tapOnBuyNowButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageActions = new MidtransHomePageActions(driver);
        logger.info("Clicking on \"Buy Now\" button");
        midtransHomePageObjects.buy_now_button.click();
    }
}
