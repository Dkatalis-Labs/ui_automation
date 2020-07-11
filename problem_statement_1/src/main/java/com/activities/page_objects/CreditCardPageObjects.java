package com.activities.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreditCardPageObjects {
    WebDriver driver = null;

    @FindBy(xpath = "//p[contains(text(), 'Credit Card')]")
    public WebElement credit_card_page;

    @FindBy(xpath = "//h1[contains(text(),'COCO STORE')]")
    public WebElement coco_store_text;

    @FindBy(xpath = "//span[contains(text(), 'amount')]")
    public WebElement amount_text;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//div[@class='amount-content pull-right']")
                    }
    )
    public List<WebElement> price_detail_text;

    @FindBy(xpath = "//div/strong[contains(text(), 'Order ID')]")
    public WebElement order_id_text;

    @FindBy(xpath = "//div[contains(text(), 'sample-store')]")
    public WebElement sample_store_text;

    @FindBy(xpath = "//input[@name='cardnumber']")
    public WebElement credit_card_number;

    @FindBy(xpath = "//input[@placeholder='MM / YY']")
    public WebElement card_expire_date;

    @FindBy(xpath = "//input[@inputmode='numeric']")
    public WebElement card_cvv_number;

    @FindBy(xpath = "//span[contains(text(), 'Midtrans secured payments')]")
    public WebElement secured_payment_options_text;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//div[@class='secure-logos']")
                    }
    )
    public List<WebElement> payment_options_logo;

    @FindBy(xpath = "//span[contains(text(), 'Select Promo')]")
    public WebElement select_promo_text;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//div[@class='card-container']/div/div[contains(@class, 'input-group')]")
                    }
    )
    public List<WebElement> promo_container_options;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//div[5]/div[contains(@class, 'input-group')]")
                    }
    )
    public List<WebElement> user_details;

    @FindBy(xpath = "//span/strong[contains(text(), 'IMPORTANT!')]")
    public WebElement important_message_text_popup_bar;

    @FindBy(xpath = "//span[@class= 'sprite modal-close-dark']")
    public WebElement important_message_text_popup_close_button;

    @FindBy(xpath = "//a[@href='#/']")
    public WebElement pay_now_button;

    public CreditCardPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}