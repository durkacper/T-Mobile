package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='didomi-notice-agree-button']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//li/button[contains(text(),'Urządzenia')]")
    private WebElement devices;

    @FindBy(css = "a[data-ga-ea='nav-links - Urządzenia/Smartwatche i opaski/Bez abonamentu']")
    private WebElement smartwatchesAndBandsWithoutSubscription;

    @FindBy(xpath = "(//a[@href='https://www.t-mobile.pl/sklep/basket'])[1]//div")
    private WebElement cartCounter;

    public String getUrl(){
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public String getCartCounterValue(){
        waitUntilElementIsVisible(cartCounter);
        String cartCounterValue = cartCounter.getText();
        return cartCounterValue;
    }

    public LandingPage goToSmartwatchesAndBands(){
        Actions actions = new Actions(driver);
        actions.moveToElement(devices).build().perform();
        smartwatchesAndBandsWithoutSubscription.click();
        return this;
    }

    public LandingPage acceptCookies(){
        waitUntilElementIsVisible(acceptCookies);
        acceptCookies.click();
        return this;
    }

    public String getCurrentUrl(){
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public LandingPage openToLandingPage(String url){
        driver.get(url);
        return this;
    }
}
