package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class HomePage extends BasePage{

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
}
