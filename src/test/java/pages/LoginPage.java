package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='base']")
    public WebElement customerLoginText;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement invalidAccountErrorMessage;

    @FindBy(css = "#email-error")
    public WebElement invalidAndEmptyEmailError;

    @FindBy(css = "#pass-error")
    public WebElement emptyPasswordError;

    public void fillEmail(String email){
        emailBox.sendKeys(ConfigReader.getProperty(email));
    }

    public void fillPassword(String password){
        passwordBox.sendKeys(ConfigReader.getProperty(password));
    }

    public void emptyCredentialsErrors(){
        ReusableMethods.verifyElementDisplayed(invalidAndEmptyEmailError);
        ReusableMethods.verifyElementDisplayed(emptyPasswordError);
    }





}
