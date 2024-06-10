package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='dt_price_change'])[3]")
    private WebElement price;

    @FindBy(xpath = "(//div[@class='dt_price_change'])[4]")
    private WebElement instalment;

    @FindBy(xpath = "(//button[@data-qa='PRD_AddToBasket'])[2]")
    private WebElement addToCartButton;

    public String getPrice(){
        waitUntilElementIsVisible(price);
        String productPrice = price.getText().substring(0, price.getText().length()-3);
        return productPrice;
    }

    public String getInstalment(){
        waitUntilElementIsVisible(instalment);
        String productInstalment = instalment.getText().substring(0, price.getText().length()-4);
        return productInstalment;
    }

    public ProductPage addToCart(){
        waitUntilElementIsVisible(addToCartButton);
        addToCartButton.click();
        return this;
    }
}
