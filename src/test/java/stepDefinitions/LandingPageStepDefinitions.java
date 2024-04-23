package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

    TestContextSetup testContextSetup;
    LandingPage landingPage;

    public LandingPageStepDefinitions(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
    }

    @Given("T-Mobile landing page is open")
    public void t_mobile_landing_page_is_open() {
        landingPage.openToLandingPage("https://www.t-mobile.pl/");
    }

    @When("Go to smartwatches and bands without subscription")
    public void go_to_smartwatches_and_bands_without_subscription() {
        landingPage.acceptCookies();
        landingPage.goToSmartwatchesAndBands();
    }

    @Then("The landing page is displayed")
    public void the_landing_page_is_displayed() {
        Assert.assertEquals(landingPage.getCurrentUrl(), "https://www.t-mobile.pl/");
    }

    @Then("The quantity of product in the cart is displayed next to the cart icon")
    public void the_quantity_of_product_in_the_cart_is_displayed_next_to_the_cart_icon() {
        String cartCounter = landingPage.getCartCounterValue();
        Assert.assertEquals(cartCounter, "1");
    }
}
