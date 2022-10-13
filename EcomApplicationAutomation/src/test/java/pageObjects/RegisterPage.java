package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public WebDriver driver;
    public RegisterPage(WebDriver ldriver)
    {
            driver = ldriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(id = "account_email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "account_password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(id = "account_password_confirmation")
    @CacheLookup
    WebElement txtConfirmPassword;

    @FindBy(name = "commit")
    @CacheLookup
    WebElement btnRegister;

    public void setUserName(String uname)
    {
        txtEmail.clear();
        txtEmail.sendKeys("elkhashaby1@gmail.com");
    }
    public void setPassword(String password)
    {
        txtPassword.clear();
        txtPassword.sendKeys("Welcome@123");
    }
    public void SetConfirmPassword(String cpassword)
    {
        txtConfirmPassword.clear();
        txtConfirmPassword.sendKeys("Welcome@123");
    }
    public void clickRegsiter()
    {
        btnRegister.click();
    }

}
