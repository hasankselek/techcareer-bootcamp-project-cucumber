package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.JSUtilities;
import utils.ReusableMethods;

public class CreateAccountPage {

    public CreateAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    Faker faker = new Faker();
    FakePasswordGenerator fakePasswordGenerator = new FakePasswordGenerator();

    String fakeName= faker.name().firstName();
    String fakeLastName= faker.name().lastName();
    String fakeEmail= faker.internet().emailAddress();
    String fakePassword = FakePasswordGenerator.generatePassword(10);

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "email_address")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@title='Create an Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alreadyTakenEmailErrorMessage;

    @FindBy(xpath = "//div[@id='email_address-error']")
    public WebElement invalidEmailErrorMessage;

    @FindBy(xpath = "//div[@id='password-confirmation-error']")
    public WebElement mismatchPasswordErrorMessage;


    public void createAccount(){

        JSUtilities.scrollToElement(Driver.getDriver(),createAccountButton);
        firstName.sendKeys(fakeName);
        lastName.sendKeys(fakeLastName);
        email.sendKeys(fakeEmail);
        password.sendKeys(fakePassword);
        confirmPassword.sendKeys(fakePassword);

    }

    public void fillExistingEmail(String existEmail){

        JSUtilities.scrollToElement(Driver.getDriver(),createAccountButton);
        firstName.sendKeys(fakeName);
        lastName.sendKeys(fakeLastName);
        email.sendKeys(ConfigReader.getProperty(existEmail));
        password.sendKeys(fakePassword);
        confirmPassword.sendKeys(fakePassword);

    }

    public void mismatchPassword(){
        JSUtilities.scrollToElement(Driver.getDriver(),createAccountButton);
        firstName.sendKeys(fakeName);
        lastName.sendKeys(fakeLastName);
        email.sendKeys(fakeEmail);
        password.sendKeys(fakePassword);
        confirmPassword.sendKeys("Hasan12345.");
    }









}
