package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
    public WebDriver ldriver;
    public CategoryPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "(//*[contains(text(),\"Lehenga Choli\")])[4]")
    @CacheLookup
    WebElement LehngaCholiCategory;

    @FindBy(xpath = "//*[contains(text(),\"Bridal Lehengas\")]")
    @CacheLookup
    WebElement BridalLehngaCholiCategory;


    public void SelectCholiCategory()
    {
        LehngaCholiCategory.click();
    }
    public void SelectBridalCategory()
    {
        BridalLehngaCholiCategory.click();
    }

}
