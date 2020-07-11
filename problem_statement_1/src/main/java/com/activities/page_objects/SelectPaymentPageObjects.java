package com.activities.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectPaymentPageObjects {
    WebDriver driver = null;

    @FindBy(xpath = "//p[contains(text(), 'Select Payment')]")
    public WebElement select_payment_page;

    @FindBy(xpath = "//h1[contains(text(),'COCO STORE')]")
    public WebElement coco_store_text;

    @FindBy(xpath = "//a[@class='touch-area']/span")
    public WebElement close_page;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@class = 'list with-promo' and @href = '#/credit-card']")
                    }
    )
    public List<WebElement> credit_card_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "a[@href = '#/bank-transfer']")
                    }
    )
    public List<WebElement> atm_bank_transfer_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/qris']")
                    }
    )
    public List<WebElement> qr_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/bca-klikbca']")
                    }
    )
    public List<WebElement> klikbca_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/bca-klikpay']")
                    }
    )
    public List<WebElement> bca_klil_pay_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/mandiri-clickpay']")
                    }
    )
    public List<WebElement> mandiri_click_pay_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/cimb-clicks']")
                    }
    )
    public List<WebElement> cimb_clicks_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/danamon-online']")
                    }
    )
    public List<WebElement> danamon_online_banking_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/bri-epay']")
                    }
    )
    public List<WebElement> epay_bri_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/mandiri-ecash']")
                    }
    )
    public List<WebElement> line_pay_or_mandiri_ecash_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/telkomsel-cash']")
                    }
    )
    public List<WebElement> telkomsel_case__payment_option;
    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/indomaret']")
                    }
    )
    public List<WebElement> indomaret_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/alfamart']")
                    }
    )
    public List<WebElement> alfamart_payment_option;

    @FindBys(
            value =
                    {
                            @FindBy (xpath = "//a[@href = '#/akulaku']")
                    }
    )
    public List<WebElement> akulaku_payment_option;

    public SelectPaymentPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
