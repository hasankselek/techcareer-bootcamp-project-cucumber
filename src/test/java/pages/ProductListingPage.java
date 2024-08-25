package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;

import java.util.List;


public class ProductListingPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Marka ara']")
    public WebElement brandSearchBox;

    @FindBy(xpath = "(//a[@class='fltr-item-wrppr'])[3]")
    public WebElement brandBox;

    @FindBy(xpath = "//*[@class='prdct-desc-cntnr-ttl-w']")
    public List<WebElement> productInformationList;

    @FindBy(xpath = "//*[@class='p-card-chldrn-cntnr card-border']")
    public List<WebElement> productList;

    @FindBy(xpath = "//div[@class='select-w']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//*[@class='prc-cntnr discountedPriceBox']")
    public List<WebElement> PriceBox;

    @FindBy(xpath = "(//span[contains(text(),'Kargo Bedava')])")
    public List<WebElement> freeDelivery;

    @FindBy(xpath = "//button[@aria-label='Kargo Bedava']")
    public WebElement kargoBedavaButton;

    @FindBy(xpath = "(//i[@class='fvrt-btn'])[1]")
    public WebElement favButton;


    public void searchProductBrandName(String brandName){
        brandSearchBox.sendKeys(brandName);
        ReusableMethods.wait(2);
        brandBox.click();
        ReusableMethods.wait(1);
    }

    public void verifyCorrectBrandSearchResult(String brandName){
        for(WebElement productInformation : productInformationList){
            Assert.assertTrue(productInformation.getText().contains(brandName));
        }
    }

    public void verifyFreeDelivery(){

        for(WebElement freeDelivery : freeDelivery){
            Assert.assertTrue(freeDelivery.getText().equalsIgnoreCase("KARGO BEDAVA"));
        }
    }

    public void clickFavouriteButton(){

        favButton.click();
    }

    public String getProductInfo(){
        return productInformationList.get(0).getText();
    }










}
