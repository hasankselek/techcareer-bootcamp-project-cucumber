package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;

public class CommonPage {

    public CommonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void checkPageUrl(String pageUrl){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty(pageUrl)));
    }
}
