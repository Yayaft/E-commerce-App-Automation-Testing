package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorPage {
    public WebDriver ldriver;
    public ColorPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "//input[@placeholder=\"Search Lehenga Color\"]")
    @CacheLookup
    WebElement ColorOneSelect;

    @FindBy(xpath = "//span[@class=\"color-circle\"]")
    @CacheLookup
    WebElement ColorSecond;


    public void SelectColorCategory()
    {
        ColorOneSelect.clear();
        ColorOneSelect.sendKeys("Pink");
    }
    public void SelectsecColorCategory()
    {
        //ColorSecond.click();
    }

}
