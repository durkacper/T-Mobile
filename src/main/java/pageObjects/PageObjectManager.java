package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public LandingPage landingPage;
    public ProductPage productPage;
    public CartPage cartPage;
    public SmartwatchesAndBandsPage smartwatchesAndBandsPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage getLandingPage(){
       landingPage = new LandingPage(driver);
       return landingPage;
    }

    public ProductPage getProductPage(){
        productPage = new ProductPage(driver);
        return productPage;
    }

    public CartPage getCartPage(){
        cartPage = new CartPage(driver);
        return cartPage;
    }

    public SmartwatchesAndBandsPage getSmartwatchesAndBandsPage(){
        smartwatchesAndBandsPage = new SmartwatchesAndBandsPage(driver);
        return smartwatchesAndBandsPage;
    }
}
