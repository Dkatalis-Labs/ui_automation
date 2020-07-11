package com.activities.page_action;

import com.activities.page_objects.VerifyPasswordPageObjects;
import com.core.propert_reader.PropertyReader;
import com.core.utility.CommonActionUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.Properties;

public class VerifyPasswordPageActions {
    private static Logger logger = Logger.getLogger(VerifyPasswordPageActions.class);
    Properties prop = null;
    PropertyReader propertyReader = null;
    CommonActionUtils actionUtils = null;
    VerifyPasswordPageActions verifyPasswordPageActions = null;
    VerifyPasswordPageObjects verifyPasswordPageObjects = null;

    public static WebDriver driver=null;
    public VerifyPasswordPageActions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterPassword(String password, String ...strings) {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        logger.info("Enter \"Password\" from data provider");
        verifyPasswordPageObjects.password_text_field.clear();
        verifyPasswordPageObjects.password_text_field.sendKeys(password);
    }

    public void enterValidPasswordFromConfig(String ...strings) throws IOException {
        actionUtils = new CommonActionUtils();
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        logger.info("Enter \"Password\" from config property");
        verifyPasswordPageObjects.password_text_field.clear();
        verifyPasswordPageObjects.password_text_field.sendKeys(prop.getProperty("valid_password"));
    }

    public void enterInvalidPasswordFromConfig(String ...strings) throws IOException {
        actionUtils = new CommonActionUtils();
        prop = new Properties();
        propertyReader = new PropertyReader(prop);
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        logger.info("Enter \"Password\" from config property");
        verifyPasswordPageObjects.password_text_field.clear();
        verifyPasswordPageObjects.password_text_field.sendKeys(prop.getProperty("invalid_password"));
    }

    public void tapOnOkButton(String password, String ...strings) {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        logger.info("Clicking on \"Ok\" button");
        verifyPasswordPageObjects.ok_button.click();
    }

    public void tapOnCancelButton(String password, String ...strings) {
        actionUtils = new CommonActionUtils();
        verifyPasswordPageObjects = new VerifyPasswordPageObjects(driver);
        verifyPasswordPageActions = new VerifyPasswordPageActions(driver);
        logger.info("Clicking on \"Cancel\" button");
        verifyPasswordPageObjects.cancel_button.click();
    }
}