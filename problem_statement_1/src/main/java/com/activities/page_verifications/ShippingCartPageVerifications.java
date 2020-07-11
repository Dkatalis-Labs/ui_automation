package com.activities.page_verifications;

import com.activities.page_objects.ShippingCartPageObjects;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShippingCartPageVerifications {
    private static Logger logger = Logger.getLogger(ShippingCartPageVerifications.class);

    CommonActionUtils actionUtils = null;
    ShippingCartPageVerifications shippingCartPageVerifications = null;
    ShippingCartPageObjects shippingCartPageObjects = null;

    public static WebDriver driver=null;
    public ShippingCartPageVerifications(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifyShippingPageIsDisplayed() {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("Navigated to \"Shipping Cart\" page");

        try {
            Assert.assertTrue(shippingCartPageObjects.shipping_cart_page.isDisplayed(), "Assertion Fail ::: Shipping Cart page is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.shipping_cart_page.isDisplayed(), "Assertion Fail ::: Shipping Cart page is not displayed");
        }
    }

    public void verifyTotalQuantityTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify \"Product Quantities\" text");

        try {
            Assert.assertTrue(shippingCartPageObjects.total_quantity_details.isDisplayed(), "Assertion Fail ::: verify Total Quantity details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.total_quantity_details.isDisplayed(), "Assertion Fail ::: verify Total Quantity details text is not displayed");
        }
    }

    public void verifyOrderQuantitiesTableIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Order Quantities from Table is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.order_quantity_table.get(0).isDisplayed(), "Assertion Fail ::: verify Order Quantity details table is not displayed");
            Assert.assertTrue(shippingCartPageObjects.order_quantity_table.get(1).isDisplayed(), "Assertion Fail ::: verify Order Quantity details table is not displayed");
            Assert.assertTrue(shippingCartPageObjects.order_quantity_table.get(2).isDisplayed(), "Assertion Fail ::: verify Order Quantity details table is not displayed");
        } catch (Exception e) { }
    }

    public void verifyOrderedItemNameIsTextDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Product name is displaying");

        try {
            Assert.assertTrue(shippingCartPageObjects.product_name_text.isDisplayed(), "Assertion Fail ::: verify product Name text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.product_name_text.isDisplayed(), "Assertion Fail ::: verify product Name text is not displayed");
        }
    }

    public void verifyOrderedItemQuantityTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify product Quantity is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.product_quantity.isDisplayed(), "Assertion Fail ::: verify Order Quantity number is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.product_quantity.isDisplayed(), "Assertion Fail ::: verify Order Quantity number is not displayed");
        }
    }

    public void verifyPriceTextBoxIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Total amount text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.price_input_text.isDisplayed(), "Assertion Fail ::: verify Prize text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.price_input_text.isDisplayed(), "Assertion Fail ::: verify Prize text box is not displayed");
        }
    }

    public void verifyTotalTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Total text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.total_text.isDisplayed(), "Assertion Fail ::: verify Total text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.total_text.isDisplayed(), "Assertion Fail ::: verify Total text is not displayed");
        }
    }

    public void verifyTotalAmountTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify total amount is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: verify Total Amount text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.amount_text.isDisplayed(), "Assertion Fail ::: verify Total Amount text is not displayed");
        }
    }

    public void verifyCustomerDetailsTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Customer Details text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_details.isDisplayed(), "Assertion Fail ::: verify Customer details text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_details.isDisplayed(), "Assertion Fail ::: verify Customer details text is not displayed");
        }
    }

    public void verifyNameTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Name text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_name_text.isDisplayed(), "Assertion Fail ::: verify Name text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_name_text.isDisplayed(), "Assertion Fail ::: verify Name text is not displayed");
        }
    }

    public void verifyEmailTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Email text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_email_text.isDisplayed(), "Assertion Fail ::: verify Email text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_email_text.isDisplayed(), "Assertion Fail ::: verify Email text is not displayed");
        }
    }

    public void verifyEmailTextBoxIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Email text box is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_email_text_box.isDisplayed(), "Assertion Fail ::: verify Email text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_email_text_box.isDisplayed(), "Assertion Fail ::: verify Email text box is not displayed");
        }
    }

    public void verifyPhoneNumberTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Phone Number text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_phone_number_text.isDisplayed(), "Assertion Fail ::: verify Phone Number text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_phone_number_text.isDisplayed(), "Assertion Fail ::: verify Phone Number text is not displayed");
        }
    }

    public void verifyCityTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify City text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_city_text.isDisplayed(), "Assertion Fail ::: verify City text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_city_text.isDisplayed(), "Assertion Fail ::: verify City text is not displayed");
        }
    }

    public void verifyAddressTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Address text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_address_text.isDisplayed(), "Assertion Fail ::: verify Address text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_address_text.isDisplayed(), "Assertion Fail ::: verify Address text is not displayed");
        }
    }

    public void verifyAddressTextBoxIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Address text box is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.customer_address_text_box.isDisplayed(), "Assertion Fail ::: verify Address text box is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_address_text_box.isDisplayed(), "Assertion Fail ::: verify Address text box is not displayed");
        }
    }

    public void verifyPostalCodeTextIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Postal Code text is displayed");
        actionUtils.scrolltoEnd(driver);
        try {
            Assert.assertTrue(shippingCartPageObjects.customer_postal_code_text.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.customer_postal_code_text.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        }
    }

    public void verifyCustomerDetailInputTextBoxIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Customer Details input Text Box i.e (Customer -- <Name>, <Phone No>, <City> & <Postal Code>) is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.enter_customer_details_to_text_box.get(0).isDisplayed(), "Assertion Fail ::: verify Customer Name text box is not displayed");
            Assert.assertTrue(shippingCartPageObjects.enter_customer_details_to_text_box.get(1).isDisplayed(), "Assertion Fail ::: verify Customer Email text box is not displayed");
            Assert.assertTrue(shippingCartPageObjects.enter_customer_details_to_text_box.get(2).isDisplayed(), "Assertion Fail ::: verify Customer Phone No text box is not displayed");
            Assert.assertTrue(shippingCartPageObjects.enter_customer_details_to_text_box.get(3).isDisplayed(), "Assertion Fail ::: verify Customer Postal Code text box is not displayed");
        } catch (Exception e) { }
    }

    public void verifyCheckoutButtontIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Postal Code text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.checkout_button.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.checkout_button.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        }
    }

    public void verifySettingButtonIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Postal Code text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.setting_button.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.setting_button.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        }
    }

    public void verifyCancelButtonIsDisplayed(String ...strings) {
        actionUtils = new CommonActionUtils();
        shippingCartPageObjects = new ShippingCartPageObjects(driver);
        shippingCartPageVerifications = new ShippingCartPageVerifications(driver);
        logger.info("verify Postal Code text is displayed");

        try {
            Assert.assertTrue(shippingCartPageObjects.cancel_button.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        } catch (Exception e) {
            Assert.assertTrue(shippingCartPageObjects.cancel_button.isDisplayed(), "Assertion Fail ::: verify Postal Code text is not displayed");
        }
    }
}