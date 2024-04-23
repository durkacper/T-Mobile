package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.SmartwatchesAndBandsPage;
import utils.TestContextSetup;

public class SmartwatchesAndBandsStepDefinitions {

    TestContextSetup testContextSetup;
    SmartwatchesAndBandsPage smartwatchesAndBandsPage;

    public SmartwatchesAndBandsStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.smartwatchesAndBandsPage = testContextSetup.pageObjectManager.getSmartwatchesAndBandsPage();
    }
    @When("Open a product")
    public void open_a_random_product() {
        smartwatchesAndBandsPage.goToProductPage();
    }
}
