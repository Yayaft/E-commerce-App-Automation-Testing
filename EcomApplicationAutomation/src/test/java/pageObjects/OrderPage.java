package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class OrderPage {
    public WebDriver ldriver;
    public OrderPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "//*[@id=\"design-row-block\"]/ul/div[2]/div/div/li/div/a")
    @CacheLookup
    WebElement ProductCheckout;

    @FindBy(xpath = "//a[@unbxdattr=\"AddToCart\"]")
    @CacheLookup
    WebElement ProductAddtoCart;

    @FindBy(id = "checkout")
    @CacheLookup
    WebElement Payment;

    public void SelectProductforCheckou()
    {
        ProductCheckout.click();
    }
    public void SelectProductforCheckoutandAdd()
    {

//        String originalWindow = ldriver.getWindowHandle();
//        for (String windowHandle : ldriver.getWindowHandles()) {
//            if (!originalWindow.contentEquals(windowHandle)) {
//                ldriver.switchTo().window(windowHandle);
//                break;
//            }
//        }
//
//        ProductAddtoCart.click();
    }
    public void Payment()
    {
        //payment.click();
    }

}
