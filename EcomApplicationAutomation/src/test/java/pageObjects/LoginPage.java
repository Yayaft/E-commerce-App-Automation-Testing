package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(id = "account_email")
    @CacheLookup
    WebElement txtLoginEmail;

    @FindBy(id = "account_password")
    @CacheLookup
    WebElement txtLoginPassword;

    @FindBy(name = "commit")
    @CacheLookup
    WebElement btnLogin;

    public void setLoginUserName(String uname)
    {
        txtLoginEmail.clear();
        txtLoginEmail.sendKeys("elkhashaby@gmail.com");
    }
    public void setLoginPassword(String password)
    {
        txtLoginPassword.clear();
        txtLoginPassword.sendKeys("Welcome@123");
    }
    public void CLickonButton()
    {
        btnLogin.click();
    }


}
