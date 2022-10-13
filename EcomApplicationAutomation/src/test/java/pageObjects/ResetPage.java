package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPage {
    public WebDriver ldriver;
    public ResetPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "//*[@id=\"new_account\"]/fieldset/span/div/a")
    @CacheLookup
    WebElement btnReset;

    @FindBy(id = "account_email")
    @CacheLookup
    WebElement txtboxEmailReset;

    @FindBy(xpath = "//*[@id=\"new_account\"]/div[2]/div/input")
    @CacheLookup
    WebElement btnResetforemail;

    public void clickReset()
    {
        btnReset.click();
    }
    public void EnterEmailForReset(String email)
    {
        txtboxEmailReset.clear();
        txtboxEmailReset.sendKeys("elkhashaby@gmail.com");
    }
    public void ClickResetButton()
    {
        btnResetforemail.click();
    }

}
