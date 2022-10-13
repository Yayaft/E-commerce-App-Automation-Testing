package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyPage {
    public WebDriver ldriver;
    public CurrencyPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "//*[@id=\"megamenu-m\"]/div/ul/li[1]/a")
    @CacheLookup
    WebElement CurrencyClick;

    public void SearchWithProduct()
    {
        CurrencyClick.click();
    }

}
