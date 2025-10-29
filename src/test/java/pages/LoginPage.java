package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class LoginPage extends ReusableMethods {
    public LoginPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement loginPgText;

    @FindBy(xpath = "//input[@class='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@class='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginBtn;
}
