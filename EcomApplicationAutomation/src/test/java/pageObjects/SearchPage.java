package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public WebDriver ldriver;
    public SearchPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(id = "unbxd_autosuggest_field")
    @CacheLookup
    WebElement btnSerach;

    @FindBy(xpath = "//*[@id=\"tfheader\"]/form/input[3]")
    @CacheLookup
    WebElement clickSearchbutton;

    public void SearchWithProduct(String product)
    {
        btnSerach.clear();
        btnSerach.sendKeys(product);
    }

    public void ClickonSearchbutton()
    {
        clickSearchbutton.click();
    }


}
