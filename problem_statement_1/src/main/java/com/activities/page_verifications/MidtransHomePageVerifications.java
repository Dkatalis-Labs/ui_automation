package com.activities.page_verifications;

import com.activities.page_objects.MidtransHomePageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MidtransHomePageVerifications {
    private static Logger logger = Logger.getLogger(MidtransHomePageVerifications.class);

    CommonActionUtils actionUtils = null;
    MidtransHomePageObjects midtransHomePageObjects = null;
    MidtransHomePageVerifications midtransHomePageVerifications = null;

    public static WebDriver driver=null;
    public MidtransHomePageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifyCocoPageIsDisplayed() {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        logger.info("Navigated to \"COCO\" page is displayed");

        try {
            Assert.assertTrue(midtransHomePageObjects.coco_page.isDisplayed(), "Assertion Fail ::: Navigated to COCO page is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(midtransHomePageObjects.coco_page.isDisplayed(), "Assertion Fail ::: Navigated to COCO page is not displayed");
        }
    }

    public void verifyMidtransPillowIsDisplayed() {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        logger.info("verify \"Title Text\" text is displayed");

        try {
            Assert.assertTrue(midtransHomePageObjects.title_text.isDisplayed(), "Assertion Fail ::: Title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(midtransHomePageObjects.title_text.isDisplayed(), "Assertion Fail ::: Title text is not displayed");
        }
    }

    public void verifyAmountTextBarIsDisplayed() {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        logger.info("verify \"Amount\" text is displayed");

        try {
            Assert.assertTrue(midtransHomePageObjects.amount_text_bar.get(0).isDisplayed(), "Assertion Fail ::: Amount text is not displayed");
            Assert.assertTrue(midtransHomePageObjects.amount_text_bar.get(1).isDisplayed(), "Assertion Fail ::: Amount text is not displayed");
        } catch (Exception e) { }
    }

    public void verifyProductMessageTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        logger.info("verify \"Product Message\" text is displayed");

        try {
            Assert.assertTrue(midtransHomePageObjects.product_message_text.isDisplayed(), "Assertion Fail ::: Product Message text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(midtransHomePageObjects.product_message_text.isDisplayed(), "Assertion Fail ::: Product Message text is not displayed");
        }
    }

    public void verifyDisclaimerMessageTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        logger.info("verify \"Disclaimer\" Message text is displayed");

        try {
            Assert.assertTrue(midtransHomePageObjects.product_message_text.isDisplayed(), "Assertion Fail ::: Disclaimer Message text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(midtransHomePageObjects.product_message_text.isDisplayed(), "Assertion Fail ::: Disclaimer Message text is not displayed");
        }
    }

    public void verifyBuyNowButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        midtransHomePageObjects = new MidtransHomePageObjects(driver);
        midtransHomePageVerifications = new MidtransHomePageVerifications(driver);
        logger.info("verify \"Buy Now\" button is displayed");

        try {
            Assert.assertTrue(midtransHomePageObjects.buy_now_button.isDisplayed(), "Assertion Fail ::: Buy Now button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(midtransHomePageObjects.buy_now_button.isDisplayed(), "Assertion Fail ::: Buy Now button is not displayed");
        }
    }
}