package com.activities.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class OrderSummaryPageObjects {
    WebDriver driver = null;

    @FindBy(xpath = "//a[@class='header-back']/span[@class='sprite modal-close-dark']")
    public WebElement close_button;

    @FindBy(xpath = "//div/h1[contains(text(), 'COCO STORE')]")
    public WebElement coco_store_text;

    @FindBy(xpath = "//iframe[@id='snap-midtrans']")
    public WebElement iframe_path;

    @FindBy(xpath = "//p[contains(text(), 'Order Summary')]")
    public WebElement order_summary_page;

    @FindBy(xpath = "//span[contains(text(), 'amount')]")
    public WebElement amount_text;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//div[@class='amount-content pull-right']")
                    }
            )
    public List<WebElement> total_prize_value_text;

    @FindBy(xpath = "//div[@class = 'order-id-optional']/strong[contains(text(), 'Order ID')]")
    public WebElement order_id_text;

    @FindBy(xpath = "//div[@class = 'order-id-optional']/div[@class = 'pull-right']")
    public WebElement sample_store_text;

    @FindBy(xpath = "//span[contains(text(), 'order details')]")
    public WebElement order_details;

    @FindBy(xpath = "//th[contains(text(), 'item(s)')]")
    public WebElement order_detail_items_text;

    @FindBy(xpath = "//th[contains(text(), 'amount')]")
    public WebElement order_detail_amount_text;

    @FindBy(xpath = "//span[@class='item-name']")
    public WebElement order_detail_items_info_text;

    @FindBy(xpath = "//td[contains(@class,'table-amount')]")
    public WebElement order_detail_amount_info_text;

    @FindBy(xpath = "//span[contains(text(), 'shipping details')]")
    public WebElement shipping_details;

    @FindBy(xpath = "//div[contains(text(), 'Name')]")
    public WebElement customer_name_title;

    @FindBy(xpath = "//div[contains(text(), 'Phone number')]")
    public WebElement customer_phone_number_title;

    @FindBy(xpath = "//div[contains(text(), 'Email')]")
    public WebElement customer_email_title;

    @FindBy(xpath = "//div[contains(text(), 'Address')]")
    public WebElement customer_address_title;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//div/div[@class='text-body']")
                    }
    )
    public List<WebElement> customer_info_input_text;

    @FindBy(xpath = "//a[@href='#/select-payment']")
    public WebElement continue_button;

    public OrderSummaryPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
