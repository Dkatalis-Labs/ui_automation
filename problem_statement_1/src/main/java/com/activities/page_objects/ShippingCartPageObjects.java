package com.activities.page_objects;

import com.core.base_step.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShippingCartPageObjects extends TestBase {
    WebDriver driver = null;

    @FindBy(xpath = "//span[contains(text(), 'Shopping Cart')]")
    public WebElement shipping_cart_page;

    @FindBy(xpath = "//span[@class='label label-primary']")
    public WebElement total_quantity_details;

    @FindBys(
            value =
                    {
                            @FindBy(xpath = "//table[@class='table']/thead/tr/th")
                    }
            )
    public List<WebElement> order_quantity_table;

    @FindBy(xpath = "//td[contains(text(), 'Midtrans Pillow')]")
    public WebElement product_name_text;

    @FindBy(xpath = "//td[contains(text(), '×')]")
    public WebElement product_quantity;

    @FindBy(xpath = "//td[@class='input text-right']")
    public WebElement price_input_text;

    @FindBy(xpath = "//td[@class='total']")
    public WebElement total_text;

    @FindBy(xpath = "//td[@class='amount']")
    public WebElement amount_text;

    @FindBy(xpath = "//div[contains(text(),'Customer Details')]")
    public WebElement customer_details;

    @FindBy(xpath = "//td[contains(text(), 'Name')]")
    public WebElement customer_name_text;

    @FindBy(xpath = "//td[contains(text(),'Email')]")
    public WebElement customer_email_text;

    @FindBy(xpath = "//td/input[@type='email']")
    public WebElement customer_email_text_box;

    @FindBy(xpath = "//td[contains(text(),'Phone no')]")
    public WebElement customer_phone_number_text;

    @FindBy(xpath = "//td[contains(text(),'City')]")
    public WebElement customer_city_text;

    @FindBy(xpath = "//td[contains(text(),'Address')]")
    public WebElement customer_address_text;

    @FindBy(xpath = "//td[@class='input']/textarea")
    public WebElement customer_address_text_box;

    @FindBy(xpath = "//td[contains(text(),'Postal Code')]")
    public WebElement customer_postal_code_text;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//td/input[@type='text']")
                    }
            )
    public List<WebElement> enter_customer_details_to_text_box;

    @FindBy(xpath = "//div[contains(text(), 'CHECKOUT')]")
    public WebElement checkout_button;

    @FindBy(xpath = "//div[@class='cart-checkout-settings']")
    public WebElement setting_button;

    @FindBy(xpath = "//div[@class='cancel-btn']")
    public WebElement cancel_button;

    public ShippingCartPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
