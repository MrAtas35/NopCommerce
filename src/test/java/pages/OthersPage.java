package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class OthersPage extends ReusableMethods {
    public OthersPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement othersTitle;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    public WebElement apparelBtn;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[7]")
    public WebElement shoesBtn;
}
