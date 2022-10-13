package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagPage {

    public WebDriver ldriver;
    public TagPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(id = "sort")
    @CacheLookup
    WebElement btnHandPicked;

    @FindBy(xpath = "//*[@id=\"sort\"]/option[2]")
    @CacheLookup
    WebElement TagChanged;


    public void ClickonTag()
    {
        btnHandPicked.click();
    }
    public void TagChangedDone()
    {
        TagChanged.click();
    }

}
