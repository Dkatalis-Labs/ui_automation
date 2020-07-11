package com.activities.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPageObjects {
    WebDriver driver = null;

    @FindBy(xpath = "//span[contains(text(), 'Transaction failed')]")
    public WebElement transaction_fail_text;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    public WebElement transaction_success_text;

    @FindBy(xpath = "//span[contains(text(), 'card got declined')]")
    public WebElement transaction_fail_reason;

    @FindBy(xpath = "//div[contains(text(), 'like to retry?')]")
    public WebElement retry_text;

    @FindBy(xpath = "//span[contains(text(), 'Retry')]")
    public WebElement retry_button;

    public TransactionPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
