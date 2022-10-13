package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    public WebDriver ldriver;
    public ShoppingCartPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "//*[@id=\"design-row-block\"]/ul/div[1]/div/div/li/div/a/picture/img")
    @CacheLookup
    WebElement BtnShopNow;

    @FindBy(xpath = "//a[@unbxdattr=\"AddToCart\"]")
    @CacheLookup
    WebElement CloseDialog;

    @FindBy(xpath = "(//span[contains(text(),\"Shop Now\")])[2]")
    @CacheLookup
    WebElement BtnShopNowAgain;

    public void ShopNowProduct()
    {
        BtnShopNow.click();
    }
    public void CloseDialogProduct()
    {

    }
    public void ShowNowAgainProduct()
    {

    }

}
