package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Sepetinde ürün bulunmamaktadır.')]")
    public WebElement emptyChartText;

    @FindBy(xpath = "//*[@class='pb-item']")
    public WebElement chartProductName;

    @FindBy(xpath = "//*[@class='pb-basket-item-price']")
    public WebElement chartProductPrice;

    @FindBy(css = "button[aria-label='Ürün adedi arttırma']")
    public WebElement increaseProductQuantity;

    @FindBy(css = "button[aria-label='Ürün adedi azaltma']")
    public WebElement decreaseProductQuantity;

    @FindBy(xpath = "//*[@class='counter-content']")
    public WebElement productQuantity;

    @FindBy(xpath = "//span[normalize-space()='Sil']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Sepet başarıyla güncellendi')]")
    public WebElement suscessMessage;


    public int totalPrice(){
        String price = chartProductPrice.getText().replaceAll("\\D","");
        int priceInt = Integer.parseInt(price);
        return priceInt;
    }






}
