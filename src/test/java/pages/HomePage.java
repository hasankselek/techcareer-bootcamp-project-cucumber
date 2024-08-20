package pages;

import io.cucumber.java.en.*;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//ul[@class='header links'])[1]")
    public WebElement customerNameText;

    @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
    public WebElement createAccountButton;




}
