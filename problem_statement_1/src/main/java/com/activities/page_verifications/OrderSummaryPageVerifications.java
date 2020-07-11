package com.activities.page_verifications;

import com.activities.page_objects.OrderSummaryPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderSummaryPageVerifications {
    private static Logger logger = Logger.getLogger(OrderSummaryPageVerifications.class);

    CommonActionUtils actionUtils = null;
    OrderSummaryPageVerifications orderSummaryPageVerifications = null;
    OrderSummaryPageObjects orderSummaryPageObjects = null;

    public static WebDriver driver=null;
    public OrderSummaryPageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifyCloseButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Clicking on close Button");

        try {
            Assert.assertTrue(orderSummaryPageObjects.close_button.isDisplayed(), "Assertion Fail ::: Close button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.close_button.isDisplayed(), "Assertion Fail ::: Close button is not displayed");
        }
    }

    public void verifyCocoStoreTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("COCO Store text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.coco_store_text.isDisplayed(), "Assertion Fail ::: Coco Store text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.coco_store_text.isDisplayed(), "Assertion Fail ::: Coco Store text is not displayed");
        }
    }

    public void verifyOrderSummaryPageIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Summary text is displayed");
        actionUtils.switchToFrame(driver, orderSummaryPageObjects.iframe_path);
        try {
            Assert.assertTrue(orderSummaryPageObjects.order_summary_page.isDisplayed(), "Assertion Fail ::: Order Summary page is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_summary_page.isDisplayed(), "Assertion Fail ::: Order Summary page is not displayed");
        }
    }

    public void verifyAmountTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Amount text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: Amount text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: Amount text is not displayed");
        }
    }

    public void verifyAmountPriceTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Amount Price text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.total_prize_value_text.get(0).isDisplayed(), "Assertion Fail ::: Amount Type text is not displayed");
            Assert.assertTrue(orderSummaryPageObjects.total_prize_value_text.get(1).isDisplayed(), "Assertion Fail ::: Amount Price text is not displayed");
        } catch (Exception e) { }
    }

    public void verifyOrderIdTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Id text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.order_id_text.isDisplayed(), "Assertion Fail ::: Order Id text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_id_text.isDisplayed(), "Assertion Fail ::: Order Id text is not displayed");
        }
    }

    public void verifySampleOrderIdTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Sample Store text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.sample_store_text.isDisplayed(), "Assertion Fail ::: Sample Store text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.sample_store_text.isDisplayed(), "Assertion Fail ::: Sample Store text is not displayed");
        }
    }

    public void verifyOrderDetailsTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Details text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.order_details.isDisplayed(), "Assertion Fail ::: Order Details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_details.isDisplayed(), "Assertion Fail ::: Order Details text is not displayed");
        }
    }

    public void verifyOrderDetailItemsTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Details Items text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_items_text.isDisplayed(), "Assertion Fail ::: Order Details Items text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_items_text.isDisplayed(), "Assertion Fail ::: Order Details Items text is not displayed");
        }
    }

    public void verifyOrderDetailAmountTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Details Amount text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_amount_text.isDisplayed(), "Assertion Fail ::: Order Details Amount text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_amount_text.isDisplayed(), "Assertion Fail ::: Order Details Amount text is not displayed");
        }
    }

    public void verifyOrderDetailItemsInformationTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Details Items Info text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_items_info_text.isDisplayed(), "Assertion Fail ::: Order Details Items Info text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_items_info_text.isDisplayed(), "Assertion Fail ::: Order Details Items Info text is not displayed");
        }
    }

    public void verifyOrderDetailAmountInformationTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Order Details Amount Info text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_amount_info_text.isDisplayed(), "Assertion Fail ::: Order Details Amount Info text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.order_detail_amount_info_text.isDisplayed(), "Assertion Fail ::: Order Details Amount Info text is not displayed");
        }
    }

    public void verifyShippingDetailTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Shipping Details text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.shipping_details.isDisplayed(), "Assertion Fail ::: Shipping Details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.shipping_details.isDisplayed(), "Assertion Fail ::: Shipping Details text is not displayed");
        }
    }

    public void verifyCustomerNameTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Customer Name text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.customer_name_title.isDisplayed(), "Assertion Fail ::: Customer Name title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.customer_name_title.isDisplayed(), "Assertion Fail ::: Customer Name title text is not displayed");
        }
    }

    public void verifyCustomerPhoneNumberTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Customer Phone Number text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.customer_phone_number_title.isDisplayed(), "Assertion Fail ::: Customer Phone Number title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.customer_phone_number_title.isDisplayed(), "Assertion Fail ::: Customer Phone Number title text is not displayed");
        }
    }

    public void verifyCustomerEmailTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Customer Email text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.customer_email_title.isDisplayed(), "Assertion Fail ::: Customer Email title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.customer_email_title.isDisplayed(), "Assertion Fail ::: Customer Email title text is not displayed");
        }
    }

    public void verifyCustomerAddressTitleTextIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Customer Address text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.customer_address_title.isDisplayed(), "Assertion Fail ::: Customer Address title text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.customer_address_title.isDisplayed(), "Assertion Fail ::: Customer Address title text is not displayed");
        }
    }

    public void verifyCustomerInfoDetailsIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Customer Address text is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.customer_info_input_text.get(0).isDisplayed(), "Assertion Fail ::: Customer Name is not displayed");
            Assert.assertTrue(orderSummaryPageObjects.customer_info_input_text.get(1).isDisplayed(), "Assertion Fail ::: Customer Phone Number text is not displayed");
            Assert.assertTrue(orderSummaryPageObjects.customer_info_input_text.get(2).isDisplayed(), "Assertion Fail ::: Customer Email is not displayed");
            Assert.assertTrue(orderSummaryPageObjects.customer_info_input_text.get(3).isDisplayed(), "Assertion Fail ::: Customer Address text is not displayed");
        } catch (Exception e) { }
    }

    public void verifyContinueButtonIsDisplayed() {
        actionUtils = new CommonActionUtils();
        orderSummaryPageObjects = new OrderSummaryPageObjects(driver);
        orderSummaryPageVerifications = new OrderSummaryPageVerifications(driver);
        logger.info("Continue Button is displayed");

        try {
            Assert.assertTrue(orderSummaryPageObjects.continue_button.isDisplayed(), "Assertion Fail ::: Continue Button is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(orderSummaryPageObjects.continue_button.isDisplayed(), "Assertion Fail ::: Continue Button is not displayed");
        }
    }
}
