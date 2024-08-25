package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailingPage extends BasePage{

    @FindBy(xpath = "//span[@class='product-preview-status-text']")
    public WebElement addToBasketSusccesText;

    @FindBy(xpath = "//div[@class='onboarding-modal-wrapper']//button[contains(text(),'Anladım')]")
    public WebElement anladimButton;



}
