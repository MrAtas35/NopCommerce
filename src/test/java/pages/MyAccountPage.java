package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class MyAccountPage extends ReusableMethods {
    public MyAccountPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement myAccountText;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailField;
}
