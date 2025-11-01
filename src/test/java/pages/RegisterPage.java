package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class RegisterPage extends ReusableMethods {
    public RegisterPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(id = "gender-male")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy (id = "Company")
    public WebElement company;

    @FindBy(id = "Newsletter")
    public WebElement newsletter;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement kayitBtn;

    @FindBy(xpath = "//div[@class='result']")
    public WebElement resultText;
}
