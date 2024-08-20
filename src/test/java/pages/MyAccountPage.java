package pages;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MyAccountPage {

    public MyAccountPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
