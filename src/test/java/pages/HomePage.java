package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class HomePage extends BasePage{

    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")
    private WebElement searchBox;

    @FindBy(xpath = "//i[@class='cyrzo7gC']")
    private WebElement buyutec;

    @FindBy(xpath = "//*[text()='ERKEK']")
    public WebElement erkekText;

    @FindBy(xpath = "//p[contains(text(),'Giriş Yap')]")
    public WebElement girisYapButton;

    @FindBy(xpath = "//p[contains(text(),'Hesabım')]")
    public WebElement hesabimText;

    public void setup(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.wait(2);
    }

    public void fillSearchBox(String text){
        searchBox.sendKeys(text);
        ReusableMethods.wait(1);
        buyutec.click();


    }




}
