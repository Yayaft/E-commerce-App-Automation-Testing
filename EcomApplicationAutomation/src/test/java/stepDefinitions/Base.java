package stepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.tools.ant.taskdefs.condition.Or;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class Base {
    public WebDriver driver;
    public RegisterPage Rp;
    public LoginPage Lp;

    public ResetPage Rep;

    public SearchPage Sp;

    public CurrencyPage cp;

    public CategoryPage catp;

    public ColorPage clrP;

    public TagPage Tp;

    public WishlistPage wp;

    public ShoppingCartPage shp;

    public OrderPage op;

    public static String randomString() {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }
}
