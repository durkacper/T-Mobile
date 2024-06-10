package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartwatchesAndBandsPage extends BasePage{

    public SmartwatchesAndBandsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@data-qa,'LST_ProductCard')]")
    private List<WebElement> listOfDevices;

    public SmartwatchesAndBandsPage goToProductPage(){
        waitUntilListOfElementsIsVisible(listOfDevices);
        for (int i = 0; i < listOfDevices.size(); i++) {
            listOfDevices.get(0).click();
        }
        return this;
    }
}
