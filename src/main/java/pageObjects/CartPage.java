package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span[data-qa='BKT_TotalupFront']")
    private WebElement price;

    @FindBy(css = "span[data-qa='BKT_TotalMonthly']")
    private WebElement instalment;

    @FindBy(css = "a.logoWrap")
    private WebElement mainPageButton;

    @FindBy(xpath = "//section[@class='basketContent']/div/h1")
    public WebElement cartHeader;

    public String getCartHeader(){
        waitUntilElementIsVisible(cartHeader);
        String cartName = cartHeader.getText();
        return cartName;
    }

    public String getPriceInCart(){
        waitUntilElementIsVisible(price);
        String priceInCart = price.getText();
        return priceInCart;
    }

    public String getInstalmentInCart(){
        waitUntilElementIsVisible(instalment);
        String instalmentInCart = instalment.getText();
        return instalmentInCart;
    }

    public CartPage goToLandingPage(){
        waitUntilElementIsVisible(mainPageButton);
        mainPageButton.click();
        return this;
    }
}
