package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;
import utils.ReusableMethods;


public class LoginPage extends BasePage{

    HomePage homePage = new HomePage();

    @FindBy(id = "login-email")
    private WebElement emailBox;

    @FindBy(id = "login-password-input")
    private WebElement passwordBox;

    @FindBy(css = "button[type='submit'] span")
    public WebElement girisYapButton;

    @FindBy(css = "#error-box-wrapper")
    public WebElement errorMessageInfo;

    public void fillEmail(String email) {

        emailBox.sendKeys(ConfigReader.getProperty(email));
    }

    public void fillPassword(String password) {

        passwordBox.sendKeys(ConfigReader.getProperty(password));
    }

    public void login(String username, String password){
        fillEmail(username);

        fillPassword(password);

    }

    public void checkErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = errorMessageInfo.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    public void loginAllSteps(){
        homePage.girisYapButton.click();
        fillEmail("validEmail");
        fillPassword("validPassword");
        girisYapButton.click();
        ReusableMethods.wait(2);
        Assert.assertEquals("Hesabım",homePage.hesabimText.getText());


    }


}