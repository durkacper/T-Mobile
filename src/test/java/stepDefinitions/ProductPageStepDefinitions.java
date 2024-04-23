package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.ProductPage;
import utils.TestContextSetup;

public class ProductPageStepDefinitions {

    TestContextSetup testContextSetup;
    ProductPage productPage;
    public static String priceOnProductPage;
    public static String instalmentOnProductPage;

    public ProductPageStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.productPage = testContextSetup.pageObjectManager.getProductPage();
    }

    @When("Add product to cart")
    public void add_product_to_cart() {
        priceOnProductPage = productPage.getPrice();
        instalmentOnProductPage = productPage.getInstalment();
        productPage.addToCart();
    }
}
