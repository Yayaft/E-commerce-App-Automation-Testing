package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.*;

public class Steps extends Base {


    @Given("The user launch Chrome browser")
    public void the_user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Rp = new RegisterPage(driver);
    }

    @When("The user opens URL {string}")
    public void the_user_opens_url(String url) {
        driver.get(url);
    }

    @And("User enters Email as {string} Password as {string} and confirm Password as {string}")
    public void user_enters_email_as_password_as_and_confirm_password_as(String email, String password, String cpassword) {
        Rp.setUserName(email);
        Rp.setPassword(password);
        Rp.SetConfirmPassword(cpassword);
    }

    @And("The user clicks on Register")
    public void the_user_clicks_on_register() {
        Rp.clickRegsiter();
    }

    @And("Page Title should be {string}")
    public void Page_Title_should_be(String title) {

        Assert.assertNotEquals(title, driver.getTitle());
    }

    @Then("User registered successfullyy")
    public void user_registered_successfullyy() {
        driver.quit();
    }

    @When("The User enters Email as {string} and Password as {string}")
    public void the_user_enters_email_as_and_password_as(String Lemail, String Lpassword) {
        Lp = new LoginPage(driver);
        Lp.setLoginUserName(Lemail);
        Lp.setLoginPassword(Lpassword);
    }

    @When("The user clicks on Login")
    public void the_user_clicks_on_login() {
        Lp.CLickonButton();
    }

    @Then("User Login successfully")
    public void user_login_successfully() {

    }


    @When("The user clicks on Forgot password")
    public void the_user_clicks_on_forgot_password() {
        Rep = new ResetPage(driver);
        Rep.clickReset();

    }

    @When("The user enters the email as {string}")
    public void the_user_enters_the_email_as(String string) {
        Rep.EnterEmailForReset(string);
    }

    @When("The user clicks on Send reset password instructions")
    public void the_user_clicks_on_send_reset_password_instructions() {
        Rep.ClickResetButton();
    }

    @Then("User password reset successfully")
    public void user_password_reset_successfully() {

    }


    //SC4
    @When("User search with {string}")
    public void user_search_with(String string) {
        Sp = new SearchPage(driver);
        Sp.SearchWithProduct(string);
    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        Sp.ClickonSearchbutton();
    }

    @Then("Product result will come")
    public void product_result_will_come() {

    }


    @When("Currency switching is performed")
    public void currency_switching_is_performed() {
        cp = new CurrencyPage(driver);
        cp.SearchWithProduct();
    }

    @Then("Currency is changed")
    public void currency_is_changed() {

    }


    //SC6
    @When("User selects Category checkbox of choli")
    public void user_selects_category_checkbox_of_choli() {
        catp = new CategoryPage(driver);
        catp.SelectCholiCategory();
    }

    @When("User selects Category for Readymade")
    public void user_selects_category_for_readymade() {
        catp.SelectBridalCategory();
    }

    @Then("Results will appear")
    public void results_will_appear() {

    }

    //SC7
    @When("User clicks on a color one")
    public void user_clicks_on_a_color_one() {
        clrP = new ColorPage(driver);
        clrP.SelectColorCategory();
    }

    @When("User clicks on a color two")
    public void user_clicks_on_a_color_two() {
        clrP.SelectsecColorCategory();
    }

    @Then("Color Results will appear")
    public void color_results_will_appear() {


    }

    //SC8
    @When("User selects the tag button")
    public void user_selects_the_tag_button() {
        Tp = new TagPage(driver);
        Tp.ClickonTag();
    }

    @When("User Selects popularity from tag")
    public void user_selects_popularity_from_tag() {
        Tp.TagChangedDone();
    }

    @Then("Tag selected successfully")
    public void tag_selected_successfully() {

    }

    //SC9

    @When("User adds product in a Shopping cart")
    public void user_adds_product_in_a_shopping_cart() {
        shp = new ShoppingCartPage(driver);
        shp.ShopNowProduct();
    }

    @When("User closes the dialog box")
    public void user_closes_the_dialog_box() {
        shp.CloseDialogProduct();
    }

    @When("User again add different product in shopping cart")
    public void user_again_add_different_product_in_shopping_cart() {
        shp.ShowNowAgainProduct();
    }

    @When("User again closes the dialog box")
    public void user_again_closes_the_dialog_box() {
        shp.CloseDialogProduct();
    }

    @Then("Different products can be in the Shopping cart")
    public void different_products_can_be_in_the_shopping_cart() {

    }

    //SC10
    @When("User clicks on wishlist")
    public void user_clicks_on_wishlist() {
        wp = new WishlistPage(driver);
        wp.SelectWishListItem();
    }

    @When("User clicks on another wishlist")
    public void user_clicks_on_another_wishlist() {
        wp.SelectWishSecondListItem();
    }

    @Then("User can see wishlist items")
    public void user_can_see_wishlist_items() {

    }
    //SC12

    @When("User clicks on purchase product")
    public void user_clicks_on_purchase_product() {
        op = new OrderPage(driver);
        op.SelectProductforCheckou();
    }

    @When("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        op.SelectProductforCheckoutandAdd();
    }

    @When("User clicks on checkout")
    public void user_clicks_on_checkout() {
        op.Payment();
    }

    @Then("Order placed successfully")
    public void order_placed_successfully() {

    }

}
