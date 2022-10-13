package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
    public WebDriver ldriver;
    public WishlistPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "//button[@title=\"Add To Wishlist\"]/span")
    @CacheLookup
    WebElement btnWishlistItem;

    @FindBy(xpath = "(//button[@title=\"Add To Wishlist\"]/span)[2]")
    @CacheLookup
    WebElement btnWishListItemSecond;


    public void SelectWishListItem()
    {

    }
    public void SelectWishSecondListItem()
    {

    }

}
