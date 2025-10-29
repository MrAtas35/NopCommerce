package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[2]/div[1]/h2)[1]")
    public WebElement homePageText;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[2]/a")
    public WebElement loginBtn;
}
