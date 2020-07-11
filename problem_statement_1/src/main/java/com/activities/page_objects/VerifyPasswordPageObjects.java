package com.activities.page_objects;

import com.core.base_step.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPasswordPageObjects extends TestBase {
    WebDriver driver = null;

    @FindBy(xpath = "//h1[contains(text(), 'Issuing Bank')]")
    public WebElement issuing_bank_text;

    @FindBy(xpath = "//span[@class='help-block']")
    public WebElement transaction_complete_message;

    @FindBy(xpath = "//span[contains(text(), 'Transaction time left')]")
    public WebElement transaction_time_left_text;

    @FindBy(xpath = "//label[contains(text(), 'Merchant Name:')]")
    public WebElement merchant_name;

    @FindBy(xpath = "//p[@id='merchant_name']")
    public WebElement merchant_name_detail;

    @FindBy(xpath = "//label[contains(text(), 'Amount:')]")
    public WebElement amount_text;

    @FindBy(xpath = "//p[@id='txn_amount']")
    public WebElement transaction_total_amount;

    @FindBy(xpath = "//label[contains(text(), 'Transaction Time:')]")
    public WebElement transaction_time;

    @FindBy(xpath = "//p[@id='txn_time']")
    public WebElement transaction_time_details;

    @FindBy(xpath = "//label[contains(text(), 'Card Number:')]")
    public WebElement card_number_text;

    @FindBy(xpath = "//p[@id='card_number']")
    public WebElement card_number_detail;

    @FindBy(xpath = "//label[contains(text(), 'Password:')]")
    public WebElement pasword_text;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password_text_field;

    @FindBy(xpath = "//button[@name='ok']")
    public WebElement ok_button;

    @FindBy(xpath = "//button[@name='cancel']")
    public WebElement cancel_button;

    @FindBy(xpath = "//button[@name='resend']")
    public WebElement resend_button;

    @FindBy(xpath = "//i[@class='icon xmark']")
    public WebElement close_button;

    public VerifyPasswordPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
