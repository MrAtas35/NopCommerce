package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class DesktopsPage extends ReusableMethods {
    public DesktopsPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@data-productid='1']/div/h2/a")
    public WebElement buildYourOwnComputer;

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement desktopsTitle;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[2]")
    public WebElement notebooksButton;

    @FindBy(xpath = "(//ul[@class='top-menu notmobile']/li/a)[1]")
    public WebElement computersButton;
}
