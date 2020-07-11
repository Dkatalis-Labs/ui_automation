package com.activities.page_objects;

import com.core.base_step.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MidtransHomePageObjects extends TestBase {
    WebDriver driver = null;

    @FindBy(xpath = "//a[contains(text(), 'Coco')]")
    public WebElement coco_page;

    @FindBy(xpath = "//*[@class='title']")
    public WebElement title_text;

    @FindBy(xpath = "//*[@class='btn buy']")
    public WebElement buy_now_button;

    @FindBys(
            value =
                    {
                            @FindBy(xpath = "//div[@class='price']/span")
                    }
            )
    public List<WebElement> amount_text_bar;

    @FindBy(xpath = "//span[contains(text(),'Get cozy with our new pillow!')]")
    public WebElement product_message_text;

    @FindBy(xpath = "//div[@class='desc']/i/text()")
    public WebElement disclaimer_text;

    public MidtransHomePageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}