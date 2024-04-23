package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.CartPage;
import utils.TestContextSetup;

public class CartPageStepDefinitions {

    TestContextSetup testContextSetup;
    CartPage cartPage;

    public CartPageStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.cartPage = testContextSetup.pageObjectManager.getCartPage();
    }

    @Then("The price and instalment value on the cart page are the same as on the product page")
    public void the_price_and_instalment_value_on_the_cart_page_are_the_same_as_on_the_product_page() {
        String priceInCart = cartPage.getPriceInCart();
        String instalmentInCart = cartPage.getInstalmentInCart();

        Assert.assertEquals(priceInCart, ProductPageStepDefinitions.priceOnProductPage);
        Assert.assertEquals(instalmentInCart, ProductPageStepDefinitions.instalmentOnProductPage);
    }

    @Then("The cart page is displayed")
    public void the_cart_page_is_displayed(){
        Assert.assertEquals(cartPage.getCartHeader(), "Twój koszyk");
    }

    @When("Go to the landing page")
    public void go_to_the_landing_page() {
        cartPage.goToLandingPage();
    }
}
