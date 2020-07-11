package com.activities.page_action;

import com.activities.page_objects.CreditCardPageObjects;
import com.core.propert_reader.PropertyReader;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class CreditCardPageActions {
    private static Logger logger = Logger.getLogger(CreditCardPageActions.class);

    Properties prop = null;
    PropertyReader propertyReader = null;
    CommonActionUtils actionUtils = null;
    CreditCardPageActions creditCardPageActions = null;
    CreditCardPageObjects creditCardPageObjects = null;

    public static WebDriver driver=null;
    public CreditCardPageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterCredCardNumberInTextBox(String cardNumber, String ...strings) {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Enetering \"Card Number\"");
        creditCardPageObjects.credit_card_number.sendKeys(cardNumber);
    }

    public void enterExpiryDateTextInTextBox(String expireDate, String ...strings) {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Enetering \"Expire Date\"");
        creditCardPageObjects.card_expire_date.sendKeys(expireDate);
    }

    public void enterCVVTextInTextBox(String cvv, String ...strings) {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Enetering \"CVV\"");
        creditCardPageObjects.card_cvv_number.sendKeys(cvv);
    }

    public void enterCredCardNumber(String ...strings) throws IOException {
        actionUtils = new CommonActionUtils();
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Enetering \"Card Number\"");
        creditCardPageObjects.credit_card_number.sendKeys(prop.getProperty("card_number"));
    }

    public void enterExpiryDateText(String ...strings) throws IOException {
        actionUtils = new CommonActionUtils();
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Enetering \"Expire Date\"");
        creditCardPageObjects.card_expire_date.sendKeys(prop.getProperty("expiry_date"));
    }

    public void enterCVVText(String ...strings) throws IOException {
        actionUtils = new CommonActionUtils();
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Enetering \"CVV\"");
        creditCardPageObjects.card_cvv_number.sendKeys(prop.getProperty("cvv"));
    }

    public void tapOnPayNowButton(String ...strings) {
        actionUtils = new CommonActionUtils();
        creditCardPageObjects = new CreditCardPageObjects(driver);
        creditCardPageActions = new CreditCardPageActions(driver);
        logger.info("Clicking on \"Pay Now\" button");
        creditCardPageObjects.pay_now_button.click();
    }
}
